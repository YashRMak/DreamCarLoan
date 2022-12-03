package com.lti.dream.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POLICIES")
public class Policy {

	@Id
	@Column(name="PolicyNo")
	private int policyNo;
	
	@Column(name="TypeOfPolicy")
	private String policyType;
	
	@Column(name="LoanAmount")
	private double loanAmount;
	
	@Column(name="Tenure")
	private int tenure;
	
	@Column(name="RateOfInterest")
	private double rateOfInterest;
	
	@Column(name="MonthlyInstallment")
	private double monthlyInstallment;
	
	@Column(name="Eligible_Amount")
	private int eligibleAmount;
	
	

	public Policy(int policyNo, String policyType, double loanAmount, int tenure, double rateOfInterest,
			double monthlyInstallment, int eligibleAmount) {
		super();
		this.policyNo = policyNo;
		this.policyType = policyType;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.rateOfInterest = rateOfInterest;
		this.monthlyInstallment = monthlyInstallment;
		this.eligibleAmount = eligibleAmount;
	}

	
	public int getEligibleAmount() {
		return eligibleAmount;
	}


	public void setEligibleAmount(int eligibleAmount) {
		this.eligibleAmount = eligibleAmount;
	}


	public Policy() {
		super();
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

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getMonthlyInstallment() {
		return monthlyInstallment;
	}

	public void setMonthlyInstallment(double monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}

	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", policyType=" + policyType + ", loanAmount=" + loanAmount
				+ ", tenure=" + tenure + ", rateOfInterest=" + rateOfInterest + ", monthlyInstallment="
				+ monthlyInstallment + "]";
	}
	
}