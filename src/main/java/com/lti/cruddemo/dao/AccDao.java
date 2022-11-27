package com.lti.cruddemo.dao;

import java.util.List;

import com.lti.cruddemo.beans.Account;


public interface AccDao {
	public int addAcc(Account account);

	public Account findAccByNo(int accNo);

	public List<Account> getAllAccounts();

	public boolean updateBalance(int accNo, Account acc);

	public void dropAcc(Account acc);
}
