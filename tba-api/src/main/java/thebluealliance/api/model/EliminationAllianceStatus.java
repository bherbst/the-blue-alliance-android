/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).
 *
 * The version of the OpenAPI document: 3.9.9
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
import thebluealliance.api.model.WLTRecord;

/**
 * EliminationAllianceStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-03T11:29:24.649848-06:00[America/Chicago]", comments = "Generator version: 7.10.0")
public class EliminationAllianceStatus {
  public static final String SERIALIZED_NAME_PLAYOFF_AVERAGE = "playoff_average";
  @SerializedName(SERIALIZED_NAME_PLAYOFF_AVERAGE)
  @javax.annotation.Nullable
  private Double playoffAverage;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  @javax.annotation.Nullable
  private String level;

  public static final String SERIALIZED_NAME_RECORD = "record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  @javax.annotation.Nullable
  private WLTRecord record;

  public static final String SERIALIZED_NAME_CURRENT_LEVEL_RECORD = "current_level_record";
  @SerializedName(SERIALIZED_NAME_CURRENT_LEVEL_RECORD)
  @javax.annotation.Nullable
  private WLTRecord currentLevelRecord;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public EliminationAllianceStatus() {
  }

  public EliminationAllianceStatus playoffAverage(@javax.annotation.Nullable Double playoffAverage) {
    
    this.playoffAverage = playoffAverage;
    return this;
  }

  /**
   * Get playoffAverage
   * @return playoffAverage
   */
  @javax.annotation.Nullable

  public Double getPlayoffAverage() {
    return playoffAverage;
  }


  public void setPlayoffAverage(@javax.annotation.Nullable Double playoffAverage) {
    this.playoffAverage = playoffAverage;
  }

  public EliminationAllianceStatus level(@javax.annotation.Nullable String level) {
    
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  @javax.annotation.Nullable

  public String getLevel() {
    return level;
  }


  public void setLevel(@javax.annotation.Nullable String level) {
    this.level = level;
  }

  public EliminationAllianceStatus record(@javax.annotation.Nullable WLTRecord record) {
    
    this.record = record;
    return this;
  }

  /**
   * Get record
   * @return record
   */
  @javax.annotation.Nullable

  public WLTRecord getRecord() {
    return record;
  }


  public void setRecord(@javax.annotation.Nullable WLTRecord record) {
    this.record = record;
  }

  public EliminationAllianceStatus currentLevelRecord(@javax.annotation.Nullable WLTRecord currentLevelRecord) {
    
    this.currentLevelRecord = currentLevelRecord;
    return this;
  }

  /**
   * Get currentLevelRecord
   * @return currentLevelRecord
   */
  @javax.annotation.Nullable

  public WLTRecord getCurrentLevelRecord() {
    return currentLevelRecord;
  }


  public void setCurrentLevelRecord(@javax.annotation.Nullable WLTRecord currentLevelRecord) {
    this.currentLevelRecord = currentLevelRecord;
  }

  public EliminationAllianceStatus status(@javax.annotation.Nullable String status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable

  public String getStatus() {
    return status;
  }


  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EliminationAllianceStatus eliminationAllianceStatus = (EliminationAllianceStatus) o;
    return Objects.equals(this.playoffAverage, eliminationAllianceStatus.playoffAverage) &&
        Objects.equals(this.level, eliminationAllianceStatus.level) &&
        Objects.equals(this.record, eliminationAllianceStatus.record) &&
        Objects.equals(this.currentLevelRecord, eliminationAllianceStatus.currentLevelRecord) &&
        Objects.equals(this.status, eliminationAllianceStatus.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(playoffAverage, level, record, currentLevelRecord, status);
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
    sb.append("class EliminationAllianceStatus {\n");
    sb.append("    playoffAverage: ").append(toIndentedString(playoffAverage)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    currentLevelRecord: ").append(toIndentedString(currentLevelRecord)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

