package com.chen.entity;

import java.io.Serializable;

/**
 * 权限信息
 * @author chen
 */
public class AnthortyInfo implements Serializable {

  private Long anthortyId;
  private Long anthortyPid;
  private String anthortyName;
  private String anthortyDesc;
  private String anthortyUrl;


  public Long getAnthortyId() {
    return anthortyId;
  }

  public void setAnthortyId(Long anthortyId) {
    this.anthortyId = anthortyId;
  }

  public Long getAnthortyPid() {
    return anthortyPid;
  }

  public void setAnthortyPid(Long anthortyPid) {
    this.anthortyPid = anthortyPid;
  }

  public String getAnthortyName() {
    return anthortyName;
  }

  public void setAnthortyName(String anthortyName) {
    this.anthortyName = anthortyName;
  }

  public String getAnthortyDesc() {
    return anthortyDesc;
  }

  public void setAnthortyDesc(String anthortyDesc) {
    this.anthortyDesc = anthortyDesc;
  }

  public String getAnthortyUrl() {
    return anthortyUrl;
  }

  public void setAnthortyUrl(String anthortyUrl) {
    this.anthortyUrl = anthortyUrl;
  }

  @Override
  public String toString() {
    return "AnthortyInfo{" +
            "anthortyId=" + anthortyId +
            ", anthortyPid=" + anthortyPid +
            ", anthortyName='" + anthortyName + '\'' +
            ", anthortyDesc='" + anthortyDesc + '\'' +
            ", anthortyUrl='" + anthortyUrl + '\'' +
            '}';
  }
}
