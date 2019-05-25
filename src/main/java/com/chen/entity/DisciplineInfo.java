package com.chen.entity;

import java.io.Serializable;

/**
 *课程信息表
 * @author chen
 */
public class DisciplineInfo implements Serializable {

  private static final long serialVersionUID = 5314288473615695435L;
  private Long disciplineId;             //[PK] 编号
  private String disciplineNo;           //[--] 课程编号
  private String disciplineName;         //[--] 课程名称
  private Double disciplineTuition;      //[--] 学分
  private Long disciplineBring;          //[--] 课时
  private String disciplineType;         //[--] 课程类型
  private String disciplineDesc;         //[--] 课程描述
  private String disciplineIsuesd;       //[--] 课程状态


  public Long getDisciplineId() {
    return disciplineId;
  }

  public void setDisciplineId(Long disciplineId) {
    this.disciplineId = disciplineId;
  }

  public String getDisciplineNo() {
    return disciplineNo;
  }

  public void setDisciplineNo(String disciplineNo) {
    this.disciplineNo = disciplineNo;
  }

  public String getDisciplineName() {
    return disciplineName;
  }

  public void setDisciplineName(String disciplineName) {
    this.disciplineName = disciplineName;
  }

  public Double getDisciplineTuition() {
    return disciplineTuition;
  }

  public void setDisciplineTuition(Double disciplineTuition) {
    this.disciplineTuition = disciplineTuition;
  }

  public Long getDisciplineBring() {
    return disciplineBring;
  }

  public void setDisciplineBring(Long disciplineBring) {
    this.disciplineBring = disciplineBring;
  }

  public String getDisciplineType() {
    return disciplineType;
  }

  public void setDisciplineType(String disciplineType) {
    this.disciplineType = disciplineType;
  }

  public String getDisciplineDesc() {
    return disciplineDesc;
  }

  public void setDisciplineDesc(String disciplineDesc) {
    this.disciplineDesc = disciplineDesc;
  }

  public String getDisciplineIsuesd() {
    return disciplineIsuesd;
  }

  public void setDisciplineIsuesd(String disciplineIsuesd) {
    this.disciplineIsuesd = disciplineIsuesd;
  }

  @Override
  public String toString() {
    return "DisciplineInfo{" +
            "disciplineId=" + disciplineId +
            ", disciplineNo='" + disciplineNo + '\'' +
            ", disciplineName='" + disciplineName + '\'' +
            ", disciplineTuition=" + disciplineTuition +
            ", disciplineBring=" + disciplineBring +
            ", disciplineType='" + disciplineType + '\'' +
            ", disciplineDesc='" + disciplineDesc + '\'' +
            ", disciplineIsuesd='" + disciplineIsuesd + '\'' +
            '}';
  }
}
