/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brain.core;

public class ValidationResultWrapperJNI {
  public final static native long new_ValidationResult__SWIG_0(boolean jarg1);
  public final static native long new_ValidationResult__SWIG_1(boolean jarg1, String jarg2);
  public final static native long new_ValidationResult__SWIG_2(boolean jarg1, long jarg2, String jarg3);
  public final static native long new_ValidationResult__SWIG_3();
  public final static native void delete_ValidationResult(long jarg1);
  public final static native long ValidationResult_getByName(long jarg1, ValidationResult jarg1_, String jarg2);
  public final static native long ValidationResult_getByUuid(long jarg1, ValidationResult jarg1_, String jarg2);
  public final static native long ValidationResult_getInvalidFieldsUuid(long jarg1, ValidationResult jarg1_);
  public final static native boolean ValidationResult_haveUnskippableConflicts(long jarg1, ValidationResult jarg1_);
  public final static native void ValidationResult_addError(long jarg1, ValidationResult jarg1_, String jarg2);
  public final static native void ValidationResult_revalidate(long jarg1, ValidationResult jarg1_);
  public final static native String ValidationResult_fieldUuid(long jarg1, ValidationResult jarg1_);
  public final static native void ValidationResult_setFieldUUID(long jarg1, ValidationResult jarg1_, String jarg2);
  public final static native long ValidationResult_errors(long jarg1, ValidationResult jarg1_);
  public final static native void ValidationResult_errorsAdd(long jarg1, ValidationResult jarg1_, long jarg2);
  public final static native boolean ValidationResult_isValid(long jarg1, ValidationResult jarg1_);
  public final static native void ValidationResult_setIsValid(long jarg1, ValidationResult jarg1_, boolean jarg2);
  public final static native long ValidationResult_details(long jarg1, ValidationResult jarg1_);
  public final static native void DetailedValidationResult_name_set(long jarg1, DetailedValidationResult jarg1_, String jarg2);
  public final static native String DetailedValidationResult_name_get(long jarg1, DetailedValidationResult jarg1_);
  public final static native void DetailedValidationResult_result_set(long jarg1, DetailedValidationResult jarg1_, long jarg2);
  public final static native long DetailedValidationResult_result_get(long jarg1, DetailedValidationResult jarg1_);
  public final static native long new_DetailedValidationResult__SWIG_0();
  public final static native long new_DetailedValidationResult__SWIG_1(String jarg1, long jarg2);
  public final static native void delete_DetailedValidationResult(long jarg1);
  public final static native long new_FieldsValidatorResult(long jarg1, long jarg2);
  public final static native void delete_FieldsValidatorResult(long jarg1);
  public final static native long combine(long jarg1);
  public final static native long combineDetails(long jarg1);
  public final static native long FieldsValidatorResult_SWIGUpcast(long jarg1);
}
