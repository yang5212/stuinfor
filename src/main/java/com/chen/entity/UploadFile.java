package com.chen.entity;

import java.io.Serializable;
/**
 * 文件上传表
 * @author gjx
 *
 */
public class UploadFile implements Serializable {

  private static final long serialVersionUID = 7835652937944126257L;
  private long fileId;                  //[PK] 文件编号
  private long staffId;                 //[FK] 员工编号
  private String fileTitle;             //[--] 文件标题
  private String fileName;              //[--] 主文件名
  private java.sql.Timestamp fileTime;  //[--] 发布时间


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
