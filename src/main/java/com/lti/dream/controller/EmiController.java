package com.lti.dream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.lti.dream.beans.Emi;
import com.lti.dream.service.EmiServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/emi")

public class EmiController {
	
	@Autowired
	EmiServiceImpl EmiService;

	//http://localhost:8989/emi/EmiService
	@GetMapping("/emilist")
	public  List<Emi> getAllemiofusers() {
		  return EmiService.getAllemis();
	}

	//http://localhost:8989/emi/addemiofuser
	@PostMapping("/addemiofuser")
	public  int addemiofuser(@RequestBody Emi e) {

		return EmiService.addemiofuser(e);
	}
	
	//http://localhost:8989/emi/updateuser/1071
	@PutMapping("/updateemi/{loanAmount}")
	boolean updateRoi(@PathVariable("loanAmount") int loanAmount, @RequestBody Emi e){
        return EmiService.updateRoi(loanAmount, e);
    }
	
	//http://localhost:8989/emi/findemi/1071
	@GetMapping("/findemi/{loanAmount}")
	public Emi find(@PathVariable ("loanAmount") int loanAmount) {
		return EmiService.find(loanAmount);
	}
	
	//http://localhost:8989/emi/updatemi/1071
    @PutMapping("/updatemi/{loanAmount}")
    boolean updateMonthlyInstallment(@PathVariable("loanAmount") int loanAmount, Emi e) {
        return EmiService.updateMonthlyInstallment(loanAmount, e);
    }

}
