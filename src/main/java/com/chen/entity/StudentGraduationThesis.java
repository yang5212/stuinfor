package com.sample;

/**
 * 
 * @author chen
 */
public class StudentGraduationThesis {

  private long studentPaperId;
  private long studentId;
  private long staffId;
  private String paperTitle;
  private String paperTeacher;
  private String paperStart;
  private java.sql.Timestamp paperTime;
  private String paperScore;
  private String paperComments;
  private java.sql.Timestamp regTime;
  private String paperNote;


  public long getStudentPaperId() {
    return studentPaperId;
  }

  public void setStudentPaperId(long studentPaperId) {
    this.studentPaperId = studentPaperId;
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


  public String getPaperTitle() {
    return paperTitle;
  }

  public void setPaperTitle(String paperTitle) {
    this.paperTitle = paperTitle;
  }


  public String getPaperTeacher() {
    return paperTeacher;
  }

  public void setPaperTeacher(String paperTeacher) {
    this.paperTeacher = paperTeacher;
  }


  public String getPaperStart() {
    return paperStart;
  }

  public void setPaperStart(String paperStart) {
    this.paperStart = paperStart;
  }


  public java.sql.Timestamp getPaperTime() {
    return paperTime;
  }

  public void setPaperTime(java.sql.Timestamp paperTime) {
    this.paperTime = paperTime;
  }


  public String getPaperScore() {
    return paperScore;
  }

  public void setPaperScore(String paperScore) {
    this.paperScore = paperScore;
  }


  public String getPaperComments() {
    return paperComments;
  }

  public void setPaperComments(String paperComments) {
    this.paperComments = paperComments;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public String getPaperNote() {
    return paperNote;
  }

  public void setPaperNote(String paperNote) {
    this.paperNote = paperNote;
  }

}
