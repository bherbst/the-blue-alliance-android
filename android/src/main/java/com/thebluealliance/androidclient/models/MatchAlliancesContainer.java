package com.thebluealliance.androidclient.models;

import java.util.List;

import javax.annotation.Nullable;

public class MatchAlliancesContainer {

    private MatchAlliance red;
    private MatchAlliance blue;

    public MatchAlliance getRed() {
        return red;
    }

    public void setRed(MatchAlliance red) {
        this.red = red;
    }

    public MatchAlliance getBlue() {
        return blue;
    }

    public void setBlue(MatchAlliance blue) {
        this.blue = blue;
    }

    public static class MatchAlliance {
        private Integer score;
        private List<String> teamKeys;
        private @Nullable List<String> surrogateTeamKeys;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        @Nullable public List<String> getSurrogateTeamKeys() {
            return surrogateTeamKeys;
        }

        public void setSurrogateTeamKeys(@Nullable List<String> surrogateTeamKeys) {
            this.surrogateTeamKeys = surrogateTeamKeys;
        }

        public List<String> getTeamKeys() {
            return teamKeys;
        }

        public void setTeamKeys(List<String> teamKeys) {
            this.teamKeys = teamKeys;
        }

    }
}
