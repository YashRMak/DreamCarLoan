package com.lti.dream.controller;

import com.lti.dream.beans.Claim;
import com.lti.dream.service.ClaimServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/claims")
public class ClaimController {
	@Autowired
	ClaimServiceImpl claimService;
	
	//http://localhost:8989/claims/addclaim
	@PostMapping("/addclaim")
	public int addClaim(@RequestBody Claim c) {
		return claimService.addClaim(c);
	}
	
	//http://localhost:8989/claims/findclaim/{appNo}
	@GetMapping("/findclaim/{appNo}") 
	public Claim findClaimByNo(@PathVariable("appNo") int appNo){
		return claimService.findClaimByNo(appNo);
	}
	
	//http://localhost:8989/claims/findclaimbycp/{cp}
	@GetMapping("/findclaimbycp/{cp}") 
	public List<Claim> findClaimbyreqStatus(@PathVariable("cp") int cp){
		return claimService.findClaimbyChosenPol(cp);
	}
	
	//http://localhost:8989/claims/allclaims
	@GetMapping("/allclaims")
	public List<Claim> getAllClaims(){
		return claimService.getAllClaims();
	}
		
	//http://localhost:8989/claims/updateclaim/{appNo}
	@PutMapping("/updateclaim/{appNo}")
	public boolean updateStatus(@PathVariable("appNo") int appNo, @RequestBody Claim c) {
		return claimService.updateStatus(appNo, c);
	}
	
	//http://localhost:8989/claims/deleteclaim/{appNo}
	@DeleteMapping("/deleteclaim/{appNo}")
	public Claim deleteClaim(@PathVariable("appNo") int appNo) {
	    return claimService.deleteClaim(appNo);
	}
}
