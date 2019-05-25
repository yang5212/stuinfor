package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author chen
 */
public class EmailInfo implements Serializable {

  private Long emailId;
  private Long staffId;
  private String emailTitle;
  private String emailContent;
  private Timestamp emailTime;
  private String emailMan;
  private String emailAddr;
  private String emailState;


  public Long getEmailId() {
    return emailId;
  }

  public void setEmailId(Long emailId) {
    this.emailId = emailId;
  }

  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public String getEmailTitle() {
    return emailTitle;
  }

  public void setEmailTitle(String emailTitle) {
    this.emailTitle = emailTitle;
  }

  public String getEmailContent() {
    return emailContent;
  }

  public void setEmailContent(String emailContent) {
    this.emailContent = emailContent;
  }

  public Timestamp getEmailTime() {
    return emailTime;
  }

  public void setEmailTime(Timestamp emailTime) {
    this.emailTime = emailTime;
  }

  public String getEmailMan() {
    return emailMan;
  }

  public void setEmailMan(String emailMan) {
    this.emailMan = emailMan;
  }

  public String getEmailAddr() {
    return emailAddr;
  }

  public void setEmailAddr(String emailAddr) {
    this.emailAddr = emailAddr;
  }

  public String getEmailState() {
    return emailState;
  }

  public void setEmailState(String emailState) {
    this.emailState = emailState;
  }

  @Override
  public String toString() {
    return "EmailInfo{" +
            "emailId=" + emailId +
            ", staffId=" + staffId +
            ", emailTitle='" + emailTitle + '\'' +
            ", emailContent='" + emailContent + '\'' +
            ", emailTime=" + emailTime +
            ", emailMan='" + emailMan + '\'' +
            ", emailAddr='" + emailAddr + '\'' +
            ", emailState='" + emailState + '\'' +
            '}';
  }
}
