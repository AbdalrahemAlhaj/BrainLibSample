/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brain.core;

public class StringValidatorOptions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringValidatorOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringValidatorOptions obj) {
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
        StringValidatorWrapperJNI.delete_StringValidatorOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StringValidatorOptions(long l, boolean allowB, String templ) {
    this(StringValidatorWrapperJNI.new_StringValidatorOptions(l, allowB, templ), true);
  }

  public void setLimit(long value) {
    StringValidatorWrapperJNI.StringValidatorOptions_limit_set(swigCPtr, this, value);
  }

  public long getLimit() {
    return StringValidatorWrapperJNI.StringValidatorOptions_limit_get(swigCPtr, this);
  }

  public void setAllowBlank(boolean value) {
    StringValidatorWrapperJNI.StringValidatorOptions_allowBlank_set(swigCPtr, this, value);
  }

  public boolean getAllowBlank() {
    return StringValidatorWrapperJNI.StringValidatorOptions_allowBlank_get(swigCPtr, this);
  }

  public void setRegexTemplate(String value) {
    StringValidatorWrapperJNI.StringValidatorOptions_regexTemplate_set(swigCPtr, this, value);
  }

  public String getRegexTemplate() {
    return StringValidatorWrapperJNI.StringValidatorOptions_regexTemplate_get(swigCPtr, this);
  }

}
