package com.thebluealliance.androidclient.models;

import android.content.res.Resources;

import com.thebluealliance.androidclient.R;
import com.thebluealliance.androidclient.interfaces.RenderableModel;
import com.thebluealliance.androidclient.listitems.DistrictTeamListElement;
import com.thebluealliance.androidclient.listitems.LabelValueListItem;
import com.thebluealliance.androidclient.listitems.ListElement;
import com.thebluealliance.androidclient.renderers.DistrictPointBreakdownRenderer;
import com.thebluealliance.androidclient.renderers.ModelRendererSupplier;
import com.thebluealliance.androidclient.types.ModelType;

public class DistrictPointBreakdown implements RenderableModel {

    private Integer qualPoints, elimPoints, alliancePoints, awardPoints, total;
    private String teamKey, districtKey, teamName, eventKey;
    private Integer rank;
    private Boolean districtCmp;

    public DistrictPointBreakdown() {
        this.qualPoints = -1;
        this.elimPoints = -1;
        this.alliancePoints = -1;
        this.awardPoints = -1;
        this.total = -1;
        rank = -1;
    }

    public Integer getQualPoints() {
        return qualPoints;
    }

    public void setQualPoints(Integer qualPoints) {
        this.qualPoints = qualPoints;
    }

    public Integer getElimPoints() {
        return elimPoints;
    }

    public void setElimPoints(Integer elimPoints) {
        this.elimPoints = elimPoints;
    }

    public Integer getAlliancePoints() {
        return alliancePoints;
    }

    public void setAlliancePoints(Integer alliancePoints) {
        this.alliancePoints = alliancePoints;
    }

    public Integer getAwardPoints() {
        return awardPoints;
    }

    public void setAwardPoints(Integer awardPoints) {
        this.awardPoints = awardPoints;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getTeamKey() {
        return teamKey;
    }

    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    public String getDistrictKey() {
        return districtKey;
    }

    public void setDistrictKey(String districtKey) {
        this.districtKey = districtKey;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getDistrictCmp() {
        return districtCmp;
    }

    public void setDistrictCmp(Boolean districtCmp) {
        this.districtCmp = districtCmp;
    }

    public RenderableModel renderQualPoints(Resources resources) {
        return new BreakdownItem(
          resources.getString(R.string.district_qual_points),
          String.format(resources.getString(R.string.district_points_format), qualPoints));
    }

    public RenderableModel renderElimPoints(Resources resources) {
        return new BreakdownItem(
          resources.getString(R.string.district_elim_points),
          String.format(resources.getString(R.string.district_points_format), elimPoints));
    }

    public RenderableModel renderAlliancePoints(Resources resources) {
        return new BreakdownItem(
          resources.getString(R.string.district_alliance_points),
          String.format(resources.getString(R.string.district_points_format), alliancePoints));
    }

    public RenderableModel renderAwardPoints(Resources resources) {
        return new BreakdownItem(
          resources.getString(R.string.district_award_points),
          String.format(resources.getString(R.string.district_points_format), awardPoints));
    }

    public RenderableModel renderTotalPoints(Resources resources) {
        return new BreakdownItem(resources.getString(R.string.total_district_points),
          String.format(resources.getString(R.string.district_points_format), total));
    }

   @Override
    public DistrictTeamListElement render(ModelRendererSupplier supplier) {
        DistrictPointBreakdownRenderer renderer =
          (DistrictPointBreakdownRenderer)supplier.getRendererForType(ModelType.DISTRICTPOINTS);
        return renderer != null ? renderer.renderFromModel(this, null) : null;
    }

    private class BreakdownItem implements RenderableModel {

        private String key, value;

        public BreakdownItem(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public ListElement render(ModelRendererSupplier supplier) {
            return new LabelValueListItem(key, value);
        }
    }
}
