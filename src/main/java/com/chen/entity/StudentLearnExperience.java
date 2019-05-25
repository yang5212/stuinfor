package com.chen.entity;

import java.io.Serializable;
/**
 * 学生学习经历表
 * @author gjx
 *
 */
public class StudentLearnExperience implements Serializable {

  private static final long serialVersionUID = 6915434080841689696L;
  private long studentLearnId;          //[PK] 编号
  private long studentId;               //[FK] 学生编号
  private long staffId;                 //[FK] 员工编号
  private String learnAllyears;         //[--] 乞讨年月
  private String learnSchool;           //[--] 学校或机关名称
  private String learnPosition;         //[--] 学习或任职
  private java.sql.Timestamp regTime;   //[--] 登记时间
  private String learnNote;             //[--] 备注


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
