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

/**
 * MatchScoreBreakdown2020Alliance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-03T11:29:24.649848-06:00[America/Chicago]", comments = "Generator version: 7.10.0")
public class MatchScoreBreakdown2020Alliance {
  public static final String SERIALIZED_NAME_INIT_LINE_ROBOT1 = "initLineRobot1";
  @SerializedName(SERIALIZED_NAME_INIT_LINE_ROBOT1)
  @javax.annotation.Nullable
  private String initLineRobot1;

  public static final String SERIALIZED_NAME_ENDGAME_ROBOT1 = "endgameRobot1";
  @SerializedName(SERIALIZED_NAME_ENDGAME_ROBOT1)
  @javax.annotation.Nullable
  private String endgameRobot1;

  public static final String SERIALIZED_NAME_INIT_LINE_ROBOT2 = "initLineRobot2";
  @SerializedName(SERIALIZED_NAME_INIT_LINE_ROBOT2)
  @javax.annotation.Nullable
  private String initLineRobot2;

  public static final String SERIALIZED_NAME_ENDGAME_ROBOT2 = "endgameRobot2";
  @SerializedName(SERIALIZED_NAME_ENDGAME_ROBOT2)
  @javax.annotation.Nullable
  private String endgameRobot2;

  public static final String SERIALIZED_NAME_INIT_LINE_ROBOT3 = "initLineRobot3";
  @SerializedName(SERIALIZED_NAME_INIT_LINE_ROBOT3)
  @javax.annotation.Nullable
  private String initLineRobot3;

  public static final String SERIALIZED_NAME_ENDGAME_ROBOT3 = "endgameRobot3";
  @SerializedName(SERIALIZED_NAME_ENDGAME_ROBOT3)
  @javax.annotation.Nullable
  private String endgameRobot3;

  public static final String SERIALIZED_NAME_AUTO_CELLS_BOTTOM = "autoCellsBottom";
  @SerializedName(SERIALIZED_NAME_AUTO_CELLS_BOTTOM)
  @javax.annotation.Nullable
  private Integer autoCellsBottom;

  public static final String SERIALIZED_NAME_AUTO_CELLS_OUTER = "autoCellsOuter";
  @SerializedName(SERIALIZED_NAME_AUTO_CELLS_OUTER)
  @javax.annotation.Nullable
  private Integer autoCellsOuter;

  public static final String SERIALIZED_NAME_AUTO_CELLS_INNER = "autoCellsInner";
  @SerializedName(SERIALIZED_NAME_AUTO_CELLS_INNER)
  @javax.annotation.Nullable
  private Integer autoCellsInner;

  public static final String SERIALIZED_NAME_TELEOP_CELLS_BOTTOM = "teleopCellsBottom";
  @SerializedName(SERIALIZED_NAME_TELEOP_CELLS_BOTTOM)
  @javax.annotation.Nullable
  private Integer teleopCellsBottom;

  public static final String SERIALIZED_NAME_TELEOP_CELLS_OUTER = "teleopCellsOuter";
  @SerializedName(SERIALIZED_NAME_TELEOP_CELLS_OUTER)
  @javax.annotation.Nullable
  private Integer teleopCellsOuter;

  public static final String SERIALIZED_NAME_TELEOP_CELLS_INNER = "teleopCellsInner";
  @SerializedName(SERIALIZED_NAME_TELEOP_CELLS_INNER)
  @javax.annotation.Nullable
  private Integer teleopCellsInner;

  public static final String SERIALIZED_NAME_STAGE1_ACTIVATED = "stage1Activated";
  @SerializedName(SERIALIZED_NAME_STAGE1_ACTIVATED)
  @javax.annotation.Nullable
  private Boolean stage1Activated;

  public static final String SERIALIZED_NAME_STAGE2_ACTIVATED = "stage2Activated";
  @SerializedName(SERIALIZED_NAME_STAGE2_ACTIVATED)
  @javax.annotation.Nullable
  private Boolean stage2Activated;

  public static final String SERIALIZED_NAME_STAGE3_ACTIVATED = "stage3Activated";
  @SerializedName(SERIALIZED_NAME_STAGE3_ACTIVATED)
  @javax.annotation.Nullable
  private Boolean stage3Activated;

  public static final String SERIALIZED_NAME_STAGE3_TARGET_COLOR = "stage3TargetColor";
  @SerializedName(SERIALIZED_NAME_STAGE3_TARGET_COLOR)
  @javax.annotation.Nullable
  private String stage3TargetColor;

  public static final String SERIALIZED_NAME_ENDGAME_RUNG_IS_LEVEL = "endgameRungIsLevel";
  @SerializedName(SERIALIZED_NAME_ENDGAME_RUNG_IS_LEVEL)
  @javax.annotation.Nullable
  private String endgameRungIsLevel;

  public static final String SERIALIZED_NAME_AUTO_INIT_LINE_POINTS = "autoInitLinePoints";
  @SerializedName(SERIALIZED_NAME_AUTO_INIT_LINE_POINTS)
  @javax.annotation.Nullable
  private Integer autoInitLinePoints;

  public static final String SERIALIZED_NAME_AUTO_CELL_POINTS = "autoCellPoints";
  @SerializedName(SERIALIZED_NAME_AUTO_CELL_POINTS)
  @javax.annotation.Nullable
  private Integer autoCellPoints;

  public static final String SERIALIZED_NAME_AUTO_POINTS = "autoPoints";
  @SerializedName(SERIALIZED_NAME_AUTO_POINTS)
  @javax.annotation.Nullable
  private Integer autoPoints;

  public static final String SERIALIZED_NAME_TELEOP_CELL_POINTS = "teleopCellPoints";
  @SerializedName(SERIALIZED_NAME_TELEOP_CELL_POINTS)
  @javax.annotation.Nullable
  private Integer teleopCellPoints;

  public static final String SERIALIZED_NAME_CONTROL_PANEL_POINTS = "controlPanelPoints";
  @SerializedName(SERIALIZED_NAME_CONTROL_PANEL_POINTS)
  @javax.annotation.Nullable
  private Integer controlPanelPoints;

  public static final String SERIALIZED_NAME_ENDGAME_POINTS = "endgamePoints";
  @SerializedName(SERIALIZED_NAME_ENDGAME_POINTS)
  @javax.annotation.Nullable
  private Integer endgamePoints;

  public static final String SERIALIZED_NAME_TELEOP_POINTS = "teleopPoints";
  @SerializedName(SERIALIZED_NAME_TELEOP_POINTS)
  @javax.annotation.Nullable
  private Integer teleopPoints;

  public static final String SERIALIZED_NAME_SHIELD_OPERATIONAL_RANKING_POINT = "shieldOperationalRankingPoint";
  @SerializedName(SERIALIZED_NAME_SHIELD_OPERATIONAL_RANKING_POINT)
  @javax.annotation.Nullable
  private Boolean shieldOperationalRankingPoint;

  public static final String SERIALIZED_NAME_SHIELD_ENERGIZED_RANKING_POINT = "shieldEnergizedRankingPoint";
  @SerializedName(SERIALIZED_NAME_SHIELD_ENERGIZED_RANKING_POINT)
  @javax.annotation.Nullable
  private Boolean shieldEnergizedRankingPoint;

  public static final String SERIALIZED_NAME_TBA_SHIELD_ENERGIZED_RANKING_POINT_FROM_FOUL = "tba_shieldEnergizedRankingPointFromFoul";
  @SerializedName(SERIALIZED_NAME_TBA_SHIELD_ENERGIZED_RANKING_POINT_FROM_FOUL)
  @javax.annotation.Nullable
  private Boolean tbaShieldEnergizedRankingPointFromFoul;

  public static final String SERIALIZED_NAME_TBA_NUM_ROBOTS_HANGING = "tba_numRobotsHanging";
  @SerializedName(SERIALIZED_NAME_TBA_NUM_ROBOTS_HANGING)
  @javax.annotation.Nullable
  private Integer tbaNumRobotsHanging;

  public static final String SERIALIZED_NAME_FOUL_COUNT = "foulCount";
  @SerializedName(SERIALIZED_NAME_FOUL_COUNT)
  @javax.annotation.Nullable
  private Integer foulCount;

  public static final String SERIALIZED_NAME_TECH_FOUL_COUNT = "techFoulCount";
  @SerializedName(SERIALIZED_NAME_TECH_FOUL_COUNT)
  @javax.annotation.Nullable
  private Integer techFoulCount;

  public static final String SERIALIZED_NAME_ADJUST_POINTS = "adjustPoints";
  @SerializedName(SERIALIZED_NAME_ADJUST_POINTS)
  @javax.annotation.Nullable
  private Integer adjustPoints;

  public static final String SERIALIZED_NAME_FOUL_POINTS = "foulPoints";
  @SerializedName(SERIALIZED_NAME_FOUL_POINTS)
  @javax.annotation.Nullable
  private Integer foulPoints;

  public static final String SERIALIZED_NAME_RP = "rp";
  @SerializedName(SERIALIZED_NAME_RP)
  @javax.annotation.Nullable
  private Integer rp;

  public static final String SERIALIZED_NAME_TOTAL_POINTS = "totalPoints";
  @SerializedName(SERIALIZED_NAME_TOTAL_POINTS)
  @javax.annotation.Nullable
  private Integer totalPoints;

  public MatchScoreBreakdown2020Alliance() {
  }

  public MatchScoreBreakdown2020Alliance initLineRobot1(@javax.annotation.Nullable String initLineRobot1) {
    
    this.initLineRobot1 = initLineRobot1;
    return this;
  }

  /**
   * Get initLineRobot1
   * @return initLineRobot1
   */
  @javax.annotation.Nullable

  public String getInitLineRobot1() {
    return initLineRobot1;
  }


  public void setInitLineRobot1(@javax.annotation.Nullable String initLineRobot1) {
    this.initLineRobot1 = initLineRobot1;
  }

  public MatchScoreBreakdown2020Alliance endgameRobot1(@javax.annotation.Nullable String endgameRobot1) {
    
    this.endgameRobot1 = endgameRobot1;
    return this;
  }

  /**
   * Get endgameRobot1
   * @return endgameRobot1
   */
  @javax.annotation.Nullable

  public String getEndgameRobot1() {
    return endgameRobot1;
  }


  public void setEndgameRobot1(@javax.annotation.Nullable String endgameRobot1) {
    this.endgameRobot1 = endgameRobot1;
  }

  public MatchScoreBreakdown2020Alliance initLineRobot2(@javax.annotation.Nullable String initLineRobot2) {
    
    this.initLineRobot2 = initLineRobot2;
    return this;
  }

  /**
   * Get initLineRobot2
   * @return initLineRobot2
   */
  @javax.annotation.Nullable

  public String getInitLineRobot2() {
    return initLineRobot2;
  }


  public void setInitLineRobot2(@javax.annotation.Nullable String initLineRobot2) {
    this.initLineRobot2 = initLineRobot2;
  }

  public MatchScoreBreakdown2020Alliance endgameRobot2(@javax.annotation.Nullable String endgameRobot2) {
    
    this.endgameRobot2 = endgameRobot2;
    return this;
  }

  /**
   * Get endgameRobot2
   * @return endgameRobot2
   */
  @javax.annotation.Nullable

  public String getEndgameRobot2() {
    return endgameRobot2;
  }


  public void setEndgameRobot2(@javax.annotation.Nullable String endgameRobot2) {
    this.endgameRobot2 = endgameRobot2;
  }

  public MatchScoreBreakdown2020Alliance initLineRobot3(@javax.annotation.Nullable String initLineRobot3) {
    
    this.initLineRobot3 = initLineRobot3;
    return this;
  }

  /**
   * Get initLineRobot3
   * @return initLineRobot3
   */
  @javax.annotation.Nullable

  public String getInitLineRobot3() {
    return initLineRobot3;
  }


  public void setInitLineRobot3(@javax.annotation.Nullable String initLineRobot3) {
    this.initLineRobot3 = initLineRobot3;
  }

  public MatchScoreBreakdown2020Alliance endgameRobot3(@javax.annotation.Nullable String endgameRobot3) {
    
    this.endgameRobot3 = endgameRobot3;
    return this;
  }

  /**
   * Get endgameRobot3
   * @return endgameRobot3
   */
  @javax.annotation.Nullable

  public String getEndgameRobot3() {
    return endgameRobot3;
  }


  public void setEndgameRobot3(@javax.annotation.Nullable String endgameRobot3) {
    this.endgameRobot3 = endgameRobot3;
  }

  public MatchScoreBreakdown2020Alliance autoCellsBottom(@javax.annotation.Nullable Integer autoCellsBottom) {
    
    this.autoCellsBottom = autoCellsBottom;
    return this;
  }

  /**
   * Get autoCellsBottom
   * @return autoCellsBottom
   */
  @javax.annotation.Nullable

  public Integer getAutoCellsBottom() {
    return autoCellsBottom;
  }


  public void setAutoCellsBottom(@javax.annotation.Nullable Integer autoCellsBottom) {
    this.autoCellsBottom = autoCellsBottom;
  }

  public MatchScoreBreakdown2020Alliance autoCellsOuter(@javax.annotation.Nullable Integer autoCellsOuter) {
    
    this.autoCellsOuter = autoCellsOuter;
    return this;
  }

  /**
   * Get autoCellsOuter
   * @return autoCellsOuter
   */
  @javax.annotation.Nullable

  public Integer getAutoCellsOuter() {
    return autoCellsOuter;
  }


  public void setAutoCellsOuter(@javax.annotation.Nullable Integer autoCellsOuter) {
    this.autoCellsOuter = autoCellsOuter;
  }

  public MatchScoreBreakdown2020Alliance autoCellsInner(@javax.annotation.Nullable Integer autoCellsInner) {
    
    this.autoCellsInner = autoCellsInner;
    return this;
  }

  /**
   * Get autoCellsInner
   * @return autoCellsInner
   */
  @javax.annotation.Nullable

  public Integer getAutoCellsInner() {
    return autoCellsInner;
  }


  public void setAutoCellsInner(@javax.annotation.Nullable Integer autoCellsInner) {
    this.autoCellsInner = autoCellsInner;
  }

  public MatchScoreBreakdown2020Alliance teleopCellsBottom(@javax.annotation.Nullable Integer teleopCellsBottom) {
    
    this.teleopCellsBottom = teleopCellsBottom;
    return this;
  }

  /**
   * Get teleopCellsBottom
   * @return teleopCellsBottom
   */
  @javax.annotation.Nullable

  public Integer getTeleopCellsBottom() {
    return teleopCellsBottom;
  }


  public void setTeleopCellsBottom(@javax.annotation.Nullable Integer teleopCellsBottom) {
    this.teleopCellsBottom = teleopCellsBottom;
  }

  public MatchScoreBreakdown2020Alliance teleopCellsOuter(@javax.annotation.Nullable Integer teleopCellsOuter) {
    
    this.teleopCellsOuter = teleopCellsOuter;
    return this;
  }

  /**
   * Get teleopCellsOuter
   * @return teleopCellsOuter
   */
  @javax.annotation.Nullable

  public Integer getTeleopCellsOuter() {
    return teleopCellsOuter;
  }


  public void setTeleopCellsOuter(@javax.annotation.Nullable Integer teleopCellsOuter) {
    this.teleopCellsOuter = teleopCellsOuter;
  }

  public MatchScoreBreakdown2020Alliance teleopCellsInner(@javax.annotation.Nullable Integer teleopCellsInner) {
    
    this.teleopCellsInner = teleopCellsInner;
    return this;
  }

  /**
   * Get teleopCellsInner
   * @return teleopCellsInner
   */
  @javax.annotation.Nullable

  public Integer getTeleopCellsInner() {
    return teleopCellsInner;
  }


  public void setTeleopCellsInner(@javax.annotation.Nullable Integer teleopCellsInner) {
    this.teleopCellsInner = teleopCellsInner;
  }

  public MatchScoreBreakdown2020Alliance stage1Activated(@javax.annotation.Nullable Boolean stage1Activated) {
    
    this.stage1Activated = stage1Activated;
    return this;
  }

  /**
   * Get stage1Activated
   * @return stage1Activated
   */
  @javax.annotation.Nullable

  public Boolean getStage1Activated() {
    return stage1Activated;
  }


  public void setStage1Activated(@javax.annotation.Nullable Boolean stage1Activated) {
    this.stage1Activated = stage1Activated;
  }

  public MatchScoreBreakdown2020Alliance stage2Activated(@javax.annotation.Nullable Boolean stage2Activated) {
    
    this.stage2Activated = stage2Activated;
    return this;
  }

  /**
   * Get stage2Activated
   * @return stage2Activated
   */
  @javax.annotation.Nullable

  public Boolean getStage2Activated() {
    return stage2Activated;
  }


  public void setStage2Activated(@javax.annotation.Nullable Boolean stage2Activated) {
    this.stage2Activated = stage2Activated;
  }

  public MatchScoreBreakdown2020Alliance stage3Activated(@javax.annotation.Nullable Boolean stage3Activated) {
    
    this.stage3Activated = stage3Activated;
    return this;
  }

  /**
   * Get stage3Activated
   * @return stage3Activated
   */
  @javax.annotation.Nullable

  public Boolean getStage3Activated() {
    return stage3Activated;
  }


  public void setStage3Activated(@javax.annotation.Nullable Boolean stage3Activated) {
    this.stage3Activated = stage3Activated;
  }

  public MatchScoreBreakdown2020Alliance stage3TargetColor(@javax.annotation.Nullable String stage3TargetColor) {
    
    this.stage3TargetColor = stage3TargetColor;
    return this;
  }

  /**
   * Get stage3TargetColor
   * @return stage3TargetColor
   */
  @javax.annotation.Nullable

  public String getStage3TargetColor() {
    return stage3TargetColor;
  }


  public void setStage3TargetColor(@javax.annotation.Nullable String stage3TargetColor) {
    this.stage3TargetColor = stage3TargetColor;
  }

  public MatchScoreBreakdown2020Alliance endgameRungIsLevel(@javax.annotation.Nullable String endgameRungIsLevel) {
    
    this.endgameRungIsLevel = endgameRungIsLevel;
    return this;
  }

  /**
   * Get endgameRungIsLevel
   * @return endgameRungIsLevel
   */
  @javax.annotation.Nullable

  public String getEndgameRungIsLevel() {
    return endgameRungIsLevel;
  }


  public void setEndgameRungIsLevel(@javax.annotation.Nullable String endgameRungIsLevel) {
    this.endgameRungIsLevel = endgameRungIsLevel;
  }

  public MatchScoreBreakdown2020Alliance autoInitLinePoints(@javax.annotation.Nullable Integer autoInitLinePoints) {
    
    this.autoInitLinePoints = autoInitLinePoints;
    return this;
  }

  /**
   * Get autoInitLinePoints
   * @return autoInitLinePoints
   */
  @javax.annotation.Nullable

  public Integer getAutoInitLinePoints() {
    return autoInitLinePoints;
  }


  public void setAutoInitLinePoints(@javax.annotation.Nullable Integer autoInitLinePoints) {
    this.autoInitLinePoints = autoInitLinePoints;
  }

  public MatchScoreBreakdown2020Alliance autoCellPoints(@javax.annotation.Nullable Integer autoCellPoints) {
    
    this.autoCellPoints = autoCellPoints;
    return this;
  }

  /**
   * Get autoCellPoints
   * @return autoCellPoints
   */
  @javax.annotation.Nullable

  public Integer getAutoCellPoints() {
    return autoCellPoints;
  }


  public void setAutoCellPoints(@javax.annotation.Nullable Integer autoCellPoints) {
    this.autoCellPoints = autoCellPoints;
  }

  public MatchScoreBreakdown2020Alliance autoPoints(@javax.annotation.Nullable Integer autoPoints) {
    
    this.autoPoints = autoPoints;
    return this;
  }

  /**
   * Get autoPoints
   * @return autoPoints
   */
  @javax.annotation.Nullable

  public Integer getAutoPoints() {
    return autoPoints;
  }


  public void setAutoPoints(@javax.annotation.Nullable Integer autoPoints) {
    this.autoPoints = autoPoints;
  }

  public MatchScoreBreakdown2020Alliance teleopCellPoints(@javax.annotation.Nullable Integer teleopCellPoints) {
    
    this.teleopCellPoints = teleopCellPoints;
    return this;
  }

  /**
   * Get teleopCellPoints
   * @return teleopCellPoints
   */
  @javax.annotation.Nullable

  public Integer getTeleopCellPoints() {
    return teleopCellPoints;
  }


  public void setTeleopCellPoints(@javax.annotation.Nullable Integer teleopCellPoints) {
    this.teleopCellPoints = teleopCellPoints;
  }

  public MatchScoreBreakdown2020Alliance controlPanelPoints(@javax.annotation.Nullable Integer controlPanelPoints) {
    
    this.controlPanelPoints = controlPanelPoints;
    return this;
  }

  /**
   * Get controlPanelPoints
   * @return controlPanelPoints
   */
  @javax.annotation.Nullable

  public Integer getControlPanelPoints() {
    return controlPanelPoints;
  }


  public void setControlPanelPoints(@javax.annotation.Nullable Integer controlPanelPoints) {
    this.controlPanelPoints = controlPanelPoints;
  }

  public MatchScoreBreakdown2020Alliance endgamePoints(@javax.annotation.Nullable Integer endgamePoints) {
    
    this.endgamePoints = endgamePoints;
    return this;
  }

  /**
   * Get endgamePoints
   * @return endgamePoints
   */
  @javax.annotation.Nullable

  public Integer getEndgamePoints() {
    return endgamePoints;
  }


  public void setEndgamePoints(@javax.annotation.Nullable Integer endgamePoints) {
    this.endgamePoints = endgamePoints;
  }

  public MatchScoreBreakdown2020Alliance teleopPoints(@javax.annotation.Nullable Integer teleopPoints) {
    
    this.teleopPoints = teleopPoints;
    return this;
  }

  /**
   * Get teleopPoints
   * @return teleopPoints
   */
  @javax.annotation.Nullable

  public Integer getTeleopPoints() {
    return teleopPoints;
  }


  public void setTeleopPoints(@javax.annotation.Nullable Integer teleopPoints) {
    this.teleopPoints = teleopPoints;
  }

  public MatchScoreBreakdown2020Alliance shieldOperationalRankingPoint(@javax.annotation.Nullable Boolean shieldOperationalRankingPoint) {
    
    this.shieldOperationalRankingPoint = shieldOperationalRankingPoint;
    return this;
  }

  /**
   * Get shieldOperationalRankingPoint
   * @return shieldOperationalRankingPoint
   */
  @javax.annotation.Nullable

  public Boolean getShieldOperationalRankingPoint() {
    return shieldOperationalRankingPoint;
  }


  public void setShieldOperationalRankingPoint(@javax.annotation.Nullable Boolean shieldOperationalRankingPoint) {
    this.shieldOperationalRankingPoint = shieldOperationalRankingPoint;
  }

  public MatchScoreBreakdown2020Alliance shieldEnergizedRankingPoint(@javax.annotation.Nullable Boolean shieldEnergizedRankingPoint) {
    
    this.shieldEnergizedRankingPoint = shieldEnergizedRankingPoint;
    return this;
  }

  /**
   * Get shieldEnergizedRankingPoint
   * @return shieldEnergizedRankingPoint
   */
  @javax.annotation.Nullable

  public Boolean getShieldEnergizedRankingPoint() {
    return shieldEnergizedRankingPoint;
  }


  public void setShieldEnergizedRankingPoint(@javax.annotation.Nullable Boolean shieldEnergizedRankingPoint) {
    this.shieldEnergizedRankingPoint = shieldEnergizedRankingPoint;
  }

  public MatchScoreBreakdown2020Alliance tbaShieldEnergizedRankingPointFromFoul(@javax.annotation.Nullable Boolean tbaShieldEnergizedRankingPointFromFoul) {
    
    this.tbaShieldEnergizedRankingPointFromFoul = tbaShieldEnergizedRankingPointFromFoul;
    return this;
  }

  /**
   * Unofficial TBA-computed value that indicates whether the shieldEnergizedRankingPoint was earned normally or awarded due to a foul.
   * @return tbaShieldEnergizedRankingPointFromFoul
   */
  @javax.annotation.Nullable

  public Boolean getTbaShieldEnergizedRankingPointFromFoul() {
    return tbaShieldEnergizedRankingPointFromFoul;
  }


  public void setTbaShieldEnergizedRankingPointFromFoul(@javax.annotation.Nullable Boolean tbaShieldEnergizedRankingPointFromFoul) {
    this.tbaShieldEnergizedRankingPointFromFoul = tbaShieldEnergizedRankingPointFromFoul;
  }

  public MatchScoreBreakdown2020Alliance tbaNumRobotsHanging(@javax.annotation.Nullable Integer tbaNumRobotsHanging) {
    
    this.tbaNumRobotsHanging = tbaNumRobotsHanging;
    return this;
  }

  /**
   * Unofficial TBA-computed value that counts the number of robots who were hanging at the end of the match.
   * @return tbaNumRobotsHanging
   */
  @javax.annotation.Nullable

  public Integer getTbaNumRobotsHanging() {
    return tbaNumRobotsHanging;
  }


  public void setTbaNumRobotsHanging(@javax.annotation.Nullable Integer tbaNumRobotsHanging) {
    this.tbaNumRobotsHanging = tbaNumRobotsHanging;
  }

  public MatchScoreBreakdown2020Alliance foulCount(@javax.annotation.Nullable Integer foulCount) {
    
    this.foulCount = foulCount;
    return this;
  }

  /**
   * Get foulCount
   * @return foulCount
   */
  @javax.annotation.Nullable

  public Integer getFoulCount() {
    return foulCount;
  }


  public void setFoulCount(@javax.annotation.Nullable Integer foulCount) {
    this.foulCount = foulCount;
  }

  public MatchScoreBreakdown2020Alliance techFoulCount(@javax.annotation.Nullable Integer techFoulCount) {
    
    this.techFoulCount = techFoulCount;
    return this;
  }

  /**
   * Get techFoulCount
   * @return techFoulCount
   */
  @javax.annotation.Nullable

  public Integer getTechFoulCount() {
    return techFoulCount;
  }


  public void setTechFoulCount(@javax.annotation.Nullable Integer techFoulCount) {
    this.techFoulCount = techFoulCount;
  }

  public MatchScoreBreakdown2020Alliance adjustPoints(@javax.annotation.Nullable Integer adjustPoints) {
    
    this.adjustPoints = adjustPoints;
    return this;
  }

  /**
   * Get adjustPoints
   * @return adjustPoints
   */
  @javax.annotation.Nullable

  public Integer getAdjustPoints() {
    return adjustPoints;
  }


  public void setAdjustPoints(@javax.annotation.Nullable Integer adjustPoints) {
    this.adjustPoints = adjustPoints;
  }

  public MatchScoreBreakdown2020Alliance foulPoints(@javax.annotation.Nullable Integer foulPoints) {
    
    this.foulPoints = foulPoints;
    return this;
  }

  /**
   * Get foulPoints
   * @return foulPoints
   */
  @javax.annotation.Nullable

  public Integer getFoulPoints() {
    return foulPoints;
  }


  public void setFoulPoints(@javax.annotation.Nullable Integer foulPoints) {
    this.foulPoints = foulPoints;
  }

  public MatchScoreBreakdown2020Alliance rp(@javax.annotation.Nullable Integer rp) {
    
    this.rp = rp;
    return this;
  }

  /**
   * Get rp
   * @return rp
   */
  @javax.annotation.Nullable

  public Integer getRp() {
    return rp;
  }


  public void setRp(@javax.annotation.Nullable Integer rp) {
    this.rp = rp;
  }

  public MatchScoreBreakdown2020Alliance totalPoints(@javax.annotation.Nullable Integer totalPoints) {
    
    this.totalPoints = totalPoints;
    return this;
  }

  /**
   * Get totalPoints
   * @return totalPoints
   */
  @javax.annotation.Nullable

  public Integer getTotalPoints() {
    return totalPoints;
  }


  public void setTotalPoints(@javax.annotation.Nullable Integer totalPoints) {
    this.totalPoints = totalPoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2020Alliance matchScoreBreakdown2020Alliance = (MatchScoreBreakdown2020Alliance) o;
    return Objects.equals(this.initLineRobot1, matchScoreBreakdown2020Alliance.initLineRobot1) &&
        Objects.equals(this.endgameRobot1, matchScoreBreakdown2020Alliance.endgameRobot1) &&
        Objects.equals(this.initLineRobot2, matchScoreBreakdown2020Alliance.initLineRobot2) &&
        Objects.equals(this.endgameRobot2, matchScoreBreakdown2020Alliance.endgameRobot2) &&
        Objects.equals(this.initLineRobot3, matchScoreBreakdown2020Alliance.initLineRobot3) &&
        Objects.equals(this.endgameRobot3, matchScoreBreakdown2020Alliance.endgameRobot3) &&
        Objects.equals(this.autoCellsBottom, matchScoreBreakdown2020Alliance.autoCellsBottom) &&
        Objects.equals(this.autoCellsOuter, matchScoreBreakdown2020Alliance.autoCellsOuter) &&
        Objects.equals(this.autoCellsInner, matchScoreBreakdown2020Alliance.autoCellsInner) &&
        Objects.equals(this.teleopCellsBottom, matchScoreBreakdown2020Alliance.teleopCellsBottom) &&
        Objects.equals(this.teleopCellsOuter, matchScoreBreakdown2020Alliance.teleopCellsOuter) &&
        Objects.equals(this.teleopCellsInner, matchScoreBreakdown2020Alliance.teleopCellsInner) &&
        Objects.equals(this.stage1Activated, matchScoreBreakdown2020Alliance.stage1Activated) &&
        Objects.equals(this.stage2Activated, matchScoreBreakdown2020Alliance.stage2Activated) &&
        Objects.equals(this.stage3Activated, matchScoreBreakdown2020Alliance.stage3Activated) &&
        Objects.equals(this.stage3TargetColor, matchScoreBreakdown2020Alliance.stage3TargetColor) &&
        Objects.equals(this.endgameRungIsLevel, matchScoreBreakdown2020Alliance.endgameRungIsLevel) &&
        Objects.equals(this.autoInitLinePoints, matchScoreBreakdown2020Alliance.autoInitLinePoints) &&
        Objects.equals(this.autoCellPoints, matchScoreBreakdown2020Alliance.autoCellPoints) &&
        Objects.equals(this.autoPoints, matchScoreBreakdown2020Alliance.autoPoints) &&
        Objects.equals(this.teleopCellPoints, matchScoreBreakdown2020Alliance.teleopCellPoints) &&
        Objects.equals(this.controlPanelPoints, matchScoreBreakdown2020Alliance.controlPanelPoints) &&
        Objects.equals(this.endgamePoints, matchScoreBreakdown2020Alliance.endgamePoints) &&
        Objects.equals(this.teleopPoints, matchScoreBreakdown2020Alliance.teleopPoints) &&
        Objects.equals(this.shieldOperationalRankingPoint, matchScoreBreakdown2020Alliance.shieldOperationalRankingPoint) &&
        Objects.equals(this.shieldEnergizedRankingPoint, matchScoreBreakdown2020Alliance.shieldEnergizedRankingPoint) &&
        Objects.equals(this.tbaShieldEnergizedRankingPointFromFoul, matchScoreBreakdown2020Alliance.tbaShieldEnergizedRankingPointFromFoul) &&
        Objects.equals(this.tbaNumRobotsHanging, matchScoreBreakdown2020Alliance.tbaNumRobotsHanging) &&
        Objects.equals(this.foulCount, matchScoreBreakdown2020Alliance.foulCount) &&
        Objects.equals(this.techFoulCount, matchScoreBreakdown2020Alliance.techFoulCount) &&
        Objects.equals(this.adjustPoints, matchScoreBreakdown2020Alliance.adjustPoints) &&
        Objects.equals(this.foulPoints, matchScoreBreakdown2020Alliance.foulPoints) &&
        Objects.equals(this.rp, matchScoreBreakdown2020Alliance.rp) &&
        Objects.equals(this.totalPoints, matchScoreBreakdown2020Alliance.totalPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initLineRobot1, endgameRobot1, initLineRobot2, endgameRobot2, initLineRobot3, endgameRobot3, autoCellsBottom, autoCellsOuter, autoCellsInner, teleopCellsBottom, teleopCellsOuter, teleopCellsInner, stage1Activated, stage2Activated, stage3Activated, stage3TargetColor, endgameRungIsLevel, autoInitLinePoints, autoCellPoints, autoPoints, teleopCellPoints, controlPanelPoints, endgamePoints, teleopPoints, shieldOperationalRankingPoint, shieldEnergizedRankingPoint, tbaShieldEnergizedRankingPointFromFoul, tbaNumRobotsHanging, foulCount, techFoulCount, adjustPoints, foulPoints, rp, totalPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2020Alliance {\n");
    sb.append("    initLineRobot1: ").append(toIndentedString(initLineRobot1)).append("\n");
    sb.append("    endgameRobot1: ").append(toIndentedString(endgameRobot1)).append("\n");
    sb.append("    initLineRobot2: ").append(toIndentedString(initLineRobot2)).append("\n");
    sb.append("    endgameRobot2: ").append(toIndentedString(endgameRobot2)).append("\n");
    sb.append("    initLineRobot3: ").append(toIndentedString(initLineRobot3)).append("\n");
    sb.append("    endgameRobot3: ").append(toIndentedString(endgameRobot3)).append("\n");
    sb.append("    autoCellsBottom: ").append(toIndentedString(autoCellsBottom)).append("\n");
    sb.append("    autoCellsOuter: ").append(toIndentedString(autoCellsOuter)).append("\n");
    sb.append("    autoCellsInner: ").append(toIndentedString(autoCellsInner)).append("\n");
    sb.append("    teleopCellsBottom: ").append(toIndentedString(teleopCellsBottom)).append("\n");
    sb.append("    teleopCellsOuter: ").append(toIndentedString(teleopCellsOuter)).append("\n");
    sb.append("    teleopCellsInner: ").append(toIndentedString(teleopCellsInner)).append("\n");
    sb.append("    stage1Activated: ").append(toIndentedString(stage1Activated)).append("\n");
    sb.append("    stage2Activated: ").append(toIndentedString(stage2Activated)).append("\n");
    sb.append("    stage3Activated: ").append(toIndentedString(stage3Activated)).append("\n");
    sb.append("    stage3TargetColor: ").append(toIndentedString(stage3TargetColor)).append("\n");
    sb.append("    endgameRungIsLevel: ").append(toIndentedString(endgameRungIsLevel)).append("\n");
    sb.append("    autoInitLinePoints: ").append(toIndentedString(autoInitLinePoints)).append("\n");
    sb.append("    autoCellPoints: ").append(toIndentedString(autoCellPoints)).append("\n");
    sb.append("    autoPoints: ").append(toIndentedString(autoPoints)).append("\n");
    sb.append("    teleopCellPoints: ").append(toIndentedString(teleopCellPoints)).append("\n");
    sb.append("    controlPanelPoints: ").append(toIndentedString(controlPanelPoints)).append("\n");
    sb.append("    endgamePoints: ").append(toIndentedString(endgamePoints)).append("\n");
    sb.append("    teleopPoints: ").append(toIndentedString(teleopPoints)).append("\n");
    sb.append("    shieldOperationalRankingPoint: ").append(toIndentedString(shieldOperationalRankingPoint)).append("\n");
    sb.append("    shieldEnergizedRankingPoint: ").append(toIndentedString(shieldEnergizedRankingPoint)).append("\n");
    sb.append("    tbaShieldEnergizedRankingPointFromFoul: ").append(toIndentedString(tbaShieldEnergizedRankingPointFromFoul)).append("\n");
    sb.append("    tbaNumRobotsHanging: ").append(toIndentedString(tbaNumRobotsHanging)).append("\n");
    sb.append("    foulCount: ").append(toIndentedString(foulCount)).append("\n");
    sb.append("    techFoulCount: ").append(toIndentedString(techFoulCount)).append("\n");
    sb.append("    adjustPoints: ").append(toIndentedString(adjustPoints)).append("\n");
    sb.append("    foulPoints: ").append(toIndentedString(foulPoints)).append("\n");
    sb.append("    rp: ").append(toIndentedString(rp)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
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

