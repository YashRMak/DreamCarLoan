package com.lti.dream.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMI")
public class Emi {


	@Id
	@Column(name="LOAN_AMOUNT")
	private int loanAmount;
	
	@Column(name="TENURE")
	private int tenure;
	
	@Column(name="ROI")
	private double rateOfInterest;
	
	@Column(name="MONTHLY_INSTALLMENT")
	private double monthlyInstallment;

	
	public Emi() {
		super();
	}

	public Emi(int loanAmount, int tenure, double rateOfInterest, double monthlyInstallment) {
		super();
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.rateOfInterest = rateOfInterest;
		this.monthlyInstallment = monthlyInstallment;
	}

	@Override
	public String toString() {
		return "Emi [loanAmount=" + loanAmount + ", tenure=" + tenure + ", rateOfInterest=" + rateOfInterest
				+ ", monthlyInstallment=" + monthlyInstallment + "]";
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
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

	public void setMonthlyInstallment(double d) {
		this.monthlyInstallment = d;
	}
}
