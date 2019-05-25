package com.chen.entity;

import java.io.Serializable;
/**
 * 学生缴费信息表
 * @author gjx
 *
 */
public class StudentFamilyMember implements Serializable {

  private static final long serialVersionUID = 1844614591877275770L;
  private long studentFamilyId;        //[PK] 编号
  private long studentId;              //[FK] 学生编号
  private long staffId;                //[FK] 员工编号
  private String familyName;           //[--] 姓名
  private String familyApp;            //[--] 称谓
  private long familyAge;              //[--] 年龄
  private String familyZcmm;           //[--] 政治面貌
  private String workplace;            //[--] 何处工作任职
  private java.sql.Timestamp regTime;  //[--] 登记时间
  private String familyNote;           //[--] 备注


  public long getStudentFamilyId() {
    return studentFamilyId;
  }

  public void setStudentFamilyId(long studentFamilyId) {
    this.studentFamilyId = studentFamilyId;
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


  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public String getFamilyApp() {
    return familyApp;
  }

  public void setFamilyApp(String familyApp) {
    this.familyApp = familyApp;
  }


  public long getFamilyAge() {
    return familyAge;
  }

  public void setFamilyAge(long familyAge) {
    this.familyAge = familyAge;
  }


  public String getFamilyZcmm() {
    return familyZcmm;
  }

  public void setFamilyZcmm(String familyZcmm) {
    this.familyZcmm = familyZcmm;
  }


  public String getWorkplace() {
    return workplace;
  }

  public void setWorkplace(String workplace) {
    this.workplace = workplace;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public String getFamilyNote() {
    return familyNote;
  }

  public void setFamilyNote(String familyNote) {
    this.familyNote = familyNote;
  }

}
