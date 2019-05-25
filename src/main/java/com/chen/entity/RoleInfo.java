package com.chen.entity;

import java.io.Serializable;

/**
 *
 * @author chen
 */
public class RoleInfo implements Serializable {

  private Long roleId;
  private String roleName;
  private String roleDesc;
  private String roleState;


  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getRoleDesc() {
    return roleDesc;
  }

  public void setRoleDesc(String roleDesc) {
    this.roleDesc = roleDesc;
  }

  public String getRoleState() {
    return roleState;
  }

  public void setRoleState(String roleState) {
    this.roleState = roleState;
  }

  @Override
  public String toString() {
    return "RoleInfo{" +
            "roleId=" + roleId +
            ", roleName='" + roleName + '\'' +
            ", roleDesc='" + roleDesc + '\'' +
            ", roleState='" + roleState + '\'' +
            '}';
  }
}
