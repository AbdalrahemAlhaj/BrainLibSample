/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brain.core;

public class Profile {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Profile(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Profile obj) {
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
        ProfileWrapperJNI.delete_Profile(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Profile(String uuid, String name, String prefix, String accountType, String publicKey, SWIGTYPE_p_FieldList fields) {
    this(ProfileWrapperJNI.new_Profile__SWIG_0(uuid, name, prefix, accountType, publicKey, SWIGTYPE_p_FieldList.getCPtr(fields)), true);
  }

  public Profile(String uuid, String name, String prefix, String accountType, String publicKey) {
    this(ProfileWrapperJNI.new_Profile__SWIG_1(uuid, name, prefix, accountType, publicKey), true);
  }

  public Profile(String name, String prefix, String accountType, String publicKey, SWIGTYPE_p_FieldList fields) {
    this(ProfileWrapperJNI.new_Profile__SWIG_2(name, prefix, accountType, publicKey, SWIGTYPE_p_FieldList.getCPtr(fields)), true);
  }

  public Profile() {
    this(ProfileWrapperJNI.new_Profile__SWIG_3(), true);
  }

  public String name() {
    return ProfileWrapperJNI.Profile_name(swigCPtr, this);
  }

  public void setName(String name) {
    ProfileWrapperJNI.Profile_setName(swigCPtr, this, name);
  }

  public String prefix() {
    return ProfileWrapperJNI.Profile_prefix(swigCPtr, this);
  }

  public void setPrefix(String prefix) {
    ProfileWrapperJNI.Profile_setPrefix(swigCPtr, this, prefix);
  }

  public String avatar() {
    return ProfileWrapperJNI.Profile_avatar(swigCPtr, this);
  }

  public void setAvatar(String avatar) {
    ProfileWrapperJNI.Profile_setAvatar(swigCPtr, this, avatar);
  }

  public String accountType() {
    return ProfileWrapperJNI.Profile_accountType(swigCPtr, this);
  }

  public void setAccountType(String type) {
    ProfileWrapperJNI.Profile_setAccountType(swigCPtr, this, type);
  }

  public String publicKey() {
    return ProfileWrapperJNI.Profile_publicKey(swigCPtr, this);
  }

  public void setPublicKey(String key) {
    ProfileWrapperJNI.Profile_setPublicKey(swigCPtr, this, key);
  }

  public String privateKey() {
    return ProfileWrapperJNI.Profile_privateKey(swigCPtr, this);
  }

  public SWIGTYPE_p_StringList signInTypes() {
    return new SWIGTYPE_p_StringList(ProfileWrapperJNI.Profile_signInTypes(swigCPtr, this), false);
  }

  public String toJson() {
    return ProfileWrapperJNI.Profile_toJson(swigCPtr, this);
  }

  public SWIGTYPE_p_json11__Json toJsonObj() {
    return new SWIGTYPE_p_json11__Json(ProfileWrapperJNI.Profile_toJsonObj(swigCPtr, this), true);
  }

  public String calculateModelHash() {
    return ProfileWrapperJNI.Profile_calculateModelHash(swigCPtr, this);
  }

  public boolean equals(Profile other) {
    return ProfileWrapperJNI.Profile_equals(swigCPtr, this, Profile.getCPtr(other), other);
  }

  public int hashCode() {
    return ProfileWrapperJNI.Profile_hashCode(swigCPtr, this);
  }

  public static SWIGTYPE_p_std__shared_ptrT_Profile_t build() {
    return new SWIGTYPE_p_std__shared_ptrT_Profile_t(ProfileWrapperJNI.Profile_build(), true);
  }

  public static SWIGTYPE_p_std__shared_ptrT_Profile_t fromJson(String jsonString) {
    return new SWIGTYPE_p_std__shared_ptrT_Profile_t(ProfileWrapperJNI.Profile_fromJson__SWIG_0(jsonString), true);
  }

  public static SWIGTYPE_p_std__shared_ptrT_Profile_t fromJson(SWIGTYPE_p_json11__Json jsonObj) {
    return new SWIGTYPE_p_std__shared_ptrT_Profile_t(ProfileWrapperJNI.Profile_fromJson__SWIG_1(SWIGTYPE_p_json11__Json.getCPtr(jsonObj)), true);
  }

}
