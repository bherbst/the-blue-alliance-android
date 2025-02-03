package com.thebluealliance.androidclient.models;

import android.content.ContentValues;

import com.google.gson.Gson;
import com.thebluealliance.androidclient.database.TbaDatabaseModel;
import com.thebluealliance.androidclient.database.tables.EventTeamsTable;
import com.thebluealliance.androidclient.gcm.notifications.NotificationTypes;

import javax.annotation.Nullable;

import thebluealliance.api.model.TeamEventStatus;

public class EventTeam implements TbaDatabaseModel {

    public static final String[] NOTIFICATION_TYPES = {
            NotificationTypes.UPCOMING_MATCH,
            NotificationTypes.MATCH_SCORE,
            NotificationTypes.ALLIANCE_SELECTION,
            //NotificationTypes.AWARDS,
            //NotificationTypes.FINAL_RESULTS
    };

    private String key;
    private String teamKey;
    private String eventKey;
    private Integer year;
    private @Nullable TeamEventStatus status;
    private Long lastModified;

    public EventTeam() {
    }

    @Override
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTeamKey() {
        return teamKey;
    }

    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Nullable public TeamEventStatus getStatus() {
        return status;
    }

    public void setStatus(@Nullable TeamEventStatus status) {
        this.status = status;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public ContentValues getParams(Gson gson) {
        ContentValues params = new ContentValues();
        params.put(EventTeamsTable.KEY, getKey());
        params.put(EventTeamsTable.TEAMKEY, getTeamKey());
        params.put(EventTeamsTable.EVENTKEY, getEventKey());
        params.put(EventTeamsTable.YEAR, getYear());
        params.put(EventTeamsTable.STATUS, status != null ? gson.toJson(status, TeamEventStatus.class) : "");
        params.put(EventTeamsTable.LAST_MODIFIED, getLastModified());
        return params;
    }
}
