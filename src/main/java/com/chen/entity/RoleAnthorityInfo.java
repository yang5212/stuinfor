package com.chen.entity;

import java.io.Serializable;

/**
 *
 * @author chen
 */
public class RoleAnthorityInfo implements Serializable {

  private Long roleAnthorityId;
  private Long roleId;
  private Long anthortyId;


  public Long getRoleAnthorityId() {
    return roleAnthorityId;
  }

  public void setRoleAnthorityId(Long roleAnthorityId) {
    this.roleAnthorityId = roleAnthorityId;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public Long getAnthortyId() {
    return anthortyId;
  }

  public void setAnthortyId(Long anthortyId) {
    this.anthortyId = anthortyId;
  }

  @Override
  public String toString() {
    return "RoleAnthorityInfo{" +
            "roleAnthorityId=" + roleAnthorityId +
            ", roleId=" + roleId +
            ", anthortyId=" + anthortyId +
            '}';
  }
}
