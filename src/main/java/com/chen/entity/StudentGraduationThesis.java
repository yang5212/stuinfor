package com.chen.entity;

import java.io.Serializable;

/**
 * 毕业论文和科研训练表
 * @author chen
 */
public class StudentGraduationThesis implements Serializable {

  private static final long serialVersionUID = 6840608804499497542L;
  private long studentPaperId;            //[PK] 编号
  private long studentId;                 //[FK] 学生编号
  private long staffId;                   //[FK] 员工编号
  private String paperTitle;              //[--] 论文标题
  private String paperTeacher;            //[--] 论文指导老师
  private String paperStart;              //[--] 乞讨时间
  private java.sql.Timestamp paperTime;   //[--] 答辩时间
  private String paperScore;              //[--] 成绩
  private String paperComments;           //[--] 评语
  private java.sql.Timestamp regTime;     //[--] 登记时间
  private String paperNote;               //[--] 备注


  public long getStudentPaperId() {
    return studentPaperId;
  }

  public void setStudentPaperId(long studentPaperId) {
    this.studentPaperId = studentPaperId;
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


  public String getPaperTitle() {
    return paperTitle;
  }

  public void setPaperTitle(String paperTitle) {
    this.paperTitle = paperTitle;
  }


  public String getPaperTeacher() {
    return paperTeacher;
  }

  public void setPaperTeacher(String paperTeacher) {
    this.paperTeacher = paperTeacher;
  }


  public String getPaperStart() {
    return paperStart;
  }

  public void setPaperStart(String paperStart) {
    this.paperStart = paperStart;
  }


  public java.sql.Timestamp getPaperTime() {
    return paperTime;
  }

  public void setPaperTime(java.sql.Timestamp paperTime) {
    this.paperTime = paperTime;
  }


  public String getPaperScore() {
    return paperScore;
  }

  public void setPaperScore(String paperScore) {
    this.paperScore = paperScore;
  }


  public String getPaperComments() {
    return paperComments;
  }

  public void setPaperComments(String paperComments) {
    this.paperComments = paperComments;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public String getPaperNote() {
    return paperNote;
  }

  public void setPaperNote(String paperNote) {
    this.paperNote = paperNote;
  }

}
