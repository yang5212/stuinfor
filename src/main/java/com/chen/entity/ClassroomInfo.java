package com.chen.entity;

import java.io.Serializable;

/**
 *教室信息表
 * @author chen
 */
public class ClassroomInfo implements Serializable {

  
  private static final long serialVersionUID = -7180871262002702805L;
  private Long classroomId;         //[PK] 教室编号
  private String classroomName;     //[--] 教室名
  private Long classroomMax;        //[--] 容纳人数
  private String classroomInfo;     //[--] 设备信息
  private String classroomRemark;   //[--] 备注信息
  private String classroomMark;     //[--] 使用状态


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
