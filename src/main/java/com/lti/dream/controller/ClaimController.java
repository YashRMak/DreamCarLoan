package com.lti.dream.controller;

import com.lti.dream.beans.Claim;
import com.lti.dream.exception.ClaimNotFoundException;
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
	@PostMapping("/addclaim/{uid}")
	public int addClaim(@PathVariable("uid") int uid,@RequestBody Claim c) {
		return claimService.addClaim(uid,c);
	}
	
	//http://localhost:8989/claims/findclaim/{appNo}
	@GetMapping("/findclaim/{appNo}") 
	public Claim findClaimByNo(@PathVariable("appNo") int appNo){
		try{return claimService.findClaimByNo(appNo);}
		catch(ClaimNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
	
	//http://localhost:8989/claims/findclaimbycp/{cp}
	@GetMapping("/findclaimbycp/{cp}") 
	public List<Claim> findClaimbyreqStatus(@PathVariable("cp") int cp){
		try{return claimService.findClaimbyChosenPol(cp);}
		catch(ClaimNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
	
	//http://localhost:8989/claims/allclaims
	@GetMapping("/allclaims")
	public List<Claim> getAllClaims(){
		try{return claimService.getAllClaims();}
		catch(ClaimNotFoundException e){
			e.printStackTrace();
		}
		return null;
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
	
	//http://localhost:8989/claims/myclaim/{userId}
	@GetMapping("/myclaim/{userId}")
	public List<Claim> findMyClaim(@PathVariable("userId") int userId){
		try{return claimService.findMyClaim(userId);}
		catch(ClaimNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
	
	//http://localhost:8989/claims/rejectedlist
	@GetMapping("/rejectedlist")
	public List<Claim> rejectList(){
		try{return claimService.rejectedList();}
		catch(ClaimNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
			
	
}
