package com.lti.dream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.Claim;
import com.lti.dream.dao.ClaimDao;
import com.lti.dream.exception.ClaimNotFoundException;

@Service("claimService")
public class ClaimServiceImpl implements ClaimService{

	@Autowired
	ClaimDao dao;
	
	@Override
	public int addClaim(int uid,Claim c) {
		System.out.println("service layer");
		int appNo=dao.addClaim(uid,c);
		return appNo;
	}

	@Override
	public Claim findClaimByNo(int appNo) throws ClaimNotFoundException{
		Claim fc= dao.findClaimByNo(appNo) ;
		return fc;
	}
	
	@Override
	public List<Claim> findClaimbyChosenPol(int cp) throws ClaimNotFoundException{
		List<Claim> Claim_List = dao.findClaimByChosenPol(cp);
		return Claim_List;
	}

	@Override
	public List<Claim> getAllClaims() throws ClaimNotFoundException{
		List<Claim> clList= dao.getAllClaims(); 
		return clList;
	}

	@Override
	public boolean updateStatus(int appNo, Claim c) {
		return dao.updateStatus(appNo, c);
	}
	
	@Override
    public Claim deleteClaim(int appNo) {
        Claim c1=dao.deleteClaim(appNo);
        return c1;
    }
	
	@Override
	public List<Claim> findMyClaim(int userId) throws ClaimNotFoundException{
		List<Claim> ucList=dao.findMyClaim(userId);
		return ucList;
		
	}
	
	@Override
	public List<Claim> rejectedList() throws ClaimNotFoundException{
		List<Claim> rList=dao.rejectedList();
		return rList;
	}
}
