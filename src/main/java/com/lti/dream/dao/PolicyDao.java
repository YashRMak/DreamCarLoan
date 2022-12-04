package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.Policy;
import com.lti.dream.exception.PolicyNotFoundException;

public interface PolicyDao {

	int addPolicy(Policy e);
	
	public Policy findPolicy(int empNo) throws PolicyNotFoundException ;

	public List<Policy> getAllPolicies() throws PolicyNotFoundException ;

	public boolean updatePolicyType(int policyNo, Policy e);

}
