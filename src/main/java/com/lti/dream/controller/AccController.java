package com.lti.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.cruddemo.beans.Account;
import com.lti.cruddemo.beans.Employee;
import com.lti.cruddemo.exception.HrException;
import com.lti.cruddemo.service.AccServiceImpl;

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
	
	//http://localhost:8989/account/accounts}
	@GetMapping("/accounts")
	public List<Account> getAllAccs(){
		return accService.getAllAccounts();
	}
	
	@PutMapping("/updateacc/{accNo}")
	public boolean updateBalance(@PathVariable("eid") int accNo, @RequestBody Account acc) {
		return accService.updateBalance(accNo, acc);
	}
	
}
