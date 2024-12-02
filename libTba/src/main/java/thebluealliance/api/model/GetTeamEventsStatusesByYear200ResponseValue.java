/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).
 *
 * The version of the OpenAPI document: 3.9.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package thebluealliance.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import thebluealliance.api.model.TeamEventStatus;
import thebluealliance.api.model.TeamEventStatusAlliance;
import thebluealliance.api.model.TeamEventStatusPlayoff;
import thebluealliance.api.model.TeamEventStatusRank;

/**
 * GetTeamEventsStatusesByYear200ResponseValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T08:29:12.737004100-06:00[America/Chicago]", comments = "Generator version: 7.10.0")
public class GetTeamEventsStatusesByYear200ResponseValue {
  public static final String SERIALIZED_NAME_QUAL = "qual";
  @SerializedName(SERIALIZED_NAME_QUAL)
  @javax.annotation.Nullable
  private TeamEventStatusRank qual;

  public static final String SERIALIZED_NAME_ALLIANCE = "alliance";
  @SerializedName(SERIALIZED_NAME_ALLIANCE)
  @javax.annotation.Nullable
  private TeamEventStatusAlliance alliance;

  public static final String SERIALIZED_NAME_PLAYOFF = "playoff";
  @SerializedName(SERIALIZED_NAME_PLAYOFF)
  @javax.annotation.Nullable
  private TeamEventStatusPlayoff playoff;

  public static final String SERIALIZED_NAME_ALLIANCE_STATUS_STR = "alliance_status_str";
  @SerializedName(SERIALIZED_NAME_ALLIANCE_STATUS_STR)
  @javax.annotation.Nullable
  private String allianceStatusStr;

  public static final String SERIALIZED_NAME_PLAYOFF_STATUS_STR = "playoff_status_str";
  @SerializedName(SERIALIZED_NAME_PLAYOFF_STATUS_STR)
  @javax.annotation.Nullable
  private String playoffStatusStr;

  public static final String SERIALIZED_NAME_OVERALL_STATUS_STR = "overall_status_str";
  @SerializedName(SERIALIZED_NAME_OVERALL_STATUS_STR)
  @javax.annotation.Nullable
  private String overallStatusStr;

  public static final String SERIALIZED_NAME_NEXT_MATCH_KEY = "next_match_key";
  @SerializedName(SERIALIZED_NAME_NEXT_MATCH_KEY)
  @javax.annotation.Nullable
  private String nextMatchKey;

  public static final String SERIALIZED_NAME_LAST_MATCH_KEY = "last_match_key";
  @SerializedName(SERIALIZED_NAME_LAST_MATCH_KEY)
  @javax.annotation.Nullable
  private String lastMatchKey;

  public GetTeamEventsStatusesByYear200ResponseValue() {
  }

  public GetTeamEventsStatusesByYear200ResponseValue qual(@javax.annotation.Nullable TeamEventStatusRank qual) {
    
    this.qual = qual;
    return this;
  }

  /**
   * Get qual
   * @return qual
   */
  @javax.annotation.Nullable

  public TeamEventStatusRank getQual() {
    return qual;
  }


  public void setQual(@javax.annotation.Nullable TeamEventStatusRank qual) {
    this.qual = qual;
  }

  public GetTeamEventsStatusesByYear200ResponseValue alliance(@javax.annotation.Nullable TeamEventStatusAlliance alliance) {
    
    this.alliance = alliance;
    return this;
  }

  /**
   * Get alliance
   * @return alliance
   */
  @javax.annotation.Nullable

  public TeamEventStatusAlliance getAlliance() {
    return alliance;
  }


  public void setAlliance(@javax.annotation.Nullable TeamEventStatusAlliance alliance) {
    this.alliance = alliance;
  }

  public GetTeamEventsStatusesByYear200ResponseValue playoff(@javax.annotation.Nullable TeamEventStatusPlayoff playoff) {
    
    this.playoff = playoff;
    return this;
  }

  /**
   * Get playoff
   * @return playoff
   */
  @javax.annotation.Nullable

  public TeamEventStatusPlayoff getPlayoff() {
    return playoff;
  }


  public void setPlayoff(@javax.annotation.Nullable TeamEventStatusPlayoff playoff) {
    this.playoff = playoff;
  }

  public GetTeamEventsStatusesByYear200ResponseValue allianceStatusStr(@javax.annotation.Nullable String allianceStatusStr) {
    
    this.allianceStatusStr = allianceStatusStr;
    return this;
  }

  /**
   * An HTML formatted string suitable for display to the user containing the team&#39;s alliance pick status.
   * @return allianceStatusStr
   */
  @javax.annotation.Nullable

  public String getAllianceStatusStr() {
    return allianceStatusStr;
  }


  public void setAllianceStatusStr(@javax.annotation.Nullable String allianceStatusStr) {
    this.allianceStatusStr = allianceStatusStr;
  }

  public GetTeamEventsStatusesByYear200ResponseValue playoffStatusStr(@javax.annotation.Nullable String playoffStatusStr) {
    
    this.playoffStatusStr = playoffStatusStr;
    return this;
  }

  /**
   * An HTML formatter string suitable for display to the user containing the team&#39;s playoff status.
   * @return playoffStatusStr
   */
  @javax.annotation.Nullable

  public String getPlayoffStatusStr() {
    return playoffStatusStr;
  }


  public void setPlayoffStatusStr(@javax.annotation.Nullable String playoffStatusStr) {
    this.playoffStatusStr = playoffStatusStr;
  }

  public GetTeamEventsStatusesByYear200ResponseValue overallStatusStr(@javax.annotation.Nullable String overallStatusStr) {
    
    this.overallStatusStr = overallStatusStr;
    return this;
  }

  /**
   * An HTML formatted string suitable for display to the user containing the team&#39;s overall status summary of the event.
   * @return overallStatusStr
   */
  @javax.annotation.Nullable

  public String getOverallStatusStr() {
    return overallStatusStr;
  }


  public void setOverallStatusStr(@javax.annotation.Nullable String overallStatusStr) {
    this.overallStatusStr = overallStatusStr;
  }

  public GetTeamEventsStatusesByYear200ResponseValue nextMatchKey(@javax.annotation.Nullable String nextMatchKey) {
    
    this.nextMatchKey = nextMatchKey;
    return this;
  }

  /**
   * TBA match key for the next match the team is scheduled to play in at this event, or null.
   * @return nextMatchKey
   */
  @javax.annotation.Nullable

  public String getNextMatchKey() {
    return nextMatchKey;
  }


  public void setNextMatchKey(@javax.annotation.Nullable String nextMatchKey) {
    this.nextMatchKey = nextMatchKey;
  }

  public GetTeamEventsStatusesByYear200ResponseValue lastMatchKey(@javax.annotation.Nullable String lastMatchKey) {
    
    this.lastMatchKey = lastMatchKey;
    return this;
  }

  /**
   * TBA match key for the last match the team played in at this event, or null.
   * @return lastMatchKey
   */
  @javax.annotation.Nullable

  public String getLastMatchKey() {
    return lastMatchKey;
  }


  public void setLastMatchKey(@javax.annotation.Nullable String lastMatchKey) {
    this.lastMatchKey = lastMatchKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTeamEventsStatusesByYear200ResponseValue getTeamEventsStatusesByYear200ResponseValue = (GetTeamEventsStatusesByYear200ResponseValue) o;
    return Objects.equals(this.qual, getTeamEventsStatusesByYear200ResponseValue.qual) &&
        Objects.equals(this.alliance, getTeamEventsStatusesByYear200ResponseValue.alliance) &&
        Objects.equals(this.playoff, getTeamEventsStatusesByYear200ResponseValue.playoff) &&
        Objects.equals(this.allianceStatusStr, getTeamEventsStatusesByYear200ResponseValue.allianceStatusStr) &&
        Objects.equals(this.playoffStatusStr, getTeamEventsStatusesByYear200ResponseValue.playoffStatusStr) &&
        Objects.equals(this.overallStatusStr, getTeamEventsStatusesByYear200ResponseValue.overallStatusStr) &&
        Objects.equals(this.nextMatchKey, getTeamEventsStatusesByYear200ResponseValue.nextMatchKey) &&
        Objects.equals(this.lastMatchKey, getTeamEventsStatusesByYear200ResponseValue.lastMatchKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(qual, alliance, playoff, allianceStatusStr, playoffStatusStr, overallStatusStr, nextMatchKey, lastMatchKey);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTeamEventsStatusesByYear200ResponseValue {\n");
    sb.append("    qual: ").append(toIndentedString(qual)).append("\n");
    sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
    sb.append("    playoff: ").append(toIndentedString(playoff)).append("\n");
    sb.append("    allianceStatusStr: ").append(toIndentedString(allianceStatusStr)).append("\n");
    sb.append("    playoffStatusStr: ").append(toIndentedString(playoffStatusStr)).append("\n");
    sb.append("    overallStatusStr: ").append(toIndentedString(overallStatusStr)).append("\n");
    sb.append("    nextMatchKey: ").append(toIndentedString(nextMatchKey)).append("\n");
    sb.append("    lastMatchKey: ").append(toIndentedString(lastMatchKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

