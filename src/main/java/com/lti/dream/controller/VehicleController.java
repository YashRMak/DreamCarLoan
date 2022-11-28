package com.lti.dream.controller;

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

import com.lti.dream.beans.Vehicle;
import com.lti.dream.service.VehServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/veh")
public class VehicleController {
	
	@Autowired
	VehServiceImpl VehService;

	//http://localhost:8989/veh/getveh
		@GetMapping("/getveh")
	public List<Vehicle> getAllpers() 
		{
			return VehService.getAllveh();
		}
	
		
		//http://localhost:8989/veh/addveh
		@PostMapping("/addveh")
	public int addVehicle(@RequestBody Vehicle v) {
		return VehService.addVehicle(v);
	}
		
	//http://localhost:8989/veh/updateveh/101
	@PutMapping("/updateveh/{vId}")
	public boolean updatevehPrice(@PathVariable("vId") int vId, @RequestBody Vehicle v) {
		return VehService.updatevehPrice(vId,v);
	}
	
}
		
