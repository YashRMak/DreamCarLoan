package com.lti.dream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.Claim;
import com.lti.dream.dao.ClaimDao;

@Service("claimService")
public class ClaimServiceImpl implements ClaimService{

	@Autowired
	ClaimDao dao;
	
	@Override
	public int addClaim(Claim c) {
		System.out.println("service layer");
		int appNo=dao.addClaim(c);
		return appNo;
	}

	@Override
	public Claim findClaimByNo(int appNo) {
		Claim fc= dao.findClaimByNo(appNo);
		return fc;
	}

	@Override
	public List<Claim> getAllClaims() {
		List<Claim> clList= dao.getAllClaims(); 
		return clList;
	}

	@Override
	public boolean updateStatus(int appNo, Claim c) {
		return dao.updateStatus(appNo, c);
	}
	
	@Override
    public Claim deleteClaimByNo(int appNo) {
        Claim c1=dao.deleteClaimByNo(appNo);
        return c1;
    }
}