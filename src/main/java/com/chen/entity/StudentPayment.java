package com.sample;


public class StudentPayment {

  private long paymentId;
  private long studentId;
  private long staffId;
  private String paymentSituation;
  private long paymentMethod;
  private java.sql.Timestamp paymentTime;
  private double discountAmount;
  private double shouldAmount;
  private double realAmount;
  private double debtAmount;
  private String paymentRemark;


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
