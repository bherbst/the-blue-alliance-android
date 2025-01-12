package com.thebluealliance.androidclient.models;

import com.thebluealliance.androidclient.models.EventAlliance.AllianceBackup;
import com.thebluealliance.androidclient.models.RankingItem.TeamRecord;

import java.util.List;

import javax.annotation.Nullable;

public class TeamAtEventStatus {

    private String allianceStatusStr;
    private String overallStatusStr;
    private String playoffStatusStr;

    private @Nullable TeamAtEventAlliance alliance;
    private @Nullable TeamAtEventPlayoff playoff;
    private @Nullable TeamAtEventQual qual;
    private @Nullable Long lastModified;

    public String getAllianceStatusStr() {
        return allianceStatusStr;
    }

    public void setAllianceStatusStr(String allianceStatusStr) {
        this.allianceStatusStr = allianceStatusStr;
    }

    public String getOverallStatusStr() {
        return overallStatusStr;
    }

    public void setOverallStatusStr(String overallStatusStr) {
        this.overallStatusStr = overallStatusStr;
    }

    public String getPlayoffStatusStr() {
        return playoffStatusStr;
    }

    public void setPlayoffStatusStr(String playoffStatusStr) {
        this.playoffStatusStr = playoffStatusStr;
    }

    @Nullable public TeamAtEventAlliance getAlliance() {
        return alliance;
    }

    public void setAlliance(@Nullable TeamAtEventAlliance alliance) {
        this.alliance = alliance;
    }

    @Nullable public TeamAtEventPlayoff getPlayoff() {
        return playoff;
    }

    public void setPlayoff(@Nullable TeamAtEventPlayoff playoff) {
        this.playoff = playoff;
    }

    @Nullable public TeamAtEventQual getQual() {
        return qual;
    }

    public void setQual(@Nullable TeamAtEventQual qual) {
        this.qual = qual;
    }

    @Nullable public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(@Nullable Long lastModified) {
        this.lastModified = lastModified;
    }

    public static class TeamAtEventAlliance {
        private String name;
        private Integer number;
        private Integer pick;

        private @Nullable AllianceBackup backup;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public Integer getPick() {
            return pick;
        }

        public void setPick(Integer pick) {
            this.pick = pick;
        }

        @Nullable public AllianceBackup getBackup() {
            return backup;
        }

        public void setBackup(@Nullable AllianceBackup backup) {
            this.backup = backup;
        }
    }

    public static class TeamAtEventPlayoff {
        private String level;
        private String status;

        private @Nullable TeamRecord currentLevelRecord;
        private @Nullable TeamRecord record;
        private @Nullable Double playoffAverage;

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Nullable public TeamRecord getCurrentLevelRecord() {
            return currentLevelRecord;
        }

        public void setCurrentLevelRecord(@Nullable TeamRecord currentLevelRecord) {
            this.currentLevelRecord = currentLevelRecord;
        }

        @Nullable public TeamRecord getRecord() {
            return record;
        }

        public void setRecord(@Nullable TeamRecord record) {
            this.record = record;
        }

        @Nullable public Double getPlayoffAverage() {
            return playoffAverage;
        }

        public void setPlayoffAverage(@Nullable Double playoffAverage) {
            this.playoffAverage = playoffAverage;
        }
    }

    public static class TeamAtEventQual {
        private RankingItem ranking;
        private List<RankingSortOrder> sortOrderInfo;
        private Integer numTeams;
        private String status;

        @Nullable public RankingItem getRanking() {
            return ranking;
        }

        public void setRanking(RankingItem ranking) {
            this.ranking = ranking;
        }

        public List<RankingSortOrder> getSortOrderInfo() {
            return sortOrderInfo;
        }

        public void setSortOrderInfo(List<RankingSortOrder> sortOrderInfo) {
            this.sortOrderInfo = sortOrderInfo;
        }

        public Integer getNumTeams() {
            return numTeams;
        }

        public void setNumTeams(Integer numTeams) {
            this.numTeams = numTeams;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
