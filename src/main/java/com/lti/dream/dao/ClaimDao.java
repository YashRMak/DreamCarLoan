package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.Claim;


public interface ClaimDao {
	
	public int addClaim(Claim c);

	public Claim findClaimByNo(int appNo);

	public List<Claim> getAllClaims();

	public boolean updateStatus(int appNo, Claim c);

	public Claim deleteClaim(int appNo);
	
}
