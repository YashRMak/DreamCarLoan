package com.lti.dream.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTS")
public class Account {
	
	@Id
	private int accNo;
	private double balance;
	
	public Account() {
		super();
	}
	
	public Account(int accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double d) {
		this.balance = d;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}	
}
