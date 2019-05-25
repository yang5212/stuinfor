package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author chen
 */
public class MessafeInfo implements Serializable {

  private Long messafeId;
  private Long staffId;
  private String messafeContent;
  private String messafeMan;
  private String messafePhone;
  private Timestamp messafeTime;
  private String messafeState;


  public Long getMessafeId() {
    return messafeId;
  }

  public void setMessafeId(Long messafeId) {
    this.messafeId = messafeId;
  }

  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public String getMessafeContent() {
    return messafeContent;
  }

  public void setMessafeContent(String messafeContent) {
    this.messafeContent = messafeContent;
  }

  public String getMessafeMan() {
    return messafeMan;
  }

  public void setMessafeMan(String messafeMan) {
    this.messafeMan = messafeMan;
  }

  public String getMessafePhone() {
    return messafePhone;
  }

  public void setMessafePhone(String messafePhone) {
    this.messafePhone = messafePhone;
  }

  public Timestamp getMessafeTime() {
    return messafeTime;
  }

  public void setMessafeTime(Timestamp messafeTime) {
    this.messafeTime = messafeTime;
  }

  public String getMessafeState() {
    return messafeState;
  }

  public void setMessafeState(String messafeState) {
    this.messafeState = messafeState;
  }

  @Override
  public String toString() {
    return "MessafeInfo{" +
            "messafeId=" + messafeId +
            ", staffId=" + staffId +
            ", messafeContent='" + messafeContent + '\'' +
            ", messafeMan='" + messafeMan + '\'' +
            ", messafePhone='" + messafePhone + '\'' +
            ", messafeTime=" + messafeTime +
            ", messafeState='" + messafeState + '\'' +
            '}';
  }
}
