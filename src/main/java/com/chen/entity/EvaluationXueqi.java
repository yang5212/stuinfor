package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author chen
 */
public class EvaluationXueqi implements Serializable {

  private Long evaluationId;
  private Long studentId;
  private Long disciplineId;
  private Long staffId;
  private Long classId;
  private String evaluationXueqi;
  private String evaluationMonth;
  private String evaluationMajor;
  private String evaluationContent;
  private Timestamp evaluationTime;
  private String evaluationNote;


  public Long getEvaluationId() {
    return evaluationId;
  }

  public void setEvaluationId(Long evaluationId) {
    this.evaluationId = evaluationId;
  }

  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public Long getDisciplineId() {
    return disciplineId;
  }

  public void setDisciplineId(Long disciplineId) {
    this.disciplineId = disciplineId;
  }

  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public Long getClassId() {
    return classId;
  }

  public void setClassId(Long classId) {
    this.classId = classId;
  }

  public String getEvaluationXueqi() {
    return evaluationXueqi;
  }

  public void setEvaluationXueqi(String evaluationXueqi) {
    this.evaluationXueqi = evaluationXueqi;
  }

  public String getEvaluationMonth() {
    return evaluationMonth;
  }

  public void setEvaluationMonth(String evaluationMonth) {
    this.evaluationMonth = evaluationMonth;
  }

  public String getEvaluationMajor() {
    return evaluationMajor;
  }

  public void setEvaluationMajor(String evaluationMajor) {
    this.evaluationMajor = evaluationMajor;
  }

  public String getEvaluationContent() {
    return evaluationContent;
  }

  public void setEvaluationContent(String evaluationContent) {
    this.evaluationContent = evaluationContent;
  }

  public Timestamp getEvaluationTime() {
    return evaluationTime;
  }

  public void setEvaluationTime(Timestamp evaluationTime) {
    this.evaluationTime = evaluationTime;
  }

  public String getEvaluationNote() {
    return evaluationNote;
  }

  public void setEvaluationNote(String evaluationNote) {
    this.evaluationNote = evaluationNote;
  }

  @Override
  public String toString() {
    return "EvaluationXueqi{" +
            "evaluationId=" + evaluationId +
            ", studentId=" + studentId +
            ", disciplineId=" + disciplineId +
            ", staffId=" + staffId +
            ", classId=" + classId +
            ", evaluationXueqi='" + evaluationXueqi + '\'' +
            ", evaluationMonth='" + evaluationMonth + '\'' +
            ", evaluationMajor='" + evaluationMajor + '\'' +
            ", evaluationContent='" + evaluationContent + '\'' +
            ", evaluationTime=" + evaluationTime +
            ", evaluationNote='" + evaluationNote + '\'' +
            '}';
  }
}
