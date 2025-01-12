package com.thebluealliance.androidclient.models;


import java.util.List;

import javax.annotation.Nullable;

public class RankingItem {

    private Integer matchesPlayed;
    private Integer dq;
    private Integer rank;
    private List<Double> sortOrders;
    private List<Double> extraStats;
    private String teamKey;

    private @Nullable TeamRecord record;
    private @Nullable Double qualAverage;

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getDq() {
        return dq;
    }

    public void setDq(Integer dq) {
        this.dq = dq;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public List<Double> getSortOrders() {
        return sortOrders;
    }

    public void setSortOrders(List<Double> sortOrders) {
        this.sortOrders = sortOrders;
    }

    public List<Double> getExtraStats() {
        return extraStats;
    }

    public void setExtraStats(List<Double> extraStats) {
        this.extraStats = extraStats;
    }

    public String getTeamKey() {
        return teamKey;
    }

    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    @Nullable public TeamRecord getRecord() {
        return record;
    }

    public void setRecord(@Nullable TeamRecord record) {
        this.record = record;
    }

    @Nullable public Double getQualAverage() {
        return qualAverage;
    }

    public void setQualAverage(@Nullable Double qualAverage) {
        this.qualAverage = qualAverage;
    }

    public static class TeamRecord {
        private Integer wins;
        private Integer losses;
        private Integer ties;

        public Integer getWins() {
            return wins;
        }

        public void setWins(Integer wins) {
            this.wins = wins;
        }

        public Integer getLosses() {
            return losses;
        }

        public void setLosses(Integer losses) {
            this.losses = losses;
        }

        public Integer getTies() {
            return ties;
        }

        public void setTies(Integer ties) {
            this.ties = ties;
        }

        public static String buildRecordString(TeamRecord record) {
            if (record.getWins() == null
                || record.getLosses() == null
                || record.getTies() == null) {
                return "";
            }
            return String.valueOf(record.getWins())
                   + "-"
                   + record.getLosses()
                   + "-"
                   + record.getTies();
        }

        public static boolean isEmpty(@Nullable TeamRecord record) {
            if (record == null
                || record.getWins() == null
                || record.getLosses() == null
                || record.getTies() == null) {
                return true;
            }

            return record.getWins() == 0
                    && record.getLosses() == 0
                    && record.getTies() == 0;
        }
    }
}
