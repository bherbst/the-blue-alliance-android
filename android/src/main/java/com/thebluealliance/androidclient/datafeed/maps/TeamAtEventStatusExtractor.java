package com.thebluealliance.androidclient.datafeed.maps;

import com.thebluealliance.androidclient.models.EventTeam;

import rx.functions.Func1;
import thebluealliance.api.model.TeamEventStatus;

public class TeamAtEventStatusExtractor implements Func1<EventTeam, TeamEventStatus> {
    @Override
    public TeamEventStatus call(EventTeam eventTeam) {
        if (eventTeam == null) return null;
        return eventTeam.getStatus();
    }
}
