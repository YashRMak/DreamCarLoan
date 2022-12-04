package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Claim;
import com.lti.dream.exception.ClaimNotFoundException;

public interface ClaimService {
	
	public int addClaim(int uid,Claim c);

	public Claim findClaimByNo(int appNo) throws ClaimNotFoundException;//User only

	public List<Claim> getAllClaims() throws ClaimNotFoundException;

	public boolean updateStatus(int appNo, Claim c);

	public Claim deleteClaim(int appNo);

	public List<Claim> findClaimbyChosenPol(int cp) throws ClaimNotFoundException; // Admin only

	public List<Claim> findMyClaim(int userId) throws ClaimNotFoundException;

	public List<Claim> rejectedList()throws ClaimNotFoundException;
	
	
	
}
