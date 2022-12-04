package com.lti.dream.policy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.lti.dream.beans.Policy;
import com.lti.dream.exception.PolicyNotFoundException;
import com.lti.dream.service.PolicyService;

@SpringBootTest
public class policy {


	
	@Autowired
	PolicyService policyService;
	
	@Test
	@Transactional
	void AddPolicyTest() {
	
	Policy p = new Policy(123, "Car Loan",5000,2,5,4500,34);
	Assertions.assertThat(policyService.addPolicy(p)).isNotNull();
	
	}
	
	@Test
	
	void getAllPoliciesTest() throws PolicyNotFoundException{
		Policy p1= new Policy(123, "Car Loan",5000,2,5,4500,23);
		Policy p2 =new Policy(12, "Toyota",500,20,50,450,34);
		
		List<Policy> polList = new ArrayList<Policy>();
		polList.add(p1);
		polList.add(p2);
	     assertThat(policyService.getAllPolicies()).isNotNull();

	}

}