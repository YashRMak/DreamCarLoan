package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Emi;

@Repository
public class EmiDaoImpl implements EmiDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addemiofuser(Emi e) {
		System.out.println("dao layer");

		em.persist(e);
		return e.getLoanAmount();

	}

	public List<Emi> getAllemis(){
		System.out.println("dao layer displays all records");
		Query qry=em.createQuery("select e from Emi e");
		List<Emi> emiList=qry.getResultList();
		return emiList;
	}
	
	@Override
	public Emi find(int loanAmount) {
		Emi e=em.find(Emi.class, loanAmount);
		return e;
	}

	@Override
	@Transactional
	public boolean updateRoi(int loanAmount, Emi e) {
		Emi temp=em.find(Emi.class, loanAmount);
		temp.setRateOfInterest(e.getRateOfInterest());
		Emi ve=em.merge(temp);
		if(ve!=null) {
				return true;
		}
		else {
			return false;
		}
	}
	
	@Override
    @Transactional
    public boolean updateMonthlyInstallment(int loanAmount, Emi e) {
        Emi temp1=em.find(Emi.class, loanAmount);
        if(temp1!=null) {
            temp1.setMonthlyInstallment(e.getMonthlyInstallment());
            Emi v=em.merge(temp1);
            return true;
        }
        else {
            return false;
        }
    }
}
