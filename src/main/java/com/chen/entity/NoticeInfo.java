package com.chen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *公告信息表
 * @author chen
 */
public class NoticeInfo implements Serializable {
	
  private static final long serialVersionUID = 8103887254385771450L;
  private Long noticeId;               //[PK] 公告编号
  private Long staffId;                //[--] 员工编号
  private String noticeTitle;          //[--] 公告标题
  private String noticeContent;        //[--] 公告内容
  private Timestamp noticeTime;        //[--] 发布时间
  private String noticeFilename;       //[--]


  public Long getNoticeId() {
    return noticeId;
  }

  public void setNoticeId(Long noticeId) {
    this.noticeId = noticeId;
  }

  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public String getNoticeTitle() {
    return noticeTitle;
  }

  public void setNoticeTitle(String noticeTitle) {
    this.noticeTitle = noticeTitle;
  }

  public String getNoticeContent() {
    return noticeContent;
  }

  public void setNoticeContent(String noticeContent) {
    this.noticeContent = noticeContent;
  }

  public Timestamp getNoticeTime() {
    return noticeTime;
  }

  public void setNoticeTime(Timestamp noticeTime) {
    this.noticeTime = noticeTime;
  }

  public String getNoticeFilename() {
    return noticeFilename;
  }

  public void setNoticeFilename(String noticeFilename) {
    this.noticeFilename = noticeFilename;
  }

  @Override
  public String toString() {
    return "NoticeInfo{" +
            "noticeId=" + noticeId +
            ", staffId=" + staffId +
            ", noticeTitle='" + noticeTitle + '\'' +
            ", noticeContent='" + noticeContent + '\'' +
            ", noticeTime=" + noticeTime +
            ", noticeFilename='" + noticeFilename + '\'' +
            '}';
  }
}
