package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author chen
 */
public class AuditionInfo implements Serializable {
	
  private static final long serialVersionUID = -3510815426242773291L;
  private Long auditionId;
  private Long studentId;
  private Timestamp auditionTime;
  private String auditionAddr;
  private String auditionCourse;
  private String auditionDesc;


  public Long getAuditionId() {
    return auditionId;
  }

  public void setAuditionId(Long auditionId) {
    this.auditionId = auditionId;
  }

  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public Timestamp getAuditionTime() {
    return auditionTime;
  }

  public void setAuditionTime(Timestamp auditionTime) {
    this.auditionTime = auditionTime;
  }

  public String getAuditionAddr() {
    return auditionAddr;
  }

  public void setAuditionAddr(String auditionAddr) {
    this.auditionAddr = auditionAddr;
  }

  public String getAuditionCourse() {
    return auditionCourse;
  }

  public void setAuditionCourse(String auditionCourse) {
    this.auditionCourse = auditionCourse;
  }

  public String getAuditionDesc() {
    return auditionDesc;
  }

  public void setAuditionDesc(String auditionDesc) {
    this.auditionDesc = auditionDesc;
  }

  @Override
  public String toString() {
    return "AuditionInfo{" +
            "auditionId=" + auditionId +
            ", studentId=" + studentId +
            ", auditionTime=" + auditionTime +
            ", auditionAddr='" + auditionAddr + '\'' +
            ", auditionCourse='" + auditionCourse + '\'' +
            ", auditionDesc='" + auditionDesc + '\'' +
            '}';
  }
}
