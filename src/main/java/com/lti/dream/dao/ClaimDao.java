package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.Claim;


public interface ClaimDao {
	
	public int addClaim(int uid,Claim c);

	public Claim findClaimByNo(int appNo);

	public List<Claim> getAllClaims();

	public boolean updateStatus(int appNo, Claim c);

	public Claim deleteClaim(int appNo);

	public List<Claim> findClaimByChosenPol(int cp);

	public List<Claim> findMyClaim(int userId);

	public List<Claim> rejectedList();
	
	
}
