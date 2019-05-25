package com.chen.entity;

import java.io.Serializable;
/**
 * 模板信息表
 * @author gjx
 *
 */
public class TemplateInfo implements Serializable{

  private static final long serialVersionUID = 7058296676565104982L;
  private long templateId;          //[PK] 编号
  private String templateTitle;     //[--] 标题
  private String templateContent;   //[--] 内容
  private String templateType;      //[--] 类别


  public long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(long templateId) {
    this.templateId = templateId;
  }


  public String getTemplateTitle() {
    return templateTitle;
  }

  public void setTemplateTitle(String templateTitle) {
    this.templateTitle = templateTitle;
  }


  public String getTemplateContent() {
    return templateContent;
  }

  public void setTemplateContent(String templateContent) {
    this.templateContent = templateContent;
  }


  public String getTemplateType() {
    return templateType;
  }

  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }

}
