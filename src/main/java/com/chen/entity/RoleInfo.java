package com.chen.entity;

import java.io.Serializable;

/**
 *角色信息表
 * @author chen
 */
public class RoleInfo implements Serializable {

  private static final long serialVersionUID = -7151778269279804488L;
  private Long roleId;            //[PK] 角色编号
  private String roleName;        //[--] 角色名称
  private String roleDesc;        //[--] 角色描述
  private String roleState;       //[--] 角色状态


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
