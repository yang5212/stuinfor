package com.sample;


public class TrackRecordInfo {

  private long trackRecordId;
  private long studentId;
  private String trackRecordTitle;
  private String trackRecordContent;
  private java.sql.Timestamp trackRecordTime;
  private long enrollment;
  private java.sql.Timestamp nextRecordTime;


  public long getTrackRecordId() {
    return trackRecordId;
  }

  public void setTrackRecordId(long trackRecordId) {
    this.trackRecordId = trackRecordId;
  }


  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }


  public String getTrackRecordTitle() {
    return trackRecordTitle;
  }

  public void setTrackRecordTitle(String trackRecordTitle) {
    this.trackRecordTitle = trackRecordTitle;
  }


  public String getTrackRecordContent() {
    return trackRecordContent;
  }

  public void setTrackRecordContent(String trackRecordContent) {
    this.trackRecordContent = trackRecordContent;
  }


  public java.sql.Timestamp getTrackRecordTime() {
    return trackRecordTime;
  }

  public void setTrackRecordTime(java.sql.Timestamp trackRecordTime) {
    this.trackRecordTime = trackRecordTime;
  }


  public long getEnrollment() {
    return enrollment;
  }

  public void setEnrollment(long enrollment) {
    this.enrollment = enrollment;
  }


  public java.sql.Timestamp getNextRecordTime() {
    return nextRecordTime;
  }

  public void setNextRecordTime(java.sql.Timestamp nextRecordTime) {
    this.nextRecordTime = nextRecordTime;
  }

}
