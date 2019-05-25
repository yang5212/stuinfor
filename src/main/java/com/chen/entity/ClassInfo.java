package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author chen
 */
public class ClassInfo implements Serializable {

  private Long classId;
  private Long syllabusId;
  private Long classroomId;
  private Long staffId;
  private String className;
  private Long classNumber;
  private Timestamp classStartTime;
  private Timestamp classEndTime;
  private String classIsuesd;
  private String classState;
  private String classDesc;
  private String classMajor;


  public Long getClassId() {
    return classId;
  }

  public void setClassId(Long classId) {
    this.classId = classId;
  }

  public Long getSyllabusId() {
    return syllabusId;
  }

  public void setSyllabusId(Long syllabusId) {
    this.syllabusId = syllabusId;
  }

  public Long getClassroomId() {
    return classroomId;
  }

  public void setClassroomId(Long classroomId) {
    this.classroomId = classroomId;
  }

  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public Long getClassNumber() {
    return classNumber;
  }

  public void setClassNumber(Long classNumber) {
    this.classNumber = classNumber;
  }

  public Timestamp getClassStartTime() {
    return classStartTime;
  }

  public void setClassStartTime(Timestamp classStartTime) {
    this.classStartTime = classStartTime;
  }

  public Timestamp getClassEndTime() {
    return classEndTime;
  }

  public void setClassEndTime(Timestamp classEndTime) {
    this.classEndTime = classEndTime;
  }

  public String getClassIsuesd() {
    return classIsuesd;
  }

  public void setClassIsuesd(String classIsuesd) {
    this.classIsuesd = classIsuesd;
  }

  public String getClassState() {
    return classState;
  }

  public void setClassState(String classState) {
    this.classState = classState;
  }

  public String getClassDesc() {
    return classDesc;
  }

  public void setClassDesc(String classDesc) {
    this.classDesc = classDesc;
  }

  public String getClassMajor() {
    return classMajor;
  }

  public void setClassMajor(String classMajor) {
    this.classMajor = classMajor;
  }

  @Override
  public String toString() {
    return "ClassInfo{" +
            "classId=" + classId +
            ", syllabusId=" + syllabusId +
            ", classroomId=" + classroomId +
            ", staffId=" + staffId +
            ", className='" + className + '\'' +
            ", classNumber=" + classNumber +
            ", classStartTime=" + classStartTime +
            ", classEndTime=" + classEndTime +
            ", classIsuesd='" + classIsuesd + '\'' +
            ", classState='" + classState + '\'' +
            ", classDesc='" + classDesc + '\'' +
            ", classMajor='" + classMajor + '\'' +
            '}';
  }
}
