package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *学生评教表（年度）
 * @author chen
 */
public class EvaluationInfo implements Serializable {

  private static final long serialVersionUID = -8216869176249784332L;
  private Long evaluationId;           //[PK] 编号
  private Long studentId;              //[FK] 学生编号
  private Long disciplineId;           //[FK] 课程编号
  private Long staffId;                //[FK] 教师编号
  private Long classId;                //[FK] 班级编号
  private String evaluationXueqi;      //[--] 学期
  private String evaluationMonth;      //[--] 月份
  private String evaluationMajor;      //[--] 专业
  private Long score1;                 //[--] 评分1
  private Long score2;                 //[--] 评分2
  private Long score3;                 //[--] 评分3
  private Long score4;                 //[--] 评分4
  private Long score5;                 //[--] 评分5
  private Long score6;                 //[--] 评分6
  private Long sum;                    //[--] 总分
  private Timestamp evaluationTime;    //[--] 评价时间
  private String evaluationNote;       //[--] 备注


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

  public Long getScore1() {
    return score1;
  }

  public void setScore1(Long score1) {
    this.score1 = score1;
  }

  public Long getScore2() {
    return score2;
  }

  public void setScore2(Long score2) {
    this.score2 = score2;
  }

  public Long getScore3() {
    return score3;
  }

  public void setScore3(Long score3) {
    this.score3 = score3;
  }

  public Long getScore4() {
    return score4;
  }

  public void setScore4(Long score4) {
    this.score4 = score4;
  }

  public Long getScore5() {
    return score5;
  }

  public void setScore5(Long score5) {
    this.score5 = score5;
  }

  public Long getScore6() {
    return score6;
  }

  public void setScore6(Long score6) {
    this.score6 = score6;
  }

  public Long getSum() {
    return sum;
  }

  public void setSum(Long sum) {
    this.sum = sum;
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
    return "EvaluationInfo{" +
            "evaluationId=" + evaluationId +
            ", studentId=" + studentId +
            ", disciplineId=" + disciplineId +
            ", staffId=" + staffId +
            ", classId=" + classId +
            ", evaluationXueqi='" + evaluationXueqi + '\'' +
            ", evaluationMonth='" + evaluationMonth + '\'' +
            ", evaluationMajor='" + evaluationMajor + '\'' +
            ", score1=" + score1 +
            ", score2=" + score2 +
            ", score3=" + score3 +
            ", score4=" + score4 +
            ", score5=" + score5 +
            ", score6=" + score6 +
            ", sum=" + sum +
            ", evaluationTime=" + evaluationTime +
            ", evaluationNote='" + evaluationNote + '\'' +
            '}';
  }
}
