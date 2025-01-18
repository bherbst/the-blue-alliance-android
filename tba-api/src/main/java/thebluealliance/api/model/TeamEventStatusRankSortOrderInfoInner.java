/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).
 *
 * The version of the OpenAPI document: 3.9.7
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
 * TeamEventStatusRankSortOrderInfoInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-12T10:04:04.013721-06:00[America/Chicago]", comments = "Generator version: 7.10.0")
public class TeamEventStatusRankSortOrderInfoInner {
  public static final String SERIALIZED_NAME_PRECISION = "precision";
  @SerializedName(SERIALIZED_NAME_PRECISION)
  @javax.annotation.Nullable
  private Integer precision;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public TeamEventStatusRankSortOrderInfoInner() {
  }

  public TeamEventStatusRankSortOrderInfoInner precision(@javax.annotation.Nullable Integer precision) {
    
    this.precision = precision;
    return this;
  }

  /**
   * The number of digits of precision used for this value, eg &#x60;2&#x60; would correspond to a value of &#x60;101.11&#x60; while &#x60;0&#x60; would correspond to &#x60;101&#x60;.
   * @return precision
   */
  @javax.annotation.Nullable

  public Integer getPrecision() {
    return precision;
  }


  public void setPrecision(@javax.annotation.Nullable Integer precision) {
    this.precision = precision;
  }

  public TeamEventStatusRankSortOrderInfoInner name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The descriptive name of the value used to sort the ranking.
   * @return name
   */
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusRankSortOrderInfoInner teamEventStatusRankSortOrderInfoInner = (TeamEventStatusRankSortOrderInfoInner) o;
    return Objects.equals(this.precision, teamEventStatusRankSortOrderInfoInner.precision) &&
        Objects.equals(this.name, teamEventStatusRankSortOrderInfoInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precision, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusRankSortOrderInfoInner {\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

