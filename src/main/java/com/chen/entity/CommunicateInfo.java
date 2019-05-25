package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author chen
 */
public class CommunicateInfo implements Serializable {

  private long communicateId;
  private long studentId;
  private long staffId;
  private java.sql.Timestamp communicateTime;
  private String communicateContent;
  private String communicateXuenian;
  private String communicateXueqi;
  private long leaveCount;
  private long truancyCount;
  private String rewardPunish;


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
