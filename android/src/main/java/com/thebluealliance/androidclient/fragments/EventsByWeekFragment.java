package com.thebluealliance.androidclient.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.view.ViewCompat;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.base.Preconditions;
import com.thebluealliance.androidclient.R;
import com.thebluealliance.androidclient.TbaLogger;
import com.thebluealliance.androidclient.Utilities;
import com.thebluealliance.androidclient.adapters.EventsByWeekFragmentPagerAdapter;
import com.thebluealliance.androidclient.binders.EventTabBinder;
import com.thebluealliance.androidclient.datafeed.status.TBAStatusController;
import com.thebluealliance.androidclient.helpers.FragmentBinder;
import com.thebluealliance.androidclient.models.Event;
import com.thebluealliance.androidclient.models.EventWeekTab;
import com.thebluealliance.androidclient.subscribers.EventTabSubscriber;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

public class EventsByWeekFragment
        extends DatafeedFragment<List<Event>, List<EventWeekTab>, EventTabSubscriber, EventTabBinder> {

    public static final String YEAR = "YEAR", TAB = "tab";

    @Inject FragmentBinder mFragmentBinder;
    @Inject TBAStatusController mStatusController;

    private int mYear;
    private boolean setTabToCurrentWeekOnData = true;
    private int pendingSelectedTab = -1;
    private EventsByWeekFragmentPagerAdapter mFragmentAdapter;
    private ViewPager2 mViewPager;
    private TabLayoutMediator mTabLayoutMediator;

    public static EventsByWeekFragment newInstance(int year, int tab) {
        EventsByWeekFragment f = new EventsByWeekFragment();
        Bundle args = new Bundle();
        args.putInt(YEAR, year);
        args.putInt(TAB, tab);
        f.setArguments(args);
        return f;
    }

    public static EventsByWeekFragment newInstance(int year) {
        EventsByWeekFragment f = new EventsByWeekFragment();
        Bundle args = new Bundle();
        args.putInt(YEAR, year);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TbaLogger.d("EventsByWeekFragment created!");
        mYear = mStatusController.getCurrentCompYear();
        if (savedInstanceState == null && getArguments() != null) {
            // Default to the current year if no year is provided in the arguments
            mYear = getArguments().getInt(YEAR, mYear);
        }
        mBinder.setFragment(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_event_list_fragment_pager, container, false);
        mViewPager = view.findViewById(R.id.event_pager);
        int pageMargin = Utilities.getPixelsFromDp(requireActivity(), 16);
        mViewPager.setPageTransformer(new MarginPageTransformer(pageMargin));
        TabLayout tabs = view.findViewById(R.id.event_pager_tabs);
        ViewCompat.setElevation(tabs, getResources().getDimension(R.dimen.toolbar_elevation));

        mFragmentAdapter = new EventsByWeekFragmentPagerAdapter(this);
        mViewPager.setAdapter(mFragmentAdapter);

        mTabLayoutMediator = new TabLayoutMediator(tabs, mViewPager, (tab, position) -> {
            String label = mFragmentAdapter.getTabs().get(position).getLabel();
            tab.setText(label);
        });
        mTabLayoutMediator.attach();

        if (savedInstanceState == null) {
            setTabToCurrentWeekOnData = true;
        }

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mTabLayoutMediator.detach();
    }

    public void updateLabels(List<EventWeekTab> tabs) {
        if (getView() != null) {
            getView().findViewById(R.id.tabs_progress).setVisibility(View.GONE);
        }
        mFragmentAdapter.setTabs(mYear, tabs);

        if (setTabToCurrentWeekOnData) {
            setPagerWeek();
            mViewPager.setCurrentItem(pendingSelectedTab);
            pendingSelectedTab = -1;
        }
    }

    @Override
    protected void inject() {
        mComponent.inject(this);
    }

    @Override
    protected Observable<List<Event>> getObservable(String tbaCacheHeader) {
        return mDatafeed.fetchEventsInYear(mYear, tbaCacheHeader);
    }

    @Override
    protected String getRefreshTag() {
        return String.format("eventsByWeek_%1$d", mYear);
    }

    /**
     * Set the default selected pager tab
     * If the user isn't viewing this year's events, default to Week 1
     * Otherwise, default to the current week (or the first tab, if past the last week)
     */
    private void setPagerWeek() {
        int currentWeek = Utilities.getCurrentCompWeek();
        int currentYear = Utilities.getCurrentYear();
        int week1Index = getIndexForWeek(1);
        int currentIndex = getIndexForWeek(currentWeek);
        int weekCount = mViewPager.getAdapter().getItemCount();

        if (currentYear != mYear && week1Index > -1) {
            pendingSelectedTab = week1Index;
        } else if (currentIndex < weekCount && currentIndex > -1) {
            pendingSelectedTab = currentIndex;
        } else {
            pendingSelectedTab = 0;
        }
    }

    /**
     * Finds the index in the adapter of the given week.
     * If the week is skipped over, return the next week (assumes sorted adapter items)
     *
     * @return Adapter index containing the week, -1 if not found
     */
    private int getIndexForWeek(int week) {
        Preconditions.checkState(
          mViewPager.getAdapter() instanceof EventsByWeekFragmentPagerAdapter,
          "EventsByWeekFragment must use EventsByWeekFragmentPagerAdapter");
        List<EventWeekTab> tabs = ((EventsByWeekFragmentPagerAdapter) mViewPager.getAdapter())
                .getTabs();
        for (int i = 0; i < tabs.size(); i++) {
            if (tabs.get(i).getWeek() >= week) {
                return i;
            }
        }
        return -1;
    }
}
