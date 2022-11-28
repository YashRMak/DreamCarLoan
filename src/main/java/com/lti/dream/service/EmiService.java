package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Emi;

public interface EmiService {

	public List<Emi> getAllemis();

	public int addemiofuser(Emi e);
	
	public Emi find(int loanAmount) ;

	public boolean updateRoi(int loanAmount, Emi e);

	public boolean updateMonthlyInstallment(int loanAmount, Emi e);

}
