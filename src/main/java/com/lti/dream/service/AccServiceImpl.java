package com.lti.dream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.Account;
import com.lti.dream.dao.AccDao;

@Service("accService")
public class AccServiceImpl implements AccService {
	@Autowired
	AccDao dao;

	@Override
	public int addAcc(Account account) {
		System.out.println("service layer");
		int accNo=dao.addAcc(account);
		return accNo;
	}

	@Override
	public Account findAccByNo(int accNo) {
		Account fa= dao.findAccByNo(accNo);
		return fa;
	}

	@Override
	public List<Account> getAllAccounts() {
		List<Account> accList= dao.getAllAccounts(); 
		return accList;
	}

	@Override
	public boolean updateBalance(int accNo, Account acc) {
		boolean t= dao.updateBalance(accNo, acc);
		return t;
	}

	@Override
	public void dropAcc(Account acc) {
		dao.dropAcc(acc);
	}
}
