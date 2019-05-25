package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *员工信息表
 * @author chen
 */
public class StaffInfo implements Serializable {

  private static final long serialVersionUID = -4802511162876923747L;
  private Long staffId;                 //[PK] 员工编号
  private Long roleId;                  //[FK] 角色编号
  private String staffName;             //[--] 员工姓名
  private String staffSex;              //[--] 员工性别
  private Long staffAge;                //[--] 员工年龄
  private String staffNativePlace;      //[--] 籍贯
  private String staffIdcard;           //[--] 身份证号
  private Timestamp staffBrithday;      //[--] 出生日期
  private String staffOfficePhone;      //[--] 办公电话
  private String staffMobilePhone;      //[--] 移动电话
  private String staffEamil;            //[--] Email邮箱
  private String staffAddr;             //[--] 地址
  private String staffQq;               //[--] QQ号码
  private Timestamp staffEntryTime;     //[--] 入职时间
  private String staffEductionLevel;    //[--] 学历
  private String staffRemark;           //[--] 标注
  private String staffState;            //[--] 员工类型
  private String userNumber;            //[--] 用户名
  private String userPassowrd;          //[--] 密码
                                               

  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public String getStaffSex() {
    return staffSex;
  }

  public void setStaffSex(String staffSex) {
    this.staffSex = staffSex;
  }

  public Long getStaffAge() {
    return staffAge;
  }

  public void setStaffAge(Long staffAge) {
    this.staffAge = staffAge;
  }

  public String getStaffNativePlace() {
    return staffNativePlace;
  }

  public void setStaffNativePlace(String staffNativePlace) {
    this.staffNativePlace = staffNativePlace;
  }

  public String getStaffIdcard() {
    return staffIdcard;
  }

  public void setStaffIdcard(String staffIdcard) {
    this.staffIdcard = staffIdcard;
  }

  public Timestamp getStaffBrithday() {
    return staffBrithday;
  }

  public void setStaffBrithday(Timestamp staffBrithday) {
    this.staffBrithday = staffBrithday;
  }

  public String getStaffOfficePhone() {
    return staffOfficePhone;
  }

  public void setStaffOfficePhone(String staffOfficePhone) {
    this.staffOfficePhone = staffOfficePhone;
  }

  public String getStaffMobilePhone() {
    return staffMobilePhone;
  }

  public void setStaffMobilePhone(String staffMobilePhone) {
    this.staffMobilePhone = staffMobilePhone;
  }

  public String getStaffEamil() {
    return staffEamil;
  }

  public void setStaffEamil(String staffEamil) {
    this.staffEamil = staffEamil;
  }

  public String getStaffAddr() {
    return staffAddr;
  }

  public void setStaffAddr(String staffAddr) {
    this.staffAddr = staffAddr;
  }

  public String getStaffQq() {
    return staffQq;
  }

  public void setStaffQq(String staffQq) {
    this.staffQq = staffQq;
  }

  public Timestamp getStaffEntryTime() {
    return staffEntryTime;
  }

  public void setStaffEntryTime(Timestamp staffEntryTime) {
    this.staffEntryTime = staffEntryTime;
  }

  public String getStaffEductionLevel() {
    return staffEductionLevel;
  }

  public void setStaffEductionLevel(String staffEductionLevel) {
    this.staffEductionLevel = staffEductionLevel;
  }

  public String getStaffRemark() {
    return staffRemark;
  }

  public void setStaffRemark(String staffRemark) {
    this.staffRemark = staffRemark;
  }

  public String getStaffState() {
    return staffState;
  }

  public void setStaffState(String staffState) {
    this.staffState = staffState;
  }

  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
  }

  public String getUserPassowrd() {
    return userPassowrd;
  }

  public void setUserPassowrd(String userPassowrd) {
    this.userPassowrd = userPassowrd;
  }

  @Override
  public String toString() {
    return "StaffInfo{" +
            "staffId=" + staffId +
            ", roleId=" + roleId +
            ", staffName='" + staffName + '\'' +
            ", staffSex='" + staffSex + '\'' +
            ", staffAge=" + staffAge +
            ", staffNativePlace='" + staffNativePlace + '\'' +
            ", staffIdcard='" + staffIdcard + '\'' +
            ", staffBrithday=" + staffBrithday +
            ", staffOfficePhone='" + staffOfficePhone + '\'' +
            ", staffMobilePhone='" + staffMobilePhone + '\'' +
            ", staffEamil='" + staffEamil + '\'' +
            ", staffAddr='" + staffAddr + '\'' +
            ", staffQq='" + staffQq + '\'' +
            ", staffEntryTime=" + staffEntryTime +
            ", staffEductionLevel='" + staffEductionLevel + '\'' +
            ", staffRemark='" + staffRemark + '\'' +
            ", staffState='" + staffState + '\'' +
            ", userNumber='" + userNumber + '\'' +
            ", userPassowrd='" + userPassowrd + '\'' +
            '}';
  }
}
