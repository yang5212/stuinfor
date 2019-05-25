package com.sample;


public class StudentPracticeSkills {

  private long studentPracticeId;
  private long studentId;
  private long staffId;
  private java.sql.Timestamp practiceStart;
  private java.sql.Timestamp practiceEnd;
  private String practiceAddress;
  private String practiceContent;
  private String practiceScore;
  private java.sql.Timestamp regTime;
  private String practiceNote;


  public long getStudentPracticeId() {
    return studentPracticeId;
  }

  public void setStudentPracticeId(long studentPracticeId) {
    this.studentPracticeId = studentPracticeId;
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


  public java.sql.Timestamp getPracticeStart() {
    return practiceStart;
  }

  public void setPracticeStart(java.sql.Timestamp practiceStart) {
    this.practiceStart = practiceStart;
  }


  public java.sql.Timestamp getPracticeEnd() {
    return practiceEnd;
  }

  public void setPracticeEnd(java.sql.Timestamp practiceEnd) {
    this.practiceEnd = practiceEnd;
  }


  public String getPracticeAddress() {
    return practiceAddress;
  }

  public void setPracticeAddress(String practiceAddress) {
    this.practiceAddress = practiceAddress;
  }


  public String getPracticeContent() {
    return practiceContent;
  }

  public void setPracticeContent(String practiceContent) {
    this.practiceContent = practiceContent;
  }


  public String getPracticeScore() {
    return practiceScore;
  }

  public void setPracticeScore(String practiceScore) {
    this.practiceScore = practiceScore;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public String getPracticeNote() {
    return practiceNote;
  }

  public void setPracticeNote(String practiceNote) {
    this.practiceNote = practiceNote;
  }

}
