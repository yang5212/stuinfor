package com.chen.entity;

import java.io.Serializable;

/**
 *
 * @author chen
 */
public class DataDictionary implements Serializable {

  private Long dataId;
  private String dataContent;
  private String dataType;
  private String dataDesc;


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
