/*
 * Copyright 2018, 2021 IBM Corp. All Rights Reserved.
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
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.ibm.watson.developer_cloud.service.model.DynamicModel;
import com.ibm.watson.developer_cloud.util.GsonSerializationHelper;
import com.ibm.watson.health.acd.v1.util.CustomCollection;

/**
 * MedicationAnnotation.
 */
public class MedicationAnnotation extends DynamicModel {
  private Type idType = new TypeToken<String>() { } .getType();
  private Type typeType = new TypeToken<String>() { } .getType();
  private Type uidType = new TypeToken<Long>() { } .getType();
  private Type beginType = new TypeToken<Long>() { } .getType();
  private Type endType = new TypeToken<Long>() { } .getType();
  private Type coveredTextType = new TypeToken<String>() { } .getType();
  private Type negatedType = new TypeToken<Boolean>() { } .getType();
  private Type hypotheticalType = new TypeToken<Boolean>() { } .getType();
  private Type sectionNormalizedNameType = new TypeToken<String>() { } .getType();
  private Type cuiType = new TypeToken<String>() { } .getType();
  private Type drugType = new TypeToken<List<Map>>() { } .getType();
  private Type sectionSurfaceFormType = new TypeToken<String>() { } .getType();
  private Type insightModelDataType = new TypeToken<InsightModelData>() { } .getType();
  private Type temporalType = new TypeToken<List<Temporal>>() { } .getType();
  private Type disambiguationDataType = new TypeToken<Disambiguation>() { } .getType();


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
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("negated"), negatedType);
  }

  /**
   * Gets the hypothetical.
   *
   * @return the hypothetical
   */
  public Boolean isHypothetical() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("hypothetical"), hypotheticalType);
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
   * Gets the cui.
   *
   * @return the cui
   */
  public String getCui() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("cui"), cuiType);
  }

  /**
   * Gets the drug.
   *
   * @return the drug
   */
  public List<CustomCollection> getDrug() {
    List<Object> listObjects = GsonSerializationHelper.serializeDynamicModelProperty(this.get("drug"), drugType);
    CustomCollection customCollection = new CustomCollection();
    List<CustomCollection> listValues = customCollection.convertToCustomCollectionList(listObjects);
    return listValues;
  }

  /**
   * Gets the sectionSurfaceForm.
   *
   * @return the sectionSurfaceForm
   */
  public String getSectionSurfaceForm() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("sectionSurfaceForm"), sectionSurfaceFormType);
  }

  /**
   * Gets the insightModelData.
   * @return the insightModelData
   */
  public InsightModelData getInsightModelData() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("insightModelData"), insightModelDataType);
  }

  /**
   * Gets the temporal.
   *
   * @return the temporal
   */
  public List<Temporal> getTemporal() {
	  return GsonSerializationHelper.serializeDynamicModelProperty(this.get("temporal"), temporalType);
  }

  /**
   * Gets the disambiguationData.
   *
   * @return the disambiguationData
   */
  public Disambiguation getDisambiguationData() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("disambiguationData"), disambiguationDataType);
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(final String id) {
    this.put("id", id);
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(final String type) {
    this.put("type", type);
  }

  /**
   * Sets the uid.
   *
   * @param uid the new uid
   */
  public void setUid(final Long uid) {
    this.put("uid", uid);
  }

  /**
   * Sets the begin.
   *
   * @param begin the new begin
   */
  public void setBegin(final Long begin) {
    this.put("begin", begin);
  }

  /**
   * Sets the end.
   *
   * @param end the new end
   */
  public void setEnd(final Long end) {
    this.put("end", end);
  }

  /**
   * Sets the coveredText.
   *
   * @param coveredText the new coveredText
   */
  public void setCoveredText(final String coveredText) {
    this.put("coveredText", coveredText);
  }

  /**
   * Sets the negated.
   *
   * @param negated the new negated
   */
  public void setNegated(final Boolean negated) {
    this.put("negated", negated);
  }

  /**
   * Sets the hypothetical.
   *
   * @param hypothetical the new hypothetical
   */
  public void setHypothetical(final Boolean hypothetical) {
    this.put("hypothetical", hypothetical);
  }

  /**
   * Sets the sectionNormalizedName.
   *
   * @param sectionNormalizedName the new sectionNormalizedName
   */
  public void setSectionNormalizedName(final String sectionNormalizedName) {
    this.put("sectionNormalizedName", sectionNormalizedName);
  }

  /**
   * Sets the cui.
   *
   * @param cui the new cui
   */
  public void setCui(final String cui) {
    this.put("cui", cui);
  }

  /**
   * Sets the drug.
   *
   * @param drug the new drug
   */
  public void setDrug(final List<Map> drug) {
    this.put("drug", drug);
  }

  /**
   * Sets the sectionSurfaceForm.
   *
   * @param sectionSurfaceForm the new sectionSurfaceForm
   */
  public void setSectionSurfaceForm(final String sectionSurfaceForm) {
    this.put("sectionSurfaceForm", sectionSurfaceForm);
  }

  /**
   * Sets the insightModelData.
   *
   * @param insightModelData the new insightModelData
   */
  public void setInsightModelData(final InsightModelData insightModelData) {
      this.put("insightModelData", insightModelData);
  }

  /**
   * Sets the temporal.
   *
   * @param temporal the new temporal
   */
  public void setTemporal(final List<Temporal> temporal) {
    this.put("temporal", temporal);
  }

  /**
   * Sets the disambiguationData.
   *
   * @param disambiguationData the new disambiguationData
   */
  public void setDisambiguationData(final Disambiguation disambiguationData) {
      this.put("disambiguationData", disambiguationData);
  }

/*
 *
 * Manually Added code
 *
 * */
public CustomCollection getDrug(int index) {
    List<Object> listObjects = GsonSerializationHelper.serializeDynamicModelProperty(this.get("drug"), drugType);
    CustomCollection customCollection = new CustomCollection();
    CustomCollection drug = customCollection.convertToCustomCollection(listObjects.get(index));
    return drug;
  }
}
