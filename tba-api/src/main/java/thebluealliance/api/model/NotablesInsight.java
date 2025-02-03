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
import thebluealliance.api.model.NotablesInsightData;

/**
 * NotablesInsight
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-03T11:29:24.649848-06:00[America/Chicago]", comments = "Generator version: 7.10.0")
public class NotablesInsight {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private NotablesInsightData data;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  @javax.annotation.Nonnull
  private Integer year;

  public NotablesInsight() {
  }

  public NotablesInsight data(@javax.annotation.Nonnull NotablesInsightData data) {
    
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull

  public NotablesInsightData getData() {
    return data;
  }


  public void setData(@javax.annotation.Nonnull NotablesInsightData data) {
    this.data = data;
  }

  public NotablesInsight name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public NotablesInsight year(@javax.annotation.Nonnull Integer year) {
    
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   */
  @javax.annotation.Nonnull

  public Integer getYear() {
    return year;
  }


  public void setYear(@javax.annotation.Nonnull Integer year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotablesInsight notablesInsight = (NotablesInsight) o;
    return Objects.equals(this.data, notablesInsight.data) &&
        Objects.equals(this.name, notablesInsight.name) &&
        Objects.equals(this.year, notablesInsight.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, name, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotablesInsight {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

