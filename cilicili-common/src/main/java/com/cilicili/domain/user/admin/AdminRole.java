package com.cilicili.domain.user.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AdminRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// role_id varchar 角色id
	private Integer roleId;

	// role_name varchar 角色名称
	private String roleName;

	// description varchar 角色描述
	private String description;

	// status int 状态：1有效；2删除
	private Integer status;

	// 一个角色有多个权限
	private List<AdminPermission> adminPermission;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<AdminPermission> getAdminPermission() {
		return adminPermission;
	}

	public void setAdminPermission(List<AdminPermission> adminPermission) {
		this.adminPermission = adminPermission;
	}

	public AdminRole(Integer roleId, String roleName, String description, Integer status,
			List<AdminPermission> adminPermission) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.description = description;
		this.status = status;

		this.adminPermission = adminPermission;
	}

	public AdminRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AdminRole [roleId=" + roleId + ", roleName=" + roleName + ", description=" + description + ", status="
				+ status + ", adminPermission=" + adminPermission + "]";
	}

}