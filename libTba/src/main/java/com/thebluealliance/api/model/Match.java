/**
 * The Blue Alliance API
 * Access data about the FIRST Robotics Competition
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.thebluealliance.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Match
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-27T22:00:48.157-04:00")
public class Match   {
  @SerializedName("alliances")
  private String alliances = null;

  @SerializedName("comp_level")
  private String compLevel = null;

  @SerializedName("event_key")
  private String eventKey = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("match_number")
  private Integer matchNumber = null;

  @SerializedName("score_breakdown")
  private String scoreBreakdown = null;

  @SerializedName("set_number")
  private Integer setNumber = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("time_string")
  private String timeString = null;

  @SerializedName("videos")
  private String videos = null;

  public Match alliances(String alliances) {
    this.alliances = alliances;
    return this;
  }

   /**
   * A list of alliances, the teams on the alliances, and their score.
   * @return alliances
  **/
  @ApiModelProperty(example = "null", value = "A list of alliances, the teams on the alliances, and their score.")
  public String getAlliances() {
    return alliances;
  }

  public void setAlliances(String alliances) {
    this.alliances = alliances;
  }

  public Match compLevel(String compLevel) {
    this.compLevel = compLevel;
    return this;
  }

   /**
   * The competition level the match was played at.
   * @return compLevel
  **/
  @ApiModelProperty(example = "null", value = "The competition level the match was played at.")
  public String getCompLevel() {
    return compLevel;
  }

  public void setCompLevel(String compLevel) {
    this.compLevel = compLevel;
  }

  public Match eventKey(String eventKey) {
    this.eventKey = eventKey;
    return this;
  }

   /**
   * Event key of the event the match was played at.
   * @return eventKey
  **/
  @ApiModelProperty(example = "null", value = "Event key of the event the match was played at.")
  public String getEventKey() {
    return eventKey;
  }

  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }

  public Match key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA event key with the format yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER], where yyyy is the year, and EVENT_CODE is the event code of the event, COMP_LEVEL is (qm, ef, qf, sf, f), and MATCH_NUMBER is the match number in the competition level. A set number may append the competition level if more than one match in required per set .
   * @return key
  **/
  @ApiModelProperty(example = "null", value = "TBA event key with the format yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER], where yyyy is the year, and EVENT_CODE is the event code of the event, COMP_LEVEL is (qm, ef, qf, sf, f), and MATCH_NUMBER is the match number in the competition level. A set number may append the competition level if more than one match in required per set .")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Match matchNumber(Integer matchNumber) {
    this.matchNumber = matchNumber;
    return this;
  }

   /**
   * The match number of the match in the competition level.
   * @return matchNumber
  **/
  @ApiModelProperty(example = "null", value = "The match number of the match in the competition level.")
  public Integer getMatchNumber() {
    return matchNumber;
  }

  public void setMatchNumber(Integer matchNumber) {
    this.matchNumber = matchNumber;
  }

  public Match scoreBreakdown(String scoreBreakdown) {
    this.scoreBreakdown = scoreBreakdown;
    return this;
  }

   /**
   * Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null.
   * @return scoreBreakdown
  **/
  @ApiModelProperty(example = "null", value = "Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null.")
  public String getScoreBreakdown() {
    return scoreBreakdown;
  }

  public void setScoreBreakdown(String scoreBreakdown) {
    this.scoreBreakdown = scoreBreakdown;
  }

  public Match setNumber(Integer setNumber) {
    this.setNumber = setNumber;
    return this;
  }

   /**
   * The set number in a series of matches where more than one match is required in the match series.
   * @return setNumber
  **/
  @ApiModelProperty(example = "null", value = "The set number in a series of matches where more than one match is required in the match series.")
  public Integer getSetNumber() {
    return setNumber;
  }

  public void setSetNumber(Integer setNumber) {
    this.setNumber = setNumber;
  }

  public Match time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * UNIX timestamp of match time, as taken from the published schedule
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "UNIX timestamp of match time, as taken from the published schedule")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public Match timeString(String timeString) {
    this.timeString = timeString;
    return this;
  }

   /**
   * Time string for this match, as published on the official schedule. Of course, this may or may not be accurate, as events often run ahead or behind schedule
   * @return timeString
  **/
  @ApiModelProperty(example = "null", value = "Time string for this match, as published on the official schedule. Of course, this may or may not be accurate, as events often run ahead or behind schedule")
  public String getTimeString() {
    return timeString;
  }

  public void setTimeString(String timeString) {
    this.timeString = timeString;
  }

  public Match videos(String videos) {
    this.videos = videos;
    return this;
  }

   /**
   * JSON array of videos associated with this match and corresponding information
   * @return videos
  **/
  @ApiModelProperty(example = "null", value = "JSON array of videos associated with this match and corresponding information")
  public String getVideos() {
    return videos;
  }

  public void setVideos(String videos) {
    this.videos = videos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return Objects.equals(this.alliances, match.alliances) &&
        Objects.equals(this.compLevel, match.compLevel) &&
        Objects.equals(this.eventKey, match.eventKey) &&
        Objects.equals(this.key, match.key) &&
        Objects.equals(this.matchNumber, match.matchNumber) &&
        Objects.equals(this.scoreBreakdown, match.scoreBreakdown) &&
        Objects.equals(this.setNumber, match.setNumber) &&
        Objects.equals(this.time, match.time) &&
        Objects.equals(this.timeString, match.timeString) &&
        Objects.equals(this.videos, match.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alliances, compLevel, eventKey, key, matchNumber, scoreBreakdown, setNumber, time, timeString, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    
    sb.append("    alliances: ").append(toIndentedString(alliances)).append("\n");
    sb.append("    compLevel: ").append(toIndentedString(compLevel)).append("\n");
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    matchNumber: ").append(toIndentedString(matchNumber)).append("\n");
    sb.append("    scoreBreakdown: ").append(toIndentedString(scoreBreakdown)).append("\n");
    sb.append("    setNumber: ").append(toIndentedString(setNumber)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeString: ").append(toIndentedString(timeString)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

