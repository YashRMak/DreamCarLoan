package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Claim;
import com.lti.dream.beans.User;

@Repository
public class ClaimDaoImpl implements ClaimDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int addClaim(int uid,Claim c) {
		User u=em.find(User.class, uid);
		c.setUser(u);
		c.setReqStatus("pending");
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
	public  List<Claim> findClaimByChosenPol(int cp) {
		Query q5=em.createQuery("SELECT c FROM Claim c WHERE c.chosenPolicy = :cp",Claim.class);
		
		q5.setParameter("cp", cp);
		List<Claim> claimList = q5.getResultList();
		return claimList;
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
