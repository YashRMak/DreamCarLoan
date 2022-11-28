package com.lti.dream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.Policy;
import com.lti.dream.dao.PolicyDao;


@Service("policyService")
public class PolicyServiceImpl implements PolicyService{
	@Autowired
	PolicyDao dao;
	
	@Override
	public int addPolicy(Policy e) {
		System.out.println("service layer");
		int policyNo = dao.addPolicy(e);
		return policyNo;
	}
	@Override
	public Policy findPolicy(int policyNo){
	  Policy e = dao.findPolicy(policyNo);
	  return e;
	 }

 
	 @Override
	 public List<Policy> getAllPolicies() {
	  List<Policy> empList1 = dao.getAllPolicies();
	
	  return empList1;
	 }

	@Override
	public boolean updatePolicyType(int pNo, Policy p) {
		return dao.updatePolicyType(pNo, p);
	}

}

