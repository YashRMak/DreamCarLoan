package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Account;


@Repository
public class AccDaoImpl implements AccDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int addAcc(Account acc) {
		System.out.println("DAO layer");
		em.persist(acc);
		return acc.getAccNo();
	}

	@Override
	public Account findAccByNo(int accNo) {
		System.out.println("DAO layer");
		Account acc= em.find(Account.class, accNo);
		return acc;
	}

	@Override
	public List<Account> getAllAccounts() {
		TypedQuery tqry = em.createQuery("Select a from Account a", Account.class);
        List<Account> accList = tqry.getResultList();
		return accList;
	}

	@Override
	@Transactional
	public boolean updateBalance(int accNo, Account acc) {
		Account temp=em.find(Account.class, accNo);
		temp.setBalance(acc.getBalance());
		Account accx= em.merge(temp);
		if(accx!=null) {
			return true;
		}
		else {
		return false;
		}
	}

	//Only for Admin
	@Override
	@Transactional
	public void dropAcc(Account acc) {
		em.remove(em.contains(acc) ? acc : em.merge(acc));
		System.out.println("Record Deleted");
	}

}
