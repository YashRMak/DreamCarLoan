package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.Policy;

public interface PolicyDao {

	int addPolicy(Policy e);
	
	public Policy findPolicy(int empNo) ;

	public List<Policy> getAllPolicies();

	public boolean updatePolicyType(int policyNo, Policy e);

}
