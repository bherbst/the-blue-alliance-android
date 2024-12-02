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

/**
 * TeamRobot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T08:29:12.737004100-06:00[America/Chicago]", comments = "Generator version: 7.10.0")
public class TeamRobot {
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  @javax.annotation.Nonnull
  private Integer year;

  public static final String SERIALIZED_NAME_ROBOT_NAME = "robot_name";
  @SerializedName(SERIALIZED_NAME_ROBOT_NAME)
  @javax.annotation.Nonnull
  private String robotName;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_TEAM_KEY = "team_key";
  @SerializedName(SERIALIZED_NAME_TEAM_KEY)
  @javax.annotation.Nonnull
  private String teamKey;

  public TeamRobot() {
  }

  public TeamRobot year(@javax.annotation.Nonnull Integer year) {
    
    this.year = year;
    return this;
  }

  /**
   * Year this robot competed in.
   * @return year
   */
  @javax.annotation.Nonnull

  public Integer getYear() {
    return year;
  }


  public void setYear(@javax.annotation.Nonnull Integer year) {
    this.year = year;
  }

  public TeamRobot robotName(@javax.annotation.Nonnull String robotName) {
    
    this.robotName = robotName;
    return this;
  }

  /**
   * Name of the robot as provided by the team.
   * @return robotName
   */
  @javax.annotation.Nonnull

  public String getRobotName() {
    return robotName;
  }


  public void setRobotName(@javax.annotation.Nonnull String robotName) {
    this.robotName = robotName;
  }

  public TeamRobot key(@javax.annotation.Nonnull String key) {
    
    this.key = key;
    return this;
  }

  /**
   * Internal TBA identifier for this robot.
   * @return key
   */
  @javax.annotation.Nonnull

  public String getKey() {
    return key;
  }


  public void setKey(@javax.annotation.Nonnull String key) {
    this.key = key;
  }

  public TeamRobot teamKey(@javax.annotation.Nonnull String teamKey) {
    
    this.teamKey = teamKey;
    return this;
  }

  /**
   * TBA team key for this robot.
   * @return teamKey
   */
  @javax.annotation.Nonnull

  public String getTeamKey() {
    return teamKey;
  }


  public void setTeamKey(@javax.annotation.Nonnull String teamKey) {
    this.teamKey = teamKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRobot teamRobot = (TeamRobot) o;
    return Objects.equals(this.year, teamRobot.year) &&
        Objects.equals(this.robotName, teamRobot.robotName) &&
        Objects.equals(this.key, teamRobot.key) &&
        Objects.equals(this.teamKey, teamRobot.teamKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, robotName, key, teamKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRobot {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    robotName: ").append(toIndentedString(robotName)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
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

