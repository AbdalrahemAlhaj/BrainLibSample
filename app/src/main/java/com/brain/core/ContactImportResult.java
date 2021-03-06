/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brain.core;

public class ContactImportResult {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ContactImportResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ContactImportResult obj) {
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
        ContactImportResultWrapperJNI.delete_ContactImportResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ContactImportResult() {
    this(ContactImportResultWrapperJNI.new_ContactImportResult__SWIG_0(), true);
  }

  public ContactImportResult(SWIGTYPE_p_ContactList contacts, SWIGTYPE_p_std__unordered_mapT_std__string_StringList_t groups) {
    this(ContactImportResultWrapperJNI.new_ContactImportResult__SWIG_1(SWIGTYPE_p_ContactList.getCPtr(contacts), SWIGTYPE_p_std__unordered_mapT_std__string_StringList_t.getCPtr(groups)), true);
  }

  public SWIGTYPE_p_ContactList contacts() {
    return new SWIGTYPE_p_ContactList(ContactImportResultWrapperJNI.ContactImportResult_contacts(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__unordered_mapT_std__string_StringList_t groups() {
    return new SWIGTYPE_p_std__unordered_mapT_std__string_StringList_t(ContactImportResultWrapperJNI.ContactImportResult_groups(swigCPtr, this), false);
  }

}
