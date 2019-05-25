package com.sample;


public class StudentFamilyMember {

  private long studentFamilyId;
  private long studentId;
  private long staffId;
  private String familyName;
  private String familyApp;
  private long familyAge;
  private String familyZcmm;
  private String workplace;
  private java.sql.Timestamp regTime;
  private String familyNote;


  public long getStudentFamilyId() {
    return studentFamilyId;
  }

  public void setStudentFamilyId(long studentFamilyId) {
    this.studentFamilyId = studentFamilyId;
  }


  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }


  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }


  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public String getFamilyApp() {
    return familyApp;
  }

  public void setFamilyApp(String familyApp) {
    this.familyApp = familyApp;
  }


  public long getFamilyAge() {
    return familyAge;
  }

  public void setFamilyAge(long familyAge) {
    this.familyAge = familyAge;
  }


  public String getFamilyZcmm() {
    return familyZcmm;
  }

  public void setFamilyZcmm(String familyZcmm) {
    this.familyZcmm = familyZcmm;
  }


  public String getWorkplace() {
    return workplace;
  }

  public void setWorkplace(String workplace) {
    this.workplace = workplace;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public String getFamilyNote() {
    return familyNote;
  }

  public void setFamilyNote(String familyNote) {
    this.familyNote = familyNote;
  }

}
