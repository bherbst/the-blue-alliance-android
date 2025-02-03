package com.thebluealliance.androidclient.datafeed.combiners;

import com.thebluealliance.androidclient.models.Event;
import com.thebluealliance.androidclient.models.Team;
import com.thebluealliance.androidclient.subscribers.TeamAtEventSummarySubscriber;

import rx.functions.Func3;
import thebluealliance.api.model.TeamEventStatus;

public class TeamAtEventSummaryCombiner implements Func3<TeamEventStatus, Event, Team, TeamAtEventSummarySubscriber.Model> {
    @Override
    public TeamAtEventSummarySubscriber.Model call(TeamEventStatus teamAtEventStatus, Event event, Team team) {
        return new TeamAtEventSummarySubscriber.Model(teamAtEventStatus, event, team);
    }
}
