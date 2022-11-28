package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Policy;

public interface PolicyService {

	int addPolicy(Policy e);

	public Policy findPolicy(int empNo) ;

	public List<Policy> getAllPolicies();

	public boolean updatePolicyType(int policyNo, Policy p);
}
