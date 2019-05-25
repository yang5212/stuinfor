package com.chen.entity;

import java.io.Serializable;

/**
 *
 * @author chen
 */
public class DisciplineInfo implements Serializable {

  private Long disciplineId;
  private String disciplineNo;
  private String disciplineName;
  private Double disciplineTuition;
  private Long disciplineBring;
  private String disciplineType;
  private String disciplineDesc;
  private String disciplineIsuesd;


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
