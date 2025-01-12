package com.thebluealliance.androidclient.models;

import com.google.gson.Gson;
import com.thebluealliance.androidclient.types.EventDetailType;

import java.util.List;

import javax.annotation.Nullable;

public class RankingResponseObject {

    private List<RankingItem> rankings;
    private List<RankingSortOrder> sortOrderInfo;
    private List<RankingSortOrder> extraStatsInfo;
    private String eventKey;

    private @Nullable Long lastModified;

    public List<RankingItem> getRankings() {
        return rankings;
    }

    public void setRankings(List<RankingItem> rankings) {
        this.rankings = rankings;
    }

    public List<RankingSortOrder> getSortOrderInfo() {
        return sortOrderInfo;
    }

    public void setSortOrderInfo(List<RankingSortOrder> sortOrderInfo) {
        this.sortOrderInfo = sortOrderInfo;
    }

    @Nullable
    public List<RankingSortOrder> getExtraStatsInfo() {
        return extraStatsInfo;
    }

    public void setExtraStatsInfo(List<RankingSortOrder> extraStatsInfo) {
        this.extraStatsInfo = extraStatsInfo;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Nullable public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(@Nullable Long lastModified) {
        this.lastModified = lastModified;
    }

    public EventDetail toEventDetail(Gson gson) {
        EventDetail eventDetail = new EventDetail(eventKey, EventDetailType.RANKINGS);
        String rankingJson = gson.toJson(this, RankingResponseObject.class);
        eventDetail.setJsonData(rankingJson);
        eventDetail.setLastModified(lastModified);
        return eventDetail;
    }
}
