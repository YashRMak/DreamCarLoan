package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.Emi;

public interface EmiDao {

	public int addemiofuser(Emi e);

	public Emi find(int loanAmount) ;

	public List<Emi> getAllemis();
	
	public boolean updateRoi(int loanAmount, Emi e);

	public boolean updateMonthlyInstallment(int loanAmount, Emi e);
	
}
