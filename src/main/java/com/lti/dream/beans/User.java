package com.lti.dream.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
	
	
	@Id
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_PSWD")
	private String userPswd;
	
	@Column(name="SALARY")
	private double userSal;
	
	
	@Column(name="DL_NO")
	private int dlNo;

	public User() {
		super();
	}

	public User(int userId, String userPswd, double userSal, int dlNo) {
		super();
		this.userId = userId;
		this.userPswd = userPswd;
		this.userSal = userSal;
		this.dlNo = dlNo;
	}
	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserPswd() {
		return userPswd;
	}


	public void setUserPswd(String userPswd) {
		this.userPswd = userPswd;
	}


	public double getUserSal() {
		return userSal;
	}


	public void setUserSal(double userSal) {
		this.userSal = userSal;
	}


	public int getDlNo() {
		return dlNo;
	}


	public void setDlNo(int dlNo) {
		this.dlNo = dlNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPswd=" + userPswd + ", userSal=" + userSal + ", dlNo=" + dlNo + "]";
	}

}
