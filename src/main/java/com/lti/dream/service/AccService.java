package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Account;

public interface AccService {
	public int addAcc(Account account);

	public Account findAccByNo(int accNo);

	public List<Account> getAllAccounts();

	public boolean updateBalance(int accNo, Account acc);

	public void dropAcc(Account acc);
}
