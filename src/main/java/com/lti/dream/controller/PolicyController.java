package com.lti.dream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.lti.dream.beans.Policy;
import com.lti.dream.exception.PolicyNotFoundException;
import com.lti.dream.service.PolicyServiceImpl;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/policies")

public class PolicyController {
	
	@Autowired
	PolicyServiceImpl policyService;
	
	//http://localhost:8989/policies/findpolicy/{pNo}
	@GetMapping("/findpolicy/{pNo}")
	public Policy findPolicy(@PathVariable("pNo")int pNo){
		try{return policyService.findPolicy(pNo);}
		catch(PolicyNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//http://localhost:8989/policies/allpol
	@GetMapping("/allpol")
	public  List<Policy> getAllPolicies() {
		try{return policyService.getAllPolicies();}
		catch(PolicyNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	//http://localhost:8989/policies/addpolicy
	@PostMapping("/addpolicy")
	public  int addPolicy(@RequestBody Policy p) {
		return policyService.addPolicy(p);
		  
	}
	
	//http://localhost:8989/policies/updatepolicy/{pNo}
	@PutMapping("/updatepolicy/{pNo}")
	public boolean updatePolicyType(@PathVariable("pNo")int pNo,@RequestBody Policy p) {
		return policyService.updatePolicyType(pNo, p);
	}
}

