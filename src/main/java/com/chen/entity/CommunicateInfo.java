package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *班主任对学生评价表
 * @author chen
 */
public class CommunicateInfo implements Serializable {

  private static final long serialVersionUID = -7695103075174623720L;
  private long communicateId;                    //[PK] 编号
  private long studentId;                        //[FK] 学生编号
  private long staffId;                          //[FK] 员工编号
  private java.sql.Timestamp communicateTime;    //[--] 评价时间
  private String communicateContent;             //[--] 品行评价
  private String communicateXuenian;             //[--] 学年
  private String communicateXueqi;               //[--] 学期
  private long leaveCount;                       //[--] 病事假统计
  private long truancyCount;                     //[--] 旷课统计
  private String rewardPunish;                   //[--] 奖惩记载


  public long getCommunicateId() {
    return communicateId;
  }

  public void setCommunicateId(long communicateId) {
    this.communicateId = communicateId;
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

  public Timestamp getCommunicateTime() {
    return communicateTime;
  }

  public void setCommunicateTime(Timestamp communicateTime) {
    this.communicateTime = communicateTime;
  }

  public String getCommunicateContent() {
    return communicateContent;
  }

  public void setCommunicateContent(String communicateContent) {
    this.communicateContent = communicateContent;
  }

  public String getCommunicateXuenian() {
    return communicateXuenian;
  }

  public void setCommunicateXuenian(String communicateXuenian) {
    this.communicateXuenian = communicateXuenian;
  }

  public String getCommunicateXueqi() {
    return communicateXueqi;
  }

  public void setCommunicateXueqi(String communicateXueqi) {
    this.communicateXueqi = communicateXueqi;
  }

  public long getLeaveCount() {
    return leaveCount;
  }

  public void setLeaveCount(long leaveCount) {
    this.leaveCount = leaveCount;
  }

  public long getTruancyCount() {
    return truancyCount;
  }

  public void setTruancyCount(long truancyCount) {
    this.truancyCount = truancyCount;
  }

  public String getRewardPunish() {
    return rewardPunish;
  }

  public void setRewardPunish(String rewardPunish) {
    this.rewardPunish = rewardPunish;
  }

  @Override
  public String toString() {
    return "CommunicateInfo{" +
            "communicateId=" + communicateId +
            ", studentId=" + studentId +
            ", staffId=" + staffId +
            ", communicateTime=" + communicateTime +
            ", communicateContent='" + communicateContent + '\'' +
            ", communicateXuenian='" + communicateXuenian + '\'' +
            ", communicateXueqi='" + communicateXueqi + '\'' +
            ", leaveCount=" + leaveCount +
            ", truancyCount=" + truancyCount +
            ", rewardPunish='" + rewardPunish + '\'' +
            '}';
  }
}
