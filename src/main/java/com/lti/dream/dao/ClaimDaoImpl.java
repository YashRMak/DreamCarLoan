package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Account;
import com.lti.dream.beans.Claim;

@Repository
public class ClaimDaoImpl implements ClaimDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int addClaim(Claim c) {
		System.out.println("DAO layer");
		em.persist(c);
		return c.getApplicationNo();
	}

	@Override
	public Claim findClaimByNo(int appNo) {
		System.out.println("DAO layer");
		Claim c= em.find(Claim.class, appNo);
		return c;
	}

	@Override
	public List<Claim> getAllClaims() {
		TypedQuery tqry = em.createQuery("Select c from Claim c", Claim.class);
        List<Claim> clList = tqry.getResultList();
		return clList;
	}

	@Override
	@Transactional
	public boolean updateStatus(int appNo, Claim c) {
		Claim temp=em.find(Claim.class, appNo);
		temp.setReqStatus(c.getReqStatus());
		Claim cx= em.merge(temp);
		if(cx!=null) {
			return true;
		}
		else {
		return false;
		}
	}
	
	@Override
    @Transactional
    public Claim deleteClaim(int appNo) {
        Claim dc = em.find(Claim.class, appNo);
        em.remove(dc);
        return dc;
    }

}
