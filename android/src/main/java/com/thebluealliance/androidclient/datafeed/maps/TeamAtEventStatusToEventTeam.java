package com.thebluealliance.androidclient.datafeed.maps;

import com.thebluealliance.androidclient.helpers.EventHelper;
import com.thebluealliance.androidclient.helpers.EventTeamHelper;
import com.thebluealliance.androidclient.models.EventTeam;

import rx.functions.Func1;
import thebluealliance.api.model.TeamEventStatus;

public class TeamAtEventStatusToEventTeam implements Func1<TeamEventStatus, EventTeam> {

    private final String teamKey;
    private final String eventKey;

    public TeamAtEventStatusToEventTeam(String teamKey, String eventKey) {
        this.eventKey = eventKey;
        this.teamKey = teamKey;
    }

    @Override
    public EventTeam call(TeamEventStatus teamAtEventStatus) {
        if (teamAtEventStatus == null) return null;
        EventTeam eventTeam = new EventTeam();
        eventTeam.setKey(EventTeamHelper.generateKey(eventKey, teamKey));
        eventTeam.setYear(EventHelper.getYear(eventKey));
        eventTeam.setTeamKey(teamKey);
        eventTeam.setEventKey(eventKey);
        return eventTeam;
    }
}
