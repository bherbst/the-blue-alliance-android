package com.thebluealliance.androidclient.models;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.thebluealliance.androidclient.models.TeamAtEventStatus.TeamAtEventPlayoff;
import com.thebluealliance.androidclient.types.EventDetailType;

import java.util.List;

import javax.annotation.Nullable;

public class EventAlliance {

    private List<String> picks;
    private @Nullable String eventKey;
    private @Nullable List<String> declines;
    private @Nullable String name;
    private @Nullable AllianceBackup backup;
    private @Nullable Long lastModified;
    private @Nullable TeamAtEventPlayoff status;

    @Nullable public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    public List<String> getPicks() {
        return picks;
    }

    public void setPicks(List<String> picks) {
        this.picks = picks;
    }

    @Nullable public List<String> getDeclines() {
        return declines;
    }

    public void setDeclines(@Nullable List<String> declines) {
        this.declines = declines;
    }

    @Nullable
    public AllianceBackup getBackup() {
        return backup;
    }

    public void setBackup(@Nullable AllianceBackup backup) {
        this.backup = backup;
    }

    @Nullable public TeamAtEventPlayoff getStatus() {
        return status;
    }

    public void setStatus(@Nullable TeamAtEventPlayoff status) {
        this.status = status;
    }

    public @Nullable String getEventKey() {
        return eventKey;
    }

    public void setEventKey(@Nullable String eventKey) {
        this.eventKey = eventKey;
    }

    @Nullable public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(@Nullable Long lastModified) {
        this.lastModified = lastModified;
    }

    public static EventDetail toEventDetail(List<EventAlliance> alliances,
                                            String eventKey,
                                            Gson gson) {
        if (alliances == null) return null;
        JsonArray allianceArray = new JsonArray();
        for (int i = 0; i < alliances.size(); i++) {
            EventAlliance alliance = alliances.get(i);
            allianceArray.add(gson.toJsonTree(alliance, EventAlliance.class));
        }

        EventDetail eventDetail = new EventDetail(eventKey, EventDetailType.ALLIANCES);
        eventDetail.setJsonData(allianceArray.toString());
        return eventDetail;
    }

    public static class AllianceBackup  {
        private String in;
        private String out;

        public String getIn() {
            return in;
        }

        public void setIn(String in) {
            this.in = in;
        }

        public String getOut() {
            return out;
        }

        public void setOut(String out) {
            this.out = out;
        }
    }
}
