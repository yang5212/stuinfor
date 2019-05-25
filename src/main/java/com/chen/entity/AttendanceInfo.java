package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author chen
 */
public class AttendanceInfo implements Serializable {
	
  private static final long serialVersionUID = -1477394325704824610L;
  private Long attendanceId;           // [--] 
  private Long studentId;              // [--] 
  private Long staffId;                // [--] 
  private String attendanceDesc;       // [--] 
  private String attendanceState;      // [--] 
  private Timestamp attendanceTime;    // [--] 
  private String attendanceRemark;     // [--] 
  private String attendanceXuenian;    // [--] 
  private String attendanceXueqi;      // [--] 
  private String attendanceMonth;      // [--] 


  public Long getAttendanceId() {
    return attendanceId;
  }

  public void setAttendanceId(Long attendanceId) {
    this.attendanceId = attendanceId;
  }

  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public String getAttendanceDesc() {
    return attendanceDesc;
  }

  public void setAttendanceDesc(String attendanceDesc) {
    this.attendanceDesc = attendanceDesc;
  }

  public String getAttendanceState() {
    return attendanceState;
  }

  public void setAttendanceState(String attendanceState) {
    this.attendanceState = attendanceState;
  }

  public Timestamp getAttendanceTime() {
    return attendanceTime;
  }

  public void setAttendanceTime(Timestamp attendanceTime) {
    this.attendanceTime = attendanceTime;
  }

  public String getAttendanceRemark() {
    return attendanceRemark;
  }

  public void setAttendanceRemark(String attendanceRemark) {
    this.attendanceRemark = attendanceRemark;
  }

  public String getAttendanceXuenian() {
    return attendanceXuenian;
  }

  public void setAttendanceXuenian(String attendanceXuenian) {
    this.attendanceXuenian = attendanceXuenian;
  }

  public String getAttendanceXueqi() {
    return attendanceXueqi;
  }

  public void setAttendanceXueqi(String attendanceXueqi) {
    this.attendanceXueqi = attendanceXueqi;
  }

  public String getAttendanceMonth() {
    return attendanceMonth;
  }

  public void setAttendanceMonth(String attendanceMonth) {
    this.attendanceMonth = attendanceMonth;
  }

  @Override
  public String toString() {
    return "AttendanceInfo{" +
            "attendanceId=" + attendanceId +
            ", studentId=" + studentId +
            ", staffId=" + staffId +
            ", attendanceDesc='" + attendanceDesc + '\'' +
            ", attendanceState='" + attendanceState + '\'' +
            ", attendanceTime=" + attendanceTime +
            ", attendanceRemark='" + attendanceRemark + '\'' +
            ", attendanceXuenian='" + attendanceXuenian + '\'' +
            ", attendanceXueqi='" + attendanceXueqi + '\'' +
            ", attendanceMonth='" + attendanceMonth + '\'' +
            '}';
  }
}
