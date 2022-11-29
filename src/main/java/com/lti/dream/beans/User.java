package com.lti.dream.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	
	@Column(name="DL_NO",unique=true)
	private int dlNo;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_VEHICLE")
	private Vehicle vehicle;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_INFO")
	private PersonalInformation personalinfo;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_DOCUMENT")
	private Document document;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ACCOUNT")
	private Account account;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_POLICY")
	private Policy policy;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_CLAIM")
	private Claim claim;
	
	
	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public PersonalInformation getPersonalinfo() {
		return personalinfo;
	}

	public void setPersonalinfo(PersonalInformation personalinfo) {
		this.personalinfo = personalinfo;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

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
