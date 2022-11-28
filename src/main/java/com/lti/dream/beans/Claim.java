package com.lti.dream.beans;

import javax.persistence.*;

@Entity
@Table(name="CLAIMS")
public class Claim {
	@Id
	private int applicationNo;
	
	private String reqStatus;

	public Claim() {
		super();
	}

	public Claim(int applicationNo, String reqStatus) {
		super();
		this.applicationNo = applicationNo;
		this.reqStatus = reqStatus;
	}

	public int getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(int applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getReqStatus() {
		return reqStatus;
	}

	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}

	@Override
	public String toString() {
		return "Claim [applicationNo=" + applicationNo + ", reqStatus=" + reqStatus + "]";
	}

}
