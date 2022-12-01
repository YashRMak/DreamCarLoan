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
	
	
	@Column(name="DL_NO",unique=true)
	private int dlNo;
    
	@Column(name="NAME")
	private String name;
	
	

	@Column(name="CITY")
	private String city;
	
	@Column(name="CONTACT_NUMBER")
	private int contactNo;
	
	@Column(name="ACCOUNT_NUMBER")
	private  int accountNo;
	
	@Column(name="BALANCE")
	private String balance;
	
	@Column(name="AADHAR")
	private int aadharNo;
	
	@Column(name="PANCARD")
	private String panCard;
	
	public User(int userId, String userPswd, double userSal, int dlNo, String name, String city, int contactNo,
			int accountNo, String balance, int aadharNo, String panCard) {
		super();
		this.userId = userId;
		this.userPswd = userPswd;
		this.userSal = userSal;
		this.dlNo = dlNo;
		this.name = name;
		this.city = city;
		this.contactNo = contactNo;
		this.accountNo = accountNo;
		this.balance = balance;
		this.aadharNo = aadharNo;
		this.panCard = panCard;
	}


	public User() {
		super();
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

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getBalance() {
		return balance;
	}


	public void setBalance(String balance) {
		this.balance = balance;
	}


	public String getPanCard() {
		return panCard;
	}


	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public int getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

}