package com.lti.dream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.Emi;
import com.lti.dream.dao.EmiDao;

@Service("EmiService")
public class EmiServiceImpl implements EmiService {
	
	@Autowired
	EmiDao dao;
	
	@Override
	public int addemiofuser(Emi e) {
		System.out.println("service layer");
		return dao.addemiofuser(e);
	}
	
	@Override
	public List<Emi> getAllemis() {
		List<Emi> emiList = dao.getAllemis();

		return emiList;
	}

	@Override
	public boolean updateRoi(int loanAmount, Emi e) {
		return dao.updateRoi(loanAmount, e);
	}

	@Override
	public Emi find(int loanAmount) {
		return dao.find(loanAmount);
	}
	
	@Override
    public boolean updateMonthlyInstallment(int loanAmount, Emi e) {
        
        return dao.updateMonthlyInstallment(loanAmount, e);
    }

}
