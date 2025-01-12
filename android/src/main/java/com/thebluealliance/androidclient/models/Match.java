package com.thebluealliance.androidclient.models;

import android.content.ContentValues;
import android.content.res.Resources;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.thebluealliance.androidclient.database.TbaDatabaseModel;
import com.thebluealliance.androidclient.database.tables.MatchesTable;
import com.thebluealliance.androidclient.gcm.notifications.NotificationTypes;
import com.thebluealliance.androidclient.interfaces.RenderableModel;
import com.thebluealliance.androidclient.listitems.ListElement;
import com.thebluealliance.androidclient.renderers.MatchRenderer;
import com.thebluealliance.androidclient.renderers.ModelRendererSupplier;
import com.thebluealliance.androidclient.types.MatchType;
import com.thebluealliance.androidclient.types.ModelType;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import androidx.annotation.NonNull;


public class Match implements TbaDatabaseModel, RenderableModel<Match> {

    public static final String[] NOTIFICATION_TYPES = {
            NotificationTypes.UPCOMING_MATCH,
            NotificationTypes.MATCH_SCORE,
            NotificationTypes.MATCH_VIDEO,
    };

    private String key;
    private String eventKey;
    private String compLevel;
    private Integer matchNumber;
    private Integer setNumber;

    private @Nullable MatchAlliancesContainer alliances;
    private @Nullable String scoreBreakdown;
    private @Nullable List<MatchVideo> videos;
    private @Nullable Long time;
    private @Nullable Long actualTime;
    private @Nullable String winningAlliance;
    private @Nullable Long lastModified;

    // Other variables
    private String selectedTeam;

    public static String[] getNotificationTypes() {
        return NOTIFICATION_TYPES;
    }

    @Override public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getCompLevel() {
        return compLevel;
    }

    public void setCompLevel(String compLevel) {
        this.compLevel = compLevel;
    }

    public Integer getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(Integer matchNumber) {
        this.matchNumber = matchNumber;
    }

    public Integer getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(Integer setNumber) {
        this.setNumber = setNumber;
    }

    @Nullable public MatchAlliancesContainer getAlliances() {
        return alliances;
    }

    public void setAlliances(@Nullable MatchAlliancesContainer alliances) {
        this.alliances = alliances;
    }

    @Nullable public String getScoreBreakdown() {
        return scoreBreakdown;
    }

    public void setScoreBreakdown(@Nullable String scoreBreakdown) {
        this.scoreBreakdown = scoreBreakdown;
    }

    @Nullable public List<MatchVideo> getVideos() {
        return videos;
    }

    public void setVideos(@Nullable List<MatchVideo> videos) {
        this.videos = videos;
    }

    @Nullable public Long getTime() {
        return time;
    }

    public void setTime(@Nullable Long time) {
        this.time = time;
    }

    @Nullable public Long getActualTime() {
        return actualTime;
    }

    public void setActualTime(@Nullable Long actualTime) {
        this.actualTime = actualTime;
    }

    @Nullable public String getWinningAlliance() {
        return winningAlliance;
    }

    public void setWinningAlliance(@Nullable String winningAlliance) {
        this.winningAlliance = winningAlliance;
    }

    @Override @Nullable public Long getLastModified() {
        return lastModified;
    }

    @Override public void setLastModified(@Nullable Long lastModified) {
        this.lastModified = lastModified;
    }

    public MatchType getType() {
        return MatchType.fromKey(getKey());
    }

    public String getTitle(Resources resources, boolean lineBreak) {
        int matchNumber = getMatchNumber();
        int setNumber = getSetNumber();
        MatchType matchType = getType();
        if (matchType == MatchType.QUAL) {
            return resources.getString(matchType.getTypeName()) + (lineBreak ? "\n" : " ") + matchNumber;
        } else {
            return resources.getString(matchType.getTypeName()) + (lineBreak ? "\n" : " ")
                   + setNumber + " - " + matchNumber;
        }
    }

    public String getTitle(Resources resources) {
        return getTitle(resources, false);
    }

    public Integer getDisplayOrder() {
        int matchNumber = getMatchNumber(),
                setNumber = getSetNumber();
        return getType().getPlayOrder() * 1000000 + setNumber * 1000 + matchNumber;
    }

    public Integer getPlayOrder() {
        int matchNumber = getMatchNumber(),
                setNumber = getSetNumber();
        return getType().getPlayOrder() * 1000000 + matchNumber * 1000 + setNumber;
    }

    public int getYear() {
        return Integer.parseInt(getKey().substring(0, 4));
    }

    public String getSelectedTeam() {
        return selectedTeam;
    }

    public void setSelectedTeam(String selectedTeam) {
        this.selectedTeam = selectedTeam;
    }

    public boolean didSelectedTeamWin() {
        if (selectedTeam.isEmpty() || alliances == null || winningAlliance == null || winningAlliance.isEmpty()) {
            return false;
        }

        if ("red".equals(winningAlliance)) {
            return getRedTeams(alliances).contains(selectedTeam);
        } else if ("blue".equals(winningAlliance)) {
            return getBlueTeams(alliances).contains(selectedTeam);
        } else {
            return false;
        }
    }

    public static Integer getRedScore(MatchAlliancesContainer alliances) {
        return alliances.getRed().getScore();
    }

    public static Integer getBlueScore(MatchAlliancesContainer alliances) {
        return alliances.getBlue().getScore();
    }

    public static List<String> getRedTeams(MatchAlliancesContainer alliances) {
        return alliances.getRed().getTeamKeys();
    }

    public static List<String> getBlueTeams(MatchAlliancesContainer alliances) {
        return alliances.getBlue().getTeamKeys();
    }

    /** @return team keys from {@link #getRedTeams} or {@link #getBlueTeams}. */
    @NonNull
    public static ArrayList<String> teamKeys(JsonArray teamsJson) {
        ArrayList<String> teamKeys = new ArrayList<>(teamsJson.size());

        for (JsonElement key : teamsJson) {
            teamKeys.add(key.getAsString());
        }
        return teamKeys;
    }

    /** @return team number strings from {@link #getRedTeams} or {@link #getBlueTeams}. */
    @NonNull
    public static ArrayList<String> teamNumbers(List<String> teamKeys) {
        ArrayList<String> teamNumbers = new ArrayList<>(teamKeys.size());

        for (String key : teamKeys) {
            teamNumbers.add(key.replace("frc", ""));
        }
        return teamNumbers;
    }

    public void addToRecord(String teamKey, int[] currentRecord /* {win, loss, tie} */) {
        if (alliances == null || alliances.getBlue() == null || alliances.getRed() == null) {
            return;
        }
        List<String> redTeams = getRedTeams(alliances),
                     blueTeams = getBlueTeams(alliances);
        int redScore = getRedScore(alliances),
            blueScore = getBlueScore(alliances);

        if (hasBeenPlayed(redScore, blueScore)) {
            if (redTeams.contains(teamKey)) {
                if ("red".equals(winningAlliance)) {
                    currentRecord[0]++;
                } else if ("blue".equals(winningAlliance)) {
                    currentRecord[1]++;
                } else {
                    currentRecord[2]++;
                }
            } else if (blueTeams.contains(teamKey)) {
                if ("blue".equals(winningAlliance)) {
                    currentRecord[0]++;
                } else if ("red".equals(winningAlliance)) {
                    currentRecord[1]++;
                } else {
                    currentRecord[2]++;
                }
            }
        }
    }

    private boolean hasBeenPlayed(int redScore, int blueScore) {
        return redScore >= 0 && blueScore >= 0;
    }

    public boolean hasBeenPlayed() {
        int redScore = getRedScore(alliances);
        int blueScore = getBlueScore(alliances);

        return redScore >= 0 && blueScore >= 0;
    }

    @Override
    public ContentValues getParams(Gson gson) {
        ContentValues data = new ContentValues();
        data.put(MatchesTable.KEY, getKey());
        data.put(MatchesTable.MATCHNUM, getMatchNumber());
        data.put(MatchesTable.SETNUM, getSetNumber());
        data.put(MatchesTable.EVENT, getEventKey());
        data.put(MatchesTable.TIME, getTime());
        data.put(MatchesTable.ALLIANCES, gson.toJson(alliances, MatchAlliancesContainer.class)); // TODO bherbst come back here
        data.put(MatchesTable.WINNER, getWinningAlliance());
        data.put(MatchesTable.VIDEOS, gson.toJson(videos, new TypeToken<List<MatchVideo>>(){}.getType())); // TODO bherbst come back here
        data.put(MatchesTable.BREAKDOWN, getScoreBreakdown());
        data.put(MatchesTable.LAST_MODIFIED, getLastModified());
        return data;
    }

    @Override
    public ListElement render(ModelRendererSupplier rendererSupplier) {
        MatchRenderer renderer = (MatchRenderer)rendererSupplier.getRendererForType(ModelType.MATCH);
        if (renderer == null) {
            return null;
        }
        return renderer.renderFromModel(this, MatchRenderer.RENDER_DEFAULT);

    }

    public static class MatchVideo {
        private String key;
        private String type;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Media asMedia() {
            Media media = new Media();
            media.setForeignKey(getKey());
            media.setType(getType());
            return media;
        }
    }
}
