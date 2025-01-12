package com.thebluealliance.androidclient.models;

import android.content.ContentValues;

import com.google.gson.Gson;
import com.thebluealliance.androidclient.database.TbaDatabaseModel;
import com.thebluealliance.androidclient.database.tables.DistrictTeamsTable;

import java.util.List;

import javax.annotation.Nullable;

public class DistrictRanking implements TbaDatabaseModel {

    private String key;
    private String districtKey;

    private Integer pointTotal;
    private Integer rank;
    private Integer rookieBonus;
    private String teamKey;
    private @Nullable List<DistrictPointBreakdown> eventPoints;
    private @Nullable Long lastModified;

    @Override public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDistrictKey() {
        return districtKey;
    }

    public void setDistrictKey(String districtKey) {
        this.districtKey = districtKey;
    }

    public Integer getPointTotal() {
        return pointTotal;
    }

    public void setPointTotal(Integer pointTotal) {
        this.pointTotal = pointTotal;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getRookieBonus() {
        return rookieBonus;
    }

    public void setRookieBonus(Integer rookieBonus) {
        this.rookieBonus = rookieBonus;
    }

    public String getTeamKey() {
        return teamKey;
    }

    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    @Nullable
    public List<DistrictPointBreakdown> getEventPoints() {
        return eventPoints;
    }

    public void setEventPoints(@Nullable List<DistrictPointBreakdown> eventPoints) {
        this.eventPoints = eventPoints;
    }

    @Override @Nullable
    public Long getLastModified() {
        return lastModified;
    }

    @Override
    public void setLastModified(@Nullable Long lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public ContentValues getParams(Gson gson) {
        ContentValues params = new ContentValues();

        @Nullable DistrictPointBreakdown event1 = eventPoints != null && eventPoints.size() >= 1
                ? eventPoints.get(0)
                : null;
        @Nullable DistrictPointBreakdown event2 = eventPoints != null && eventPoints.size() >= 2
                ? eventPoints.get(1)
                : null;
        @Nullable DistrictPointBreakdown event3 = eventPoints != null && eventPoints.size() >= 3
                ? eventPoints.get(2)
                : null;

        params.put(DistrictTeamsTable.KEY, getKey());
        params.put(DistrictTeamsTable.TEAM_KEY, getTeamKey());
        params.put(DistrictTeamsTable.DISTRICT_KEY, getDistrictKey());
        params.put(DistrictTeamsTable.RANK, getRank());
        params.put(DistrictTeamsTable.EVENT1_KEY, event1 != null ? event1.getEventKey() : "");
        params.put(DistrictTeamsTable.EVENT1_POINTS, gson.toJson(event1, DistrictPointBreakdown.class)); // TODO bherbst come back to this
        params.put(DistrictTeamsTable.EVENT2_KEY, event2 != null ? event2.getEventKey() : "");
        params.put(DistrictTeamsTable.EVENT2_POINTS, gson.toJson(event2, DistrictPointBreakdown.class)); // TODO bherbst come back to this
        params.put(DistrictTeamsTable.CMP_KEY, event3 != null ? event3.getEventKey() : "");
        params.put(DistrictTeamsTable.CMP_POINTS, gson.toJson(event3, DistrictPointBreakdown.class)); // TODO bherbst come back to this
        params.put(DistrictTeamsTable.ROOKIE_POINTS, getRookieBonus());
        params.put(DistrictTeamsTable.TOTAL_POINTS, getPointTotal());
        params.put(DistrictTeamsTable.LAST_MODIFIED, getLastModified());
        return params;
    }
}
