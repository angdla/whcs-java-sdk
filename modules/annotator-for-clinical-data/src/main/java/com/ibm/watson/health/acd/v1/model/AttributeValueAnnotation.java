/*
 * Copyright 2021 IBM Corp. All Rights Reserved.
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
 * AttributeValueAnnotation.
 */
public class AttributeValueAnnotation extends DynamicModel {

  private Type idType = new TypeToken<String>() { } .getType();
  private Type typeType = new TypeToken<String>() { } .getType();
  private Type uidType = new TypeToken<Long>() { } .getType();
  private Type beginType = new TypeToken<Long>() { } .getType();
  private Type endType = new TypeToken<Long>() { } .getType();
  private Type coveredTextType = new TypeToken<String>() { } .getType();
  private Type negatedType = new TypeToken<Boolean>() { } .getType();
  private Type hypotheticalType = new TypeToken<Boolean>() { } .getType();
  private Type preferredNameType = new TypeToken<String>() { } .getType();
  private Type valuesType = new TypeToken<List<Map>>() { } .getType();
  private Type sourceType = new TypeToken<String>() { } .getType();
  private Type sourceVersionType = new TypeToken<String>() { } .getType();
  private Type conceptType = new TypeToken<Concept>() { } .getType();
  private Type nameType = new TypeToken<String>() { } .getType();
  private Type sectionNormalizedNameType = new TypeToken<String>() { } .getType();
  private Type sectionSurfaceFormType = new TypeToken<String>() { } .getType();
  private Type icd9CodeType = new TypeToken<String>() { } .getType();
  private Type icd10CodeType = new TypeToken<String>() { } .getType();
  private Type snomedConceptIdType = new TypeToken<String>() { } .getType();
  private Type nciCodeType = new TypeToken<String>() { } .getType();
  private Type meshIdType = new TypeToken<String>() { } .getType();
  private Type rxNormIdType = new TypeToken<String>() { } .getType();
  private Type loincIdType = new TypeToken<String>() { } .getType();
  private Type vocabsType = new TypeToken<String>() { } .getType();
  private Type cptCodeType = new TypeToken<String>() { } .getType();
  private Type ccsCodeType = new TypeToken<String>() { } .getType();
  private Type hccCodeType = new TypeToken<String>() { } .getType();
  private Type disambiguationDataType = new TypeToken<Disambiguation>() { } .getType();
  private Type insightModelDataType = new TypeToken<InsightModelData>() { } .getType();
  private Type ruleIdType = new TypeToken<String>() { } .getType();
  private Type derivedFromType = new TypeToken<List<Concept>>() { } .getType();
  private Type temporalType = new TypeToken<List<Temporal>>() { } .getType();
  private Type evidenceSpansType = new TypeToken<List<Reference>>() { } .getType();

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
   * Gets the preferredName.
   *
   * @return the preferredName
   */
  public String getPreferredName() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("preferredName"), preferredNameType);
  }

  /**
   * Gets the values.
   *
   * @return the values
   */
  public List<CustomCollection> getValues() {
    List<Object> listObjects = GsonSerializationHelper.serializeDynamicModelProperty(this.get("values"), valuesType);
    CustomCollection customCollection = new CustomCollection();
    List<CustomCollection> listValues = customCollection.convertToCustomCollectionList(listObjects);
    return listValues;
  }

  /*
   *
   * Manually Added code
   *
   * */
  public CustomCollection getValues(int index) {
    List<Object> listObjects = GsonSerializationHelper.serializeDynamicModelProperty(this.get("values"), valuesType);
    CustomCollection customCollection = new CustomCollection();
    CustomCollection values = customCollection.convertToCustomCollection(listObjects.get(index));
    return values;
  }

  /**
   * Gets the source.
   *
   * @return the source
   */
  public String getSource() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("source"), sourceType);
  }

  /**
   * Gets the sourceVersion.
   *
   * @return the sourceVersion
   */
  public String getSourceVersion() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("sourceVersion"), sourceVersionType);
  }

  /**
   * Gets the concept.
   *
   * @return the concept
   */
  public Concept getConcept() {
      return GsonSerializationHelper.serializeDynamicModelProperty(this.get("concept"), conceptType);
    }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("name"), nameType);
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

  /**
   * Get icd9 code or null.
   * @return the icd9 code
   */
  public String getIcd9Code() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("icd9Code"), icd9CodeType);
  }

  /**
   * Get icd10 code or null.
   * @return t he icd10 code
   */
  public String getIcd10Code() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("icd10Code"), icd10CodeType);
  }

  /**
   * Get snomed code or null.
   * @return the snomed identifier
   */
  public String getSnomedConceptId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("snomedConceptId"), snomedConceptIdType);
  }

  /**
   * Get snomed nci code or null.
   * @return the nci code
   */
  public String getNciCode() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("nciCode"), nciCodeType);
  }

  /**
   * Get Medical Subject Heading id or null.
   * @return the mesh identifier
   */
  public String getMeshId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("meshId"), meshIdType);
  }

  /**
   * Get Rx norm id or null.
   * @return the rx norm identifier
   */
  public String getRxNormId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("rxNormId"), rxNormIdType);
  }

  /**
   * Get Loinc id or null.
   * @return the loinc identifier
   */
  public String getLoincId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("loincId"), loincIdType);
  }

  /**
   * Get vocabularies or null.
   * @return artifact vocabs
   */
  public String getVocabs() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("vocabs"), vocabsType);
  }

  /**
   * Gets the getCptCode.
   * @return the getCptCode
   */
  public String getCptCode() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("cptCode"), cptCodeType);
  }

  /**
   * Gets the getCcsCode.
   * @return the getCcsCode
   */
  public String getCcsCode() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("ccsCode"), ccsCodeType);
  }

  /**
   * Gets the getHccCode.
   * @return the getHccCode
   */
  public String getHccCode() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("hccCode"), hccCodeType);
  }

  /**
   * Gets the getdisambiguationData.
   * @return the getDisambiguationData
   */
  public Disambiguation getDisambiguationData() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("disambiguationData"), disambiguationDataType);
  }

  /**
   * Gets the insightModelData.
   * @return the insightModelData
   */
  public InsightModelData getInsightModelData() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("insightModelData"), insightModelDataType);
  }

  /**
   * Gets the ruleId.
   * @return the ruleId
   */
  public String getRuleId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("ruleId"), ruleIdType);
  }

  /**
   * Gets the derivedFrom.
   *
   * @return the derivedFrom
   */
  public List<Concept> getDerivedFrom() {
	  return GsonSerializationHelper.serializeDynamicModelProperty(this.get("derivedFrom"), derivedFromType);
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
   * Gets the evidenceSpans.
   *
   * @return the evidenceSpans
   */
  public List<Reference> getEvidenceSpans() {
	  return GsonSerializationHelper.serializeDynamicModelProperty(this.get("evidenceSpans"), evidenceSpansType);
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
   * Sets the preferredName.
   *
   * @param preferredName the new preferredName
   */
  public void setPreferredName(final String preferredName) {
    this.put("preferredName", preferredName);
  }

  /**
   * Sets the values.
   *
   * @param values the new values
   */
  public void setValues(final List<Map> values) {
    this.put("values", values);
  }

  /**
   * Sets the source.
   *
   * @param source the new source
   */
  public void setSource(final String source) {
    this.put("source", source);
  }

  /**
   * Sets the sourceVersion.
   *
   * @param sourceVersion the new sourceVersion
   */
  public void setSourceVersion(final String sourceVersion) {
    this.put("sourceVersion", sourceVersion);
  }

  /**
   * Sets the concept.
   *
   * @param concept the new concept
   */
  public void setConcept(final Concept concept) {
      this.put("concept", concept);
    }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.put("name", name);
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
   * Sets the sectionNormalizedName.
   *
   * @param sectionNormalizedName the new sectionNormalizedName
   */
  public void setSectionNormalizedName(final String sectionNormalizedName) {
    this.put("sectionNormalizedName", sectionNormalizedName);
  }


  /**
   * Sets the icd 9 code.
   *
   * @param icd9Code the new icd 9 Code
   */
  public void setIcd9Code(final String icd9Code) {
  this.put("icd9Code", icd9Code);
  }

  /**
   * Sets the icd 10 code.
   *
   * @param icd10Code the new icd 10 code
   */
  public void setIcd10Code(final String icd10Code) {
    this.put("icd10Code", icd10Code);
  }

  /**
   * Sets the snomed concept id.
   *
   * @param snomedConceptId the new snomed concept id
   */
  public void setSnomedConceptId(final String snomedConceptId) {
    this.put("snomedConceptId", snomedConceptId);
  }

  /**
   * Sets the nci code.
   *
   * @param nciCode the new nci code
   */
  public void setNciCode(final String nciCode) {
    this.put("nciCode", nciCode);
  }

  /**
   * Sets the mesh id.
   *
   * @param meshId the new mesh id
   */
  public void setMeshId(final String meshId) {
    this.put("meshId", meshId);
  }

  /**
   * Sets the rx norm id.
   *
   * @param rxNormId the new rx norm id
   */
  public void setRxNormId(final String rxNormId) {
    this.put("rxNormId", rxNormId);
  }

  /**
   * Sets the loinc id.
   *
   * @param loincId the new loinc id
   */
  public void setLoincId(final String loincId) {
    this.put("loincId", loincId);
  }

  /**
   * Sets the vocabs.
   *
   * @param vocabs the new vocabs id
   */
  public void setVocabs(final String vocabs) {
    this.put("vocabs", vocabs);
  }

  /**
   * Sets the cpt code.
   *
   * @param cptCode the new cpt code
   */
  public void setCptCode(final String cptCode) {
    this.put("cptCode", cptCode);
  }

  /**
   * Sets the ccs code.
   *
   * @param ccsCode the new ccs code
   */
  public void setCcsCode(final String ccsCode) {
    this.put("ccsCode", ccsCode);
  }

  /**
   * Sets the hcc code.
   *
   * @param hccCode the new hcc code
   */
  public void setHccCode(final String hccCode) {
    this.put("hccCode", hccCode);
  }

  /**
   * Sets the disambiguation data.
   *
   * @param disambiguationData the new disambiguation data
   */
  public void setDisambiguationData(final Disambiguation disambiguationData) {
      this.put("disambiguationData", disambiguationData);
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
   * Sets the ruleId.
   *
   * @param ruleId the new rule Id
   */
  public void setRuleId(final String ruleId) {
    this.put("ruleId", ruleId);
  }

  /**
   * Sets the derivedFrom.
   *
   * @param derivedFrom the new derivedFrom
   */
  public void setDerivedFrom(final List<Concept> derivedFrom) {
    this.put("derivedFrom", derivedFrom);
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
   * Sets the evidenceSpans.
   *
   * @param evidenceSpans the new evidenceSpans
   */
  public void setEvidenceSpans(final List<Reference> evidenceSpans) {
    this.put("evidenceSpans", evidenceSpans);
  }

}
