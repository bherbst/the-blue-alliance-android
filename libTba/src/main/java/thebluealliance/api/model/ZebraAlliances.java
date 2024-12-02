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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import thebluealliance.api.model.ZebraTeam;

/**
 * ZebraAlliances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T08:29:12.737004100-06:00[America/Chicago]", comments = "Generator version: 7.10.0")
public class ZebraAlliances {
  public static final String SERIALIZED_NAME_RED = "red";
  @SerializedName(SERIALIZED_NAME_RED)
  @javax.annotation.Nullable
  private List<ZebraTeam> red = new ArrayList<>();

  public static final String SERIALIZED_NAME_BLUE = "blue";
  @SerializedName(SERIALIZED_NAME_BLUE)
  @javax.annotation.Nullable
  private List<ZebraTeam> blue = new ArrayList<>();

  public ZebraAlliances() {
  }

  public ZebraAlliances red(@javax.annotation.Nullable List<ZebraTeam> red) {
    
    this.red = red;
    return this;
  }

  public ZebraAlliances addRedItem(ZebraTeam redItem) {
    if (this.red == null) {
      this.red = new ArrayList<>();
    }
    this.red.add(redItem);
    return this;
  }

  /**
   * Zebra MotionWorks data for teams on the red alliance
   * @return red
   */
  @javax.annotation.Nullable

  public List<ZebraTeam> getRed() {
    return red;
  }


  public void setRed(@javax.annotation.Nullable List<ZebraTeam> red) {
    this.red = red;
  }

  public ZebraAlliances blue(@javax.annotation.Nullable List<ZebraTeam> blue) {
    
    this.blue = blue;
    return this;
  }

  public ZebraAlliances addBlueItem(ZebraTeam blueItem) {
    if (this.blue == null) {
      this.blue = new ArrayList<>();
    }
    this.blue.add(blueItem);
    return this;
  }

  /**
   * Zebra data for teams on the blue alliance
   * @return blue
   */
  @javax.annotation.Nullable

  public List<ZebraTeam> getBlue() {
    return blue;
  }


  public void setBlue(@javax.annotation.Nullable List<ZebraTeam> blue) {
    this.blue = blue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZebraAlliances zebraAlliances = (ZebraAlliances) o;
    return Objects.equals(this.red, zebraAlliances.red) &&
        Objects.equals(this.blue, zebraAlliances.blue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(red, blue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZebraAlliances {\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
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

