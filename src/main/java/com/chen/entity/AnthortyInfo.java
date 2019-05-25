package com.chen.entity;

import java.io.Serializable;

/**
 * 权限信息
 * @author chen
 */
public class AnthortyInfo implements Serializable {
  private static final long serialVersionUID = -7868086041825942504L;
  
  private Long anthortyId;            // [PK] 权限编号
  private Long anthortyPid;           // [--] 权限菜单编号
  private String anthortyName;        // [--] 权限名称
  private String anthortyDesc;        // [--] 权限描述
  private String anthortyUrl;         // [--] 权限 URL


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
