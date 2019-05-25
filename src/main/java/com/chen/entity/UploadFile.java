package com.sample;


public class UploadFile {

  private long fileId;
  private long staffId;
  private String fileTitle;
  private String fileName;
  private java.sql.Timestamp fileTime;


  public long getFileId() {
    return fileId;
  }

  public void setFileId(long fileId) {
    this.fileId = fileId;
  }


  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }


  public String getFileTitle() {
    return fileTitle;
  }

  public void setFileTitle(String fileTitle) {
    this.fileTitle = fileTitle;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public java.sql.Timestamp getFileTime() {
    return fileTime;
  }

  public void setFileTime(java.sql.Timestamp fileTime) {
    this.fileTime = fileTime;
  }

}
