package com.lti.dream.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class Admin {
	
	
	@Id
	@Column(name="ADMIN_Id")
	private int adminId;
	
	@Column(name="ADMIN_NAME")
	private String adminName;
	
	@Column(name="ADMIN_PASSWORD")
	private String adminPswd;

	public Admin() {
		super();
	}
	
	public Admin(int adminId, String adminName, String adminPswd) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPswd = adminPswd;
	}

	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPswd() {
		return adminPswd;
	}

	public void setAdminPswd(String adminPswd) {
		this.adminPswd = adminPswd;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPswd=" + adminPswd + "]";
	}	
}
