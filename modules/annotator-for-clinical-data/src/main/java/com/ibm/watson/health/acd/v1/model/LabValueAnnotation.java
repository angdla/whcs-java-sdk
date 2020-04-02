/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.health.acd.v1.model;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.ibm.watson.developer_cloud.service.model.DynamicModel;
import com.ibm.watson.developer_cloud.util.GsonSerializationHelper;

/**
 * LabValueAnnotation.
 */
public class LabValueAnnotation extends DynamicModel {
  private Type idType = new TypeToken<String>() { } .getType();
  private Type typeType = new TypeToken<String>() { } .getType();
  private Type uidType = new TypeToken<Long>() { } .getType();
  private Type beginType = new TypeToken<Long>() { } .getType();
  private Type endType = new TypeToken<Long>() { } .getType();
  private Type coveredTextType = new TypeToken<String>() { } .getType();
  private Type negatedType = new TypeToken<Boolean>() { } .getType();
  private Type hypotheticalType = new TypeToken<Boolean>() { } .getType();
  private Type loincIdType = new TypeToken<String>() { } .getType();
  private Type lowValueType = new TypeToken<String>() { } .getType();
  private Type dateInMillisecondsType = new TypeToken<String>() { } .getType();
  private Type labTypeSurfaceFormType = new TypeToken<String>() { } .getType();
  private Type labTypeNormalizedNameType = new TypeToken<String>() { } .getType();
  private Type labValueType = new TypeToken<String>() { } .getType();
  private Type sectionNormalizedNameType = new TypeToken<String>() { } .getType();
  private Type sectionSurfaceFormType = new TypeToken<String>() { } .getType();


  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("id"), idType);
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String getType() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("type"), typeType);
  }

  /**
   * Gets the uid.
   *
   * @return the uid
   */
  public Long getUid() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("uid"), uidType);
  }

  /**
   * Gets the begin.
   *
   * @return the begin
   */
  public Long getBegin() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("begin"), beginType);
  }

  /**
   * Gets the end.
   *
   * @return the end
   */
  public Long getEnd() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("end"), endType);
  }

  /**
   * Gets the coveredText.
   *
   * @return the coveredText
   */
  public String getCoveredText() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("coveredText"), coveredTextType);
  }

  /**
   * Gets the negated.
   *
   * @return the negated
   */
  public Boolean isNegated() {
	  Boolean negated = GsonSerializationHelper.serializeDynamicModelProperty(this.get("negated"), negatedType);
	  if (negated == null) {
		  negated = false;
	  }
	  return negated;
  }

  /**
   * Gets the hypothetical.
   *
   * @return the hypothetical
   */
  public Boolean isHypothetical() {
	  Boolean hypothetical = GsonSerializationHelper.serializeDynamicModelProperty(this.get("hypothetical"), hypotheticalType);
	  if (hypothetical == null) {
		  hypothetical = false;
	  }
	  return hypothetical;
  }

  /**
   * Gets the loincId.
   *
   * @return the loincId
   */
  public String getLoincId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("loincId"), loincIdType);
  }

  /**
   * Gets the lowValue.
   *
   * @return the lowValue
   */
  public String getLowValue() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("lowValue"), lowValueType);
  }

  /**
   * Gets the dateInMilliseconds.
   *
   * @return the dateInMilliseconds
   */
  public String getDateInMilliseconds() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("dateInMilliseconds"), dateInMillisecondsType);
  }

  /**
   * Gets the labTypeSurfaceForm.
   *
   * @return the labTypeSurfaceForm
   */
  public String getLabTypeSurfaceForm() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("labTypeSurfaceForm"), labTypeSurfaceFormType);
  }

  /**
   * Gets the labTypeNormalizedName.
   *
   * @return the labTypeNormalizedName
   */
  public String getLabTypeNormalizedName() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("labTypeNormalizedName"), labTypeNormalizedNameType);
  }

  /**
   * Gets the labValue.
   *
   * @return the labValue
   */
  public String getLabValue() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("labValue"), labValueType);
  }

  /**
   * Gets the sectionNormalizedName.
   *
   * @return the sectionNormalizedName
   */
  public String getSectionNormalizedName() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("sectionNormalizedName"), sectionNormalizedNameType);
  }

  /**
   * Gets the sectionSurfaceForm.
   *
   * @return the sectionSurfaceForm
   */
  public String getSectionSurfaceForm() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("sectionSurfaceForm"), sectionSurfaceFormType);
  }


//  /**
//   * Sets the id.
//   *
//   * @param id the new id
//   */
//  public void setId(final String id) {
//    this.put("id", id);
//  }
//
//  /**
//   * Sets the type.
//   *
//   * @param type the new type
//   */
//  public void setType(final String type) {
//    this.put("type", type);
//  }
//
//  /**
//   * Sets the uid.
//   *
//   * @param uid the new uid
//   */
//  public void setUid(final Long uid) {
//    this.put("uid", uid);
//  }
//
//  /**
//   * Sets the begin.
//   *
//   * @param begin the new begin
//   */
//  public void setBegin(final Long begin) {
//    this.put("begin", begin);
//  }
//
//  /**
//   * Sets the end.
//   *
//   * @param end the new end
//   */
//  public void setEnd(final Long end) {
//    this.put("end", end);
//  }
//
//  /**
//   * Sets the coveredText.
//   *
//   * @param coveredText the new coveredText
//   */
//  public void setCoveredText(final String coveredText) {
//    this.put("coveredText", coveredText);
//  }
//
//  /**
//   * Sets the negated.
//   *
//   * @param negated the new negated
//   */
//  public void setNegated(final Boolean negated) {
//    this.put("negated", negated);
//  }
//
//  /**
//   * Sets the hypothetical.
//   *
//   * @param hypothetical the new hypothetical
//   */
//  public void setHypothetical(final Boolean hypothetical) {
//    this.put("hypothetical", hypothetical);
//  }
//
//  /**
//   * Sets the loincId.
//   *
//   * @param loincId the new loincId
//   */
//  public void setLoincId(final String loincId) {
//    this.put("loincId", loincId);
//  }
//
//  /**
//   * Sets the lowValue.
//   *
//   * @param lowValue the new lowValue
//   */
//  public void setLowValue(final String lowValue) {
//    this.put("lowValue", lowValue);
//  }
//
//  /**
//   * Sets the dateInMilliseconds.
//   *
//   * @param dateInMilliseconds the new dateInMilliseconds
//   */
//  public void setDateInMilliseconds(final String dateInMilliseconds) {
//    this.put("dateInMilliseconds", dateInMilliseconds);
//  }
//
//  /**
//   * Sets the labTypeSurfaceForm.
//   *
//   * @param labTypeSurfaceForm the new labTypeSurfaceForm
//   */
//  public void setLabTypeSurfaceForm(final String labTypeSurfaceForm) {
//    this.put("labTypeSurfaceForm", labTypeSurfaceForm);
//  }
//
//  /**
//   * Sets the labTypeNormalizedName.
//   *
//   * @param labTypeNormalizedName the new labTypeNormalizedName
//   */
//  public void setLabTypeNormalizedName(final String labTypeNormalizedName) {
//    this.put("labTypeNormalizedName", labTypeNormalizedName);
//  }
//
//  /**
//   * Sets the labValue.
//   *
//   * @param labValue the new labValue
//   */
//  public void setLabValue(final String labValue) {
//    this.put("labValue", labValue);
//  }
//
//  /**
//   * Sets the sectionSurfaceForm.
//   *
//   * @param sectionSurfaceForm the new sectionSurfaceForm
//   */
//  public void setSectionSurfaceForm(final String sectionSurfaceForm) {
//    this.put("sectionSurfaceForm", sectionSurfaceForm);
//  }
//
//
//  /**
//   * Sets the sectionNormalizedName.
//   *
//   * @param sectionNormalizedName the new sectionNormalizedName
//   */
//  public void setSectionNormalizedName(final String sectionNormalizedName) {
//    this.put("sectionNormalizedName", sectionNormalizedName);
//  }
}

