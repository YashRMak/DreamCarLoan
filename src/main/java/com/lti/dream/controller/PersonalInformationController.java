package com.lti.dream.controller;

import java.util.ArrayList;
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

import com.lti.dream.beans.PersonalInformation;
import com.lti.dream.service.PerServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/per")
public class PersonalInformationController {
	
	@Autowired
	PerServiceImpl PerService;
	
	//http://localhost:8282/per/getpers
		@GetMapping("/getpers")
	public List<PersonalInformation> getAllpers() 
		{
			
				return PerService.getAllpers();
			}

		
		//http://localhost:8282/per/addpers
		@PostMapping("/addpers")
		public int addPerson(@RequestBody PersonalInformation p) {
			return PerService.addPerson(p);
		}
		
		//http://localhost:8282/per/findpers/103
		@GetMapping("/findpers/{regId}")
		public PersonalInformation findPersbyId(@PathVariable("regId") int regId)
		{
			return PerService.findPersbyId(regId);
		}
			
}
