package com.thebluealliance.androidclient.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.thebluealliance.androidclient.fragments.EventListFragment;
import com.thebluealliance.androidclient.models.EventWeekTab;

import java.util.ArrayList;
import java.util.List;

public class EventsByWeekFragmentPagerAdapter extends FragmentStateAdapter {

    private int year;
    private List<EventWeekTab> thisYearsWeekTabs;

    public EventsByWeekFragmentPagerAdapter(Fragment parentFragment) {
        super(parentFragment);
        thisYearsWeekTabs = new ArrayList<>(0);
    }

    public void setTabs(int year, List<EventWeekTab> tabs) {
        thisYearsWeekTabs = tabs;
        this.year = year;
        notifyDataSetChanged();
    }

    public List<EventWeekTab> getTabs() {
        return thisYearsWeekTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        EventWeekTab tab = thisYearsWeekTabs.get(position);
        return EventListFragment.newInstance(year, tab.getWeek(), tab.getMonth(), tab.getLabel(), true);
    }

    @Override
    public int getItemCount() {
        return thisYearsWeekTabs.size();
    }
}