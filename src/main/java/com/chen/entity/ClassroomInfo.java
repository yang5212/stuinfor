package com.chen.entity;

import java.io.Serializable;

/**
 *
 * @author chen
 */
public class ClassroomInfo implements Serializable {

  private Long classroomId;
  private String classroomName;
  private Long classroomMax;
  private String classroomInfo;
  private String classroomRemark;
  private String classroomMark;


  public Long getClassroomId() {
    return classroomId;
  }

  public void setClassroomId(Long classroomId) {
    this.classroomId = classroomId;
  }

  public String getClassroomName() {
    return classroomName;
  }

  public void setClassroomName(String classroomName) {
    this.classroomName = classroomName;
  }

  public Long getClassroomMax() {
    return classroomMax;
  }

  public void setClassroomMax(Long classroomMax) {
    this.classroomMax = classroomMax;
  }

  public String getClassroomInfo() {
    return classroomInfo;
  }

  public void setClassroomInfo(String classroomInfo) {
    this.classroomInfo = classroomInfo;
  }

  public String getClassroomRemark() {
    return classroomRemark;
  }

  public void setClassroomRemark(String classroomRemark) {
    this.classroomRemark = classroomRemark;
  }

  public String getClassroomMark() {
    return classroomMark;
  }

  public void setClassroomMark(String classroomMark) {
    this.classroomMark = classroomMark;
  }

  @Override
  public String toString() {
    return "ClassroomInfo{" +
            "classroomId=" + classroomId +
            ", classroomName='" + classroomName + '\'' +
            ", classroomMax=" + classroomMax +
            ", classroomInfo='" + classroomInfo + '\'' +
            ", classroomRemark='" + classroomRemark + '\'' +
            ", classroomMark='" + classroomMark + '\'' +
            '}';
  }
}
