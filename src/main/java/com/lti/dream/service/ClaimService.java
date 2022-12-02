package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Claim;

public interface ClaimService {
	
	public int addClaim(int uid,Claim c);

	public Claim findClaimByNo(int appNo);//User only

	public List<Claim> getAllClaims();

	public boolean updateStatus(int appNo, Claim c);

	public Claim deleteClaim(int appNo);

	List<Claim> findClaimbyChosenPol(int cp); // Admin only
	
}
