package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *教务活动信息表
 * @author chen
 */
public class MarketActive implements Serializable {

  private static final long serialVersionUID = 5277215304836279659L;
  private Long activeId;                //[PK] 编号
  private Long staffId;                 //[FK] 员工编号
  private String activeName;            //[--] 活动名称
  private Long activeState;             //[--] 活动状态
  private Timestamp activeStart;        //[--] 开始时间
  private Timestamp activeEnd;          //[--] 结束时间
  private Long activeType;              //[--] 活动类型
  private Double activeCosteEmtimate;   //[--] 成本预算
  private Double activeCoste;           //[--] 实际成本
  private Long activeRefectEstimate;    //[--] 预期反应
  private String activeStudent;         //[--] 预期人数
  private String activeContent;         //[--] 活动描述


  public Long getActiveId() {
    return activeId;
  }

  public void setActiveId(Long activeId) {
    this.activeId = activeId;
  }

  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public String getActiveName() {
    return activeName;
  }

  public void setActiveName(String activeName) {
    this.activeName = activeName;
  }

  public Long getActiveState() {
    return activeState;
  }

  public void setActiveState(Long activeState) {
    this.activeState = activeState;
  }

  public Timestamp getActiveStart() {
    return activeStart;
  }

  public void setActiveStart(Timestamp activeStart) {
    this.activeStart = activeStart;
  }

  public Timestamp getActiveEnd() {
    return activeEnd;
  }

  public void setActiveEnd(Timestamp activeEnd) {
    this.activeEnd = activeEnd;
  }

  public Long getActiveType() {
    return activeType;
  }

  public void setActiveType(Long activeType) {
    this.activeType = activeType;
  }

  public Double getActiveCosteEmtimate() {
    return activeCosteEmtimate;
  }

  public void setActiveCosteEmtimate(Double activeCosteEmtimate) {
    this.activeCosteEmtimate = activeCosteEmtimate;
  }

  public Double getActiveCoste() {
    return activeCoste;
  }

  public void setActiveCoste(Double activeCoste) {
    this.activeCoste = activeCoste;
  }

  public Long getActiveRefectEstimate() {
    return activeRefectEstimate;
  }

  public void setActiveRefectEstimate(Long activeRefectEstimate) {
    this.activeRefectEstimate = activeRefectEstimate;
  }

  public String getActiveStudent() {
    return activeStudent;
  }

  public void setActiveStudent(String activeStudent) {
    this.activeStudent = activeStudent;
  }

  public String getActiveContent() {
    return activeContent;
  }

  public void setActiveContent(String activeContent) {
    this.activeContent = activeContent;
  }

  @Override
  public String toString() {
    return "MarketActive{" +
            "activeId=" + activeId +
            ", staffId=" + staffId +
            ", activeName='" + activeName + '\'' +
            ", activeState=" + activeState +
            ", activeStart=" + activeStart +
            ", activeEnd=" + activeEnd +
            ", activeType=" + activeType +
            ", activeCosteEmtimate=" + activeCosteEmtimate +
            ", activeCoste=" + activeCoste +
            ", activeRefectEstimate=" + activeRefectEstimate +
            ", activeStudent='" + activeStudent + '\'' +
            ", activeContent='" + activeContent + '\'' +
            '}';
  }
}
