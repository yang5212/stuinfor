package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *邮件信息表
 * @author chen
 */
public class EmailInfo implements Serializable {

  private static final long serialVersionUID = 3993592755069837662L;
  private Long emailId;              // [PK] 编号
  private Long staffId;              // [--] 员工编号
  private String emailTitle;         // [--] 主题
  private String emailContent;       // [--] 邮件内容
  private Timestamp emailTime;       // [--] 发送时间
  private String emailMan;           // [--] 收件人
  private String emailAddr;          // [--] 邮件地址
  private String emailState;         // [--] 邮件状态


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
