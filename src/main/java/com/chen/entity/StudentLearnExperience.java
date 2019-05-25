package com.sample;


public class StudentLearnExperience {

  private long studentLearnId;
  private long studentId;
  private long staffId;
  private String learnAllyears;
  private String learnSchool;
  private String learnPosition;
  private java.sql.Timestamp regTime;
  private String learnNote;


  public long getStudentLearnId() {
    return studentLearnId;
  }

  public void setStudentLearnId(long studentLearnId) {
    this.studentLearnId = studentLearnId;
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


  public String getLearnAllyears() {
    return learnAllyears;
  }

  public void setLearnAllyears(String learnAllyears) {
    this.learnAllyears = learnAllyears;
  }


  public String getLearnSchool() {
    return learnSchool;
  }

  public void setLearnSchool(String learnSchool) {
    this.learnSchool = learnSchool;
  }


  public String getLearnPosition() {
    return learnPosition;
  }

  public void setLearnPosition(String learnPosition) {
    this.learnPosition = learnPosition;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public String getLearnNote() {
    return learnNote;
  }

  public void setLearnNote(String learnNote) {
    this.learnNote = learnNote;
  }

}
