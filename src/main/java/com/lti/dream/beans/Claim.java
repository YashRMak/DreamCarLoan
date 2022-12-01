package com.lti.dream.beans;

import javax.persistence.*;

@Entity
@Table(name="CLAIMS")
public class Claim {
	@Id
	private int applicationNo;
	
	private String reqStatus;
	
	private int chosenPolicy;
	
	private int chosenVehicle;
	

	public Claim() {
		super();
	}


	public Claim(int applicationNo, String reqStatus, int chosenPolicy, int chosenVehicle) {
		super();
		this.applicationNo = applicationNo;
		this.reqStatus = reqStatus;
		this.chosenPolicy = chosenPolicy;
		this.chosenVehicle = chosenVehicle;
	}


	public int getChosenVehicle() {
		return chosenVehicle;
	}


	public void setChosenVehicle(int chosenVehicle) {
		this.chosenVehicle = chosenVehicle;
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
	
	public int getChosenPolicy() {
		return chosenPolicy;
	}

	public void setChosenPolicy(int chosenPolicy) {
		this.chosenPolicy = chosenPolicy;
	}

	@Override
	public String toString() {
		return "Claim [applicationNo=" + applicationNo + ", reqStatus=" + reqStatus + "]";
	}

}
