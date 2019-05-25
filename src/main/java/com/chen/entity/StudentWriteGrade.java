package com.chen.entity;

import java.io.Serializable;
/**
 * 学生成绩表
 * @author gjx
 *
 */
public class StudentWriteGrade implements Serializable {
  private static final long serialVersionUID = 2827565883853179310L;
  private long writeGradeId;                    // [PK] 编号
  private long studentId;                       // [FK] 学生编号
  private long staffId;                         // [FK] 员工编号
  private long classId;                         // [FK] 班级编号
  private long disciplineId;                    // [FK] 课程编号
  private String writeGrade;                    // [--] 成绩
  private java.sql.Timestamp writeGradeTime;    // [--] 登分日期
  private String writeGradeNote;                // [--] 备注
  private String writeGradeXuenian;             // [--] 学年
  private String writeGradeXueqi;               // [--] 学期
  private String writeGradeType;                // [--] 考试类型


  public long getWriteGradeId() {
    return writeGradeId;
  }

  public void setWriteGradeId(long writeGradeId) {
    this.writeGradeId = writeGradeId;
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


  public long getClassId() {
    return classId;
  }

  public void setClassId(long classId) {
    this.classId = classId;
  }


  public long getDisciplineId() {
    return disciplineId;
  }

  public void setDisciplineId(long disciplineId) {
    this.disciplineId = disciplineId;
  }


  public String getWriteGrade() {
    return writeGrade;
  }

  public void setWriteGrade(String writeGrade) {
    this.writeGrade = writeGrade;
  }


  public java.sql.Timestamp getWriteGradeTime() {
    return writeGradeTime;
  }

  public void setWriteGradeTime(java.sql.Timestamp writeGradeTime) {
    this.writeGradeTime = writeGradeTime;
  }


  public String getWriteGradeNote() {
    return writeGradeNote;
  }

  public void setWriteGradeNote(String writeGradeNote) {
    this.writeGradeNote = writeGradeNote;
  }


  public String getWriteGradeXuenian() {
    return writeGradeXuenian;
  }

  public void setWriteGradeXuenian(String writeGradeXuenian) {
    this.writeGradeXuenian = writeGradeXuenian;
  }


  public String getWriteGradeXueqi() {
    return writeGradeXueqi;
  }

  public void setWriteGradeXueqi(String writeGradeXueqi) {
    this.writeGradeXueqi = writeGradeXueqi;
  }


  public String getWriteGradeType() {
    return writeGradeType;
  }

  public void setWriteGradeType(String writeGradeType) {
    this.writeGradeType = writeGradeType;
  }

}
