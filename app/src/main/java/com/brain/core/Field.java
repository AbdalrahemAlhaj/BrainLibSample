/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brain.core;

public class Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FieldWrapperJNI.delete_Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Field(String uuid, String value, SWIGTYPE_p_FieldList fields) {
    this(FieldWrapperJNI.new_Field__SWIG_0(uuid, value, SWIGTYPE_p_FieldList.getCPtr(fields)), true);
  }

  public Field(String uuid, SWIGTYPE_p_FieldCategory category, String value, SWIGTYPE_p_FieldList fields) {
    this(FieldWrapperJNI.new_Field__SWIG_1(uuid, SWIGTYPE_p_FieldCategory.getCPtr(category), value, SWIGTYPE_p_FieldList.getCPtr(fields)), true);
  }

  public Field(String uuid, SWIGTYPE_p_FieldCategory category, String value) {
    this(FieldWrapperJNI.new_Field__SWIG_2(uuid, SWIGTYPE_p_FieldCategory.getCPtr(category), value), true);
  }

  public Field(SWIGTYPE_p_FieldCategory category, String value, SWIGTYPE_p_FieldList fields) {
    this(FieldWrapperJNI.new_Field__SWIG_3(SWIGTYPE_p_FieldCategory.getCPtr(category), value, SWIGTYPE_p_FieldList.getCPtr(fields)), true);
  }

  public Field(SWIGTYPE_p_FieldCategory category, String value) {
    this(FieldWrapperJNI.new_Field__SWIG_4(SWIGTYPE_p_FieldCategory.getCPtr(category), value), true);
  }

  public Field(String uuid, String categoryName, String value, SWIGTYPE_p_FieldList fields) {
    this(FieldWrapperJNI.new_Field__SWIG_5(uuid, categoryName, value, SWIGTYPE_p_FieldList.getCPtr(fields)), true);
  }

  public Field(String categoryName, String value, SWIGTYPE_p_FieldList fields, String uuid) {
    this(FieldWrapperJNI.new_Field__SWIG_6(categoryName, value, SWIGTYPE_p_FieldList.getCPtr(fields), uuid), true);
  }

  public Field(String categoryName, String value) {
    this(FieldWrapperJNI.new_Field__SWIG_7(categoryName, value), true);
  }

  public Field() {
    this(FieldWrapperJNI.new_Field__SWIG_8(), true);
  }

  public String categoryName() {
    return FieldWrapperJNI.Field_categoryName(swigCPtr, this);
  }

  public void setCategory(SWIGTYPE_p_FieldCategory cat) {
    FieldWrapperJNI.Field_setCategory(swigCPtr, this, SWIGTYPE_p_FieldCategory.getCPtr(cat));
  }

  public String value() {
    return FieldWrapperJNI.Field_value(swigCPtr, this);
  }

  public void setValue(String v) {
    FieldWrapperJNI.Field_setValue(swigCPtr, this, v);
  }

  public SWIGTYPE_p_FieldCategory category() {
    return new SWIGTYPE_p_FieldCategory(FieldWrapperJNI.Field_category(swigCPtr, this), true);
  }

  public String countryCodeConflictState() {
    return FieldWrapperJNI.Field_countryCodeConflictState(swigCPtr, this);
  }

  public void setCountryCodeConflictState(String state) {
    FieldWrapperJNI.Field_setCountryCodeConflictState(swigCPtr, this, state);
  }

  public boolean conflict() {
    return FieldWrapperJNI.Field_conflict(swigCPtr, this);
  }

  public int hashCode() {
    return FieldWrapperJNI.Field_hashCode(swigCPtr, this);
  }

  public boolean equals(SWIGTYPE_p_FieldPtr other) {
    return FieldWrapperJNI.Field_equals(swigCPtr, this, SWIGTYPE_p_FieldPtr.getCPtr(other));
  }

  public void setCloudVerified(boolean cloudVerified) {
    FieldWrapperJNI.Field_setCloudVerified(swigCPtr, this, cloudVerified);
  }

  public boolean cloudVerified() {
    return FieldWrapperJNI.Field_cloudVerified(swigCPtr, this);
  }

  public void setFromContact(boolean fromContact) {
    FieldWrapperJNI.Field_setFromContact(swigCPtr, this, fromContact);
  }

  public void setHidden(boolean hidden) {
    FieldWrapperJNI.Field_setHidden(swigCPtr, this, hidden);
  }

  public void setSocialType(String socialType) {
    FieldWrapperJNI.Field_setSocialType(swigCPtr, this, socialType);
  }

  public String socialType() {
    return FieldWrapperJNI.Field_socialType(swigCPtr, this);
  }

  public void setObjectId(String objectId) {
    FieldWrapperJNI.Field_setObjectId(swigCPtr, this, objectId);
  }

  public String objectId() {
    return FieldWrapperJNI.Field_objectId(swigCPtr, this);
  }

  public void setLabel(String label) {
    FieldWrapperJNI.Field_setLabel(swigCPtr, this, label);
  }

  public String label() {
    return FieldWrapperJNI.Field_label(swigCPtr, this);
  }

  public void setParentUuid(String parentUuid) {
    FieldWrapperJNI.Field_setParentUuid(swigCPtr, this, parentUuid);
  }

  public String parentUuid() {
    return FieldWrapperJNI.Field_parentUuid(swigCPtr, this);
  }

  public void linkedUuidsAdd(SWIGTYPE_p_StringList linkedUuids) {
    FieldWrapperJNI.Field_linkedUuidsAdd(swigCPtr, this, SWIGTYPE_p_StringList.getCPtr(linkedUuids));
  }

  public SWIGTYPE_p_StringList linkedUuids() {
    return new SWIGTYPE_p_StringList(FieldWrapperJNI.Field_linkedUuids(swigCPtr, this), false);
  }

  public void setVerified(boolean verified) {
    FieldWrapperJNI.Field_setVerified(swigCPtr, this, verified);
  }

  public boolean verified() {
    return FieldWrapperJNI.Field_verified(swigCPtr, this);
  }

  public void setPreferred(boolean preferred) {
    FieldWrapperJNI.Field_setPreferred(swigCPtr, this, preferred);
  }

  public boolean preferred() {
    return FieldWrapperJNI.Field_preferred(swigCPtr, this);
  }

  public int rowId() {
    return FieldWrapperJNI.Field_rowId(swigCPtr, this);
  }

  public String ownerUuid() {
    return FieldWrapperJNI.Field_ownerUuid(swigCPtr, this);
  }

  public int sequence() {
    return FieldWrapperJNI.Field_sequence(swigCPtr, this);
  }

  public String calculateModelHash() {
    return FieldWrapperJNI.Field_calculateModelHash(swigCPtr, this);
  }

  public String toJson() {
    return FieldWrapperJNI.Field_toJson(swigCPtr, this);
  }

  public SWIGTYPE_p_json11__Json toJsonObj() {
    return new SWIGTYPE_p_json11__Json(FieldWrapperJNI.Field_toJsonObj(swigCPtr, this), true);
  }

  public static SWIGTYPE_p_FieldPtr build(SWIGTYPE_p_FieldPtr other) {
    return new SWIGTYPE_p_FieldPtr(FieldWrapperJNI.Field_build__SWIG_0(SWIGTYPE_p_FieldPtr.getCPtr(other)), true);
  }

  public static SWIGTYPE_p_FieldPtr build(SWIGTYPE_p_FieldCategory category) {
    return new SWIGTYPE_p_FieldPtr(FieldWrapperJNI.Field_build__SWIG_1(SWIGTYPE_p_FieldCategory.getCPtr(category)), true);
  }

  public static SWIGTYPE_p_FieldPtr build(SWIGTYPE_p_FieldCategory category, String value) {
    return new SWIGTYPE_p_FieldPtr(FieldWrapperJNI.Field_build__SWIG_2(SWIGTYPE_p_FieldCategory.getCPtr(category), value), true);
  }

  public static SWIGTYPE_p_FieldPtr build(String categoryName, String value) {
    return new SWIGTYPE_p_FieldPtr(FieldWrapperJNI.Field_build__SWIG_3(categoryName, value), true);
  }

  public static SWIGTYPE_p_FieldPtr fromJson(String jsonString) {
    return new SWIGTYPE_p_FieldPtr(FieldWrapperJNI.Field_fromJson__SWIG_0(jsonString), true);
  }

  public static SWIGTYPE_p_FieldPtr fromJson(SWIGTYPE_p_json11__Json jsonObj) {
    return new SWIGTYPE_p_FieldPtr(FieldWrapperJNI.Field_fromJson__SWIG_1(SWIGTYPE_p_json11__Json.getCPtr(jsonObj)), true);
  }

  public static boolean haveFieldWithValue(SWIGTYPE_p_FieldList fields, SWIGTYPE_p_FieldCategory category, String value) {
    return FieldWrapperJNI.Field_haveFieldWithValue(SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_FieldCategory.getCPtr(category), value);
  }

  public static boolean haveNoVars(SWIGTYPE_p_FieldList fields) {
    return FieldWrapperJNI.Field_haveNoVars(SWIGTYPE_p_FieldList.getCPtr(fields));
  }

  public static SWIGTYPE_p_FieldPtr findByCategory(SWIGTYPE_p_FieldList fields, SWIGTYPE_p_FieldCategory category) {
    return new SWIGTYPE_p_FieldPtr(FieldWrapperJNI.Field_findByCategory(SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_FieldCategory.getCPtr(category)), true);
  }

  public static SWIGTYPE_p_FieldList findSame(SWIGTYPE_p_FieldList fields, SWIGTYPE_p_FieldPtr field) {
    return new SWIGTYPE_p_FieldList(FieldWrapperJNI.Field_findSame(SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_FieldPtr.getCPtr(field)), true);
  }

  public static SWIGTYPE_p_FieldList findByCategoryAndValue(SWIGTYPE_p_FieldList fields, SWIGTYPE_p_FieldCategory category, String value, String socialType) {
    return new SWIGTYPE_p_FieldList(FieldWrapperJNI.Field_findByCategoryAndValue(SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_FieldCategory.getCPtr(category), value, socialType), true);
  }

  public static SWIGTYPE_p_FieldList findAllByCategory(SWIGTYPE_p_FieldList fields, SWIGTYPE_p_FieldCategory category) {
    return new SWIGTYPE_p_FieldList(FieldWrapperJNI.Field_findAllByCategory(SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_FieldCategory.getCPtr(category)), true);
  }

  public static boolean containsCommon(SWIGTYPE_p_FieldList fields, SWIGTYPE_p_FieldList otherFields) {
    return FieldWrapperJNI.Field_containsCommon(SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_FieldList.getCPtr(otherFields));
  }

  public static SWIGTYPE_p_FieldList findAllByCategories(SWIGTYPE_p_FieldList fields, SWIGTYPE_p_std__listT_FieldCategory_t categories) {
    return new SWIGTYPE_p_FieldList(FieldWrapperJNI.Field_findAllByCategories(SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_std__listT_FieldCategory_t.getCPtr(categories)), true);
  }

  public static void remove(SWIGTYPE_p_FieldPtr field, SWIGTYPE_p_FieldList fieldsToRemove) {
    FieldWrapperJNI.Field_remove(SWIGTYPE_p_FieldPtr.getCPtr(field), SWIGTYPE_p_FieldList.getCPtr(fieldsToRemove));
  }

}
