package com.chen.entity;

import java.io.Serializable;
/**
 * 学生社会实践及技能培训表
 * @author gjx
 *
 */
public class StudentPracticeSkills implements Serializable {
	
  private static final long serialVersionUID = 5105362544208198292L;
  private long studentPracticeId;            //[PK] 编号
  private long studentId;                    //[FK] 学生编号
  private long staffId;                      //[FK] 员工编号
  private java.sql.Timestamp practiceStart;  //[--] 培训/实践开始
  private java.sql.Timestamp practiceEnd;    //[--] 培训/实践结束
  private String practiceAddress;            //[--] 培训/实践地点
  private String practiceContent;            //[--] 培训/实践内容
  private String practiceScore;              //[--] 成绩
  private java.sql.Timestamp regTime;        //[--] 登记时间
  private String practiceNote;               //[--] 备 注


  public long getStudentPracticeId() {
    return studentPracticeId;
  }

  public void setStudentPracticeId(long studentPracticeId) {
    this.studentPracticeId = studentPracticeId;
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


  public java.sql.Timestamp getPracticeStart() {
    return practiceStart;
  }

  public void setPracticeStart(java.sql.Timestamp practiceStart) {
    this.practiceStart = practiceStart;
  }


  public java.sql.Timestamp getPracticeEnd() {
    return practiceEnd;
  }

  public void setPracticeEnd(java.sql.Timestamp practiceEnd) {
    this.practiceEnd = practiceEnd;
  }


  public String getPracticeAddress() {
    return practiceAddress;
  }

  public void setPracticeAddress(String practiceAddress) {
    this.practiceAddress = practiceAddress;
  }


  public String getPracticeContent() {
    return practiceContent;
  }

  public void setPracticeContent(String practiceContent) {
    this.practiceContent = practiceContent;
  }


  public String getPracticeScore() {
    return practiceScore;
  }

  public void setPracticeScore(String practiceScore) {
    this.practiceScore = practiceScore;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public String getPracticeNote() {
    return practiceNote;
  }

  public void setPracticeNote(String practiceNote) {
    this.practiceNote = practiceNote;
  }

}
