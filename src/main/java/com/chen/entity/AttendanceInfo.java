package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *学生考勤表
 * @author chen
 */
public class AttendanceInfo implements Serializable {
	
  private static final long serialVersionUID = -1477394325704824610L;
  private Long attendanceId;           // [PK] 编号 
  private Long studentId;              // [FK] 学生编号
  private Long staffId;                // [FK] 员工编号
  private String attendanceDesc;       // [--] 考勤描述 
  private String attendanceState;      // [--] 考勤状态
  private Timestamp attendanceTime;    // [--] 考勤时间 
  private String attendanceRemark;     // [--] 考勤备注
  private String attendanceXuenian;    // [--] 学年
  private String attendanceXueqi;      // [--] 学期
  private String attendanceMonth;      // [--] 月份


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
