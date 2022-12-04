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
import com.lti.dream.exception.ClaimNotFoundException;

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
	public Claim findClaimByNo(int appNo) throws ClaimNotFoundException{
		System.out.println("DAO layer");
		Claim c= em.find(Claim.class, appNo);
		if(c==null) {
			throw new ClaimNotFoundException("Claim Not Found");
		}
		return c;
		
	}
	
	@Override
	public  List<Claim> findClaimByChosenPol(int cp) throws ClaimNotFoundException{
		Query q5=em.createQuery("SELECT c FROM Claim c WHERE c.chosenPolicy = :cp",Claim.class);
		q5.setParameter("cp", cp);
		List<Claim> claimList = q5.getResultList();
		if(claimList.isEmpty()) {
			throw new ClaimNotFoundException("Claim List Not Found");
		}
		return claimList;
		}
	
	@Override
	public List<Claim> findMyClaim(int userId) throws ClaimNotFoundException{
		
		Query q= em.createQuery("select c from Claim as c where c.user.userId=:userId");
		q.setParameter("userId", userId);
		List<Claim> ucList= q.getResultList();
		if(ucList.isEmpty()) {
			throw new ClaimNotFoundException("Claim List Not Found");
		}
		return ucList;
		
	}
	
	@Override
	public  List<Claim> rejectedList() throws ClaimNotFoundException{
        Query q=em.createQuery("select c from Claim as c where c.reqStatus=:rejected");
        q.setParameter("rejected", "rejected");
        List<Claim>rList=q.getResultList();
        if(rList.isEmpty()) {
			throw new ClaimNotFoundException("Claim List Not Found");
		}
        return rList;
        
    }
	
	@Override
	public List<Claim> getAllClaims() throws ClaimNotFoundException{
		TypedQuery tqry = em.createQuery("Select c from Claim c", Claim.class);
        List<Claim> clList = tqry.getResultList();
        if(clList.isEmpty()) {
			throw new ClaimNotFoundException("Claim List Not Found");
		}
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
