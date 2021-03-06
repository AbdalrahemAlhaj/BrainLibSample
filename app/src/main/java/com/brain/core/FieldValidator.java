/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brain.core;

public class FieldValidator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FieldValidator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FieldValidator obj) {
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
        FieldValidatorWrapperJNI.delete_FieldValidator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_ValidationResultPtr validate(SWIGTYPE_p_FieldPtr field) {
    return new SWIGTYPE_p_ValidationResultPtr(FieldValidatorWrapperJNI.FieldValidator_validate(swigCPtr, this, SWIGTYPE_p_FieldPtr.getCPtr(field)), true);
  }

  public SWIGTYPE_p_ValidationResultPtr validateBasicField(SWIGTYPE_p_FieldPtr field) {
    return new SWIGTYPE_p_ValidationResultPtr(FieldValidatorWrapperJNI.FieldValidator_validateBasicField(swigCPtr, this, SWIGTYPE_p_FieldPtr.getCPtr(field)), true);
  }

  public SWIGTYPE_p_ValidationResultPtr validateSocial(SWIGTYPE_p_FieldList fields) {
    return new SWIGTYPE_p_ValidationResultPtr(FieldValidatorWrapperJNI.FieldValidator_validateSocial(swigCPtr, this, SWIGTYPE_p_FieldList.getCPtr(fields)), true);
  }

  public SWIGTYPE_p_ValidationResultPtr validateDuplication(SWIGTYPE_p_FieldList fields) {
    return new SWIGTYPE_p_ValidationResultPtr(FieldValidatorWrapperJNI.FieldValidator_validateDuplication(swigCPtr, this, SWIGTYPE_p_FieldList.getCPtr(fields)), true);
  }

  public FieldValidator() {
    this(FieldValidatorWrapperJNI.new_FieldValidator(), true);
  }

}
