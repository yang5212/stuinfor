package com.chen.entity;

import java.io.Serializable;
/**
 * 课程信息表
 * @author gjx
 *
 */
public class SyllabusInfo implements Serializable {

  private static final long serialVersionUID = 2581894680115377158L;
  private long syllabusId;         //[PK] 编号
  private String syllabusYi;       //[--] 星期一
  private String syllabusEr;       //[--] 星期二
  private String syllabusSan;      //[--] 星期三
  private String syllabusSi;       //[--] 星期四
  private String syllabusWu;       //[--] 星期五
  private String syllabusLiu;      //[--] 星期六
  private String syllabusQi;       //[--] 星期天
  private String isUesd;           //[--] 是否使用
  private String syllabusName;     //[--] 课程名称表


  public long getSyllabusId() {
    return syllabusId;
  }

  public void setSyllabusId(long syllabusId) {
    this.syllabusId = syllabusId;
  }


  public String getSyllabusYi() {
    return syllabusYi;
  }

  public void setSyllabusYi(String syllabusYi) {
    this.syllabusYi = syllabusYi;
  }


  public String getSyllabusEr() {
    return syllabusEr;
  }

  public void setSyllabusEr(String syllabusEr) {
    this.syllabusEr = syllabusEr;
  }


  public String getSyllabusSan() {
    return syllabusSan;
  }

  public void setSyllabusSan(String syllabusSan) {
    this.syllabusSan = syllabusSan;
  }


  public String getSyllabusSi() {
    return syllabusSi;
  }

  public void setSyllabusSi(String syllabusSi) {
    this.syllabusSi = syllabusSi;
  }


  public String getSyllabusWu() {
    return syllabusWu;
  }

  public void setSyllabusWu(String syllabusWu) {
    this.syllabusWu = syllabusWu;
  }


  public String getSyllabusLiu() {
    return syllabusLiu;
  }

  public void setSyllabusLiu(String syllabusLiu) {
    this.syllabusLiu = syllabusLiu;
  }


  public String getSyllabusQi() {
    return syllabusQi;
  }

  public void setSyllabusQi(String syllabusQi) {
    this.syllabusQi = syllabusQi;
  }


  public String getIsUesd() {
    return isUesd;
  }

  public void setIsUesd(String isUesd) {
    this.isUesd = isUesd;
  }


  public String getSyllabusName() {
    return syllabusName;
  }

  public void setSyllabusName(String syllabusName) {
    this.syllabusName = syllabusName;
  }

}
