package com.chen.entity;

import java.io.Serializable;
/**
 * 学生缴费信息表
 * @author gjx
 *
 */
public class StudentPayment implements Serializable {

  private static final long serialVersionUID = 7186261966456638745L;
  private long paymentId;                 //[PK] 编号
  private long studentId;                 //[FK] 学生编号
  private long staffId;                   //[FK] 员工编号
  private String paymentSituation;        //[--] 学年
  private long paymentMethod;             //[--] 缴费方式
  private java.sql.Timestamp paymentTime; //[--] 缴费时间
  private double discountAmount;          //[--] 应交金额
  private double shouldAmount;            //[--] 优惠金额
  private double realAmount;              //[--] 实缴金额
  private double debtAmount;              //[--] 欠款金额
  private String paymentRemark;           //[--] 备注


  public long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(long paymentId) {
    this.paymentId = paymentId;
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


  public String getPaymentSituation() {
    return paymentSituation;
  }

  public void setPaymentSituation(String paymentSituation) {
    this.paymentSituation = paymentSituation;
  }


  public long getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(long paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public java.sql.Timestamp getPaymentTime() {
    return paymentTime;
  }

  public void setPaymentTime(java.sql.Timestamp paymentTime) {
    this.paymentTime = paymentTime;
  }


  public double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public double getShouldAmount() {
    return shouldAmount;
  }

  public void setShouldAmount(double shouldAmount) {
    this.shouldAmount = shouldAmount;
  }


  public double getRealAmount() {
    return realAmount;
  }

  public void setRealAmount(double realAmount) {
    this.realAmount = realAmount;
  }


  public double getDebtAmount() {
    return debtAmount;
  }

  public void setDebtAmount(double debtAmount) {
    this.debtAmount = debtAmount;
  }


  public String getPaymentRemark() {
    return paymentRemark;
  }

  public void setPaymentRemark(String paymentRemark) {
    this.paymentRemark = paymentRemark;
  }

}
