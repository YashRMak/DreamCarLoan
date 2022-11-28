package com.lti.dream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.dream.beans.Account;
import com.lti.dream.service.AccServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/account")
public class AccController {
	
	@Autowired
	AccServiceImpl accService;
	
	//http://localhost:8989/account/addacc
	@PostMapping("/addacc")
	public int addAcc(@RequestBody Account account) {
		return accService.addAcc(account);
	}
	
	//http://localhost:8989/account/findacc/{accNo}
	@GetMapping("/findacc/{accNo}") 
	public Account findAccByNo(@PathVariable("accNo") int accNo){
		return accService.findAccByNo(accNo);
	}
	
	//http://localhost:8989/account/accounts
	@GetMapping("/accounts")
	public List<Account> getAllAccs(){
		return accService.getAllAccounts();
	}
	
	//http://localhost:8989/account/updateacc/{accNo}
	@PutMapping("/updateacc/{accNo}")
	public boolean updateBalance(@PathVariable("accNo") int accNo, @RequestBody Account acc) {
		return accService.updateBalance(accNo, acc);
	}
	
	
//	http:localhost:8989/account/deleteacc/{accNo}
//	@DeleteMapping("/deleteacc/{accNo}")
//	public void deleteAcc(@PathVariable("accNo") int accNo, @RequestBody Account acc) {
//		accService.dropAcc(acc);
//	}
}
