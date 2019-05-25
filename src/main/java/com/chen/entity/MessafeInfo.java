package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *短信信息表
 * @author chen
 */
public class MessafeInfo implements Serializable {

  private static final long serialVersionUID = -8164143736904937699L;
  private Long messafeId;             //[PK] 编号
  private Long staffId;               //[--] 员工编号
  private String messafeContent;      //[--] 短信内容
  private String messafeMan;          //[--] 接收人
  private String messafePhone;        //[--] 电话号码
  private Timestamp messafeTime;      //[--] 发送时间
  private String messafeState;        //[--] 短信状态


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
