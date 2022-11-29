package com.lti.dream.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="POLICIES")
public class Policy {

	@Id
	@Column(name="PolicyNo")
	private int policyNo;
	
	@Column(name="TypeOfPolicy")
	private String policyType;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="POLICY_EMI")
	private Emi emi;


	public Emi getEmi() {
		return emi;
	}

	public void setEmi(Emi emi) {
		this.emi = emi;
	}

	public Policy() {
		super();
	}

	public Policy(int policyNo, String policyType) {
		super();
		this.policyNo = policyNo;
		this.policyType = policyType;
	}


	public int getPolicyNo() {
		return policyNo;
	}


	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}


	public String getPolicyType() {
		return policyType;
	}


	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", policyType=" + policyType + "]";
	}


}
	

	