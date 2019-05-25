package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *班级事务信息表
 * @author chen
 */
public class ClassTransactionInfo implements Serializable {

  private static final long serialVersionUID = -1493045689044861034L;
  private Long classTransactionId;           //[PK] 编号
  private Long classId;                      //[FK] 班级号
  private String classTransactionTitle;      //[--] 主题
  private String classTransactionContent;    //[--] 内容
  private String classTransactionPerson;     //[--] 组织人
  private Timestamp classTransactionTime;    //[--] 活动日期
  private String classTransactionRemark;     //[--] 备注信息


  public Long getClassTransactionId() {
    return classTransactionId;
  }

  public void setClassTransactionId(Long classTransactionId) {
    this.classTransactionId = classTransactionId;
  }

  public Long getClassId() {
    return classId;
  }

  public void setClassId(Long classId) {
    this.classId = classId;
  }

  public String getClassTransactionTitle() {
    return classTransactionTitle;
  }

  public void setClassTransactionTitle(String classTransactionTitle) {
    this.classTransactionTitle = classTransactionTitle;
  }

  public String getClassTransactionContent() {
    return classTransactionContent;
  }

  public void setClassTransactionContent(String classTransactionContent) {
    this.classTransactionContent = classTransactionContent;
  }

  public String getClassTransactionPerson() {
    return classTransactionPerson;
  }

  public void setClassTransactionPerson(String classTransactionPerson) {
    this.classTransactionPerson = classTransactionPerson;
  }

  public Timestamp getClassTransactionTime() {
    return classTransactionTime;
  }

  public void setClassTransactionTime(Timestamp classTransactionTime) {
    this.classTransactionTime = classTransactionTime;
  }

  public String getClassTransactionRemark() {
    return classTransactionRemark;
  }

  public void setClassTransactionRemark(String classTransactionRemark) {
    this.classTransactionRemark = classTransactionRemark;
  }

  @Override
  public String toString() {
    return "ClassTransactionInfo{" +
            "classTransactionId=" + classTransactionId +
            ", classId=" + classId +
            ", classTransactionTitle='" + classTransactionTitle + '\'' +
            ", classTransactionContent='" + classTransactionContent + '\'' +
            ", classTransactionPerson='" + classTransactionPerson + '\'' +
            ", classTransactionTime=" + classTransactionTime +
            ", classTransactionRemark='" + classTransactionRemark + '\'' +
            '}';
  }
}
