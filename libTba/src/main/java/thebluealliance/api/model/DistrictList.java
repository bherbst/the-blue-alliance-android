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
 * DistrictList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T08:29:12.737004100-06:00[America/Chicago]", comments = "Generator version: 7.10.0")
public class DistrictList {
  public static final String SERIALIZED_NAME_ABBREVIATION = "abbreviation";
  @SerializedName(SERIALIZED_NAME_ABBREVIATION)
  @javax.annotation.Nonnull
  private String abbreviation;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nonnull
  private String displayName;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  @javax.annotation.Nonnull
  private Integer year;

  public DistrictList() {
  }

  public DistrictList abbreviation(@javax.annotation.Nonnull String abbreviation) {
    
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * The short identifier for the district.
   * @return abbreviation
   */
  @javax.annotation.Nonnull

  public String getAbbreviation() {
    return abbreviation;
  }


  public void setAbbreviation(@javax.annotation.Nonnull String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public DistrictList displayName(@javax.annotation.Nonnull String displayName) {
    
    this.displayName = displayName;
    return this;
  }

  /**
   * The long name for the district.
   * @return displayName
   */
  @javax.annotation.Nonnull

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(@javax.annotation.Nonnull String displayName) {
    this.displayName = displayName;
  }

  public DistrictList key(@javax.annotation.Nonnull String key) {
    
    this.key = key;
    return this;
  }

  /**
   * Key for this district, e.g. &#x60;2016ne&#x60;.
   * @return key
   */
  @javax.annotation.Nonnull

  public String getKey() {
    return key;
  }


  public void setKey(@javax.annotation.Nonnull String key) {
    this.key = key;
  }

  public DistrictList year(@javax.annotation.Nonnull Integer year) {
    
    this.year = year;
    return this;
  }

  /**
   * Year this district participated.
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
    DistrictList districtList = (DistrictList) o;
    return Objects.equals(this.abbreviation, districtList.abbreviation) &&
        Objects.equals(this.displayName, districtList.displayName) &&
        Objects.equals(this.key, districtList.key) &&
        Objects.equals(this.year, districtList.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, displayName, key, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictList {\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

