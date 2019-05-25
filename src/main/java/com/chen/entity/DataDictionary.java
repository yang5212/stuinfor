package com.chen.entity;

import java.io.Serializable;

/**
 *数据字典信息表
 * @author chen
 */
public class DataDictionary implements Serializable {

  private static final long serialVersionUID = 9003620065850055004L;
  private Long dataId;              //[PK] 编号
  private String dataContent;       //[--] 数据名称
  private String dataType;          //[--] 数据类型
  private String dataDesc;          //[--] 数据描述


  public Long getDataId() {
    return dataId;
  }

  public void setDataId(Long dataId) {
    this.dataId = dataId;
  }

  public String getDataContent() {
    return dataContent;
  }

  public void setDataContent(String dataContent) {
    this.dataContent = dataContent;
  }

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public String getDataDesc() {
    return dataDesc;
  }

  public void setDataDesc(String dataDesc) {
    this.dataDesc = dataDesc;
  }

  @Override
  public String toString() {
    return "DataDictionary{" +
            "dataId=" + dataId +
            ", dataContent='" + dataContent + '\'' +
            ", dataType='" + dataType + '\'' +
            ", dataDesc='" + dataDesc + '\'' +
            '}';
  }
}
