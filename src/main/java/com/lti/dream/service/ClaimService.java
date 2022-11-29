package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Claim;

public interface ClaimService {
	public int addClaim(Claim c);

	public Claim findClaimByNo(int appNo);

	public List<Claim> getAllClaims();

	public boolean updateStatus(int appNo, Claim c);

	public Claim deleteClaim(int appNo);
	
}
