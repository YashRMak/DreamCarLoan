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
import com.lti.dream.exception.VehicleNotFoundException;
import com.lti.dream.service.VehServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	VehServiceImpl VehService;

	//http://localhost:8989/vehicle/getveh
		@GetMapping("/getveh")
	public List<Vehicle> getAllpers() {
			try{return VehService.getAllveh();}
			catch(VehicleNotFoundException e) {
				e.printStackTrace();
			}
			return null;
		}
	
		
		//http://localhost:8989/vehicle/addveh
		@PostMapping("/addveh")
	public int addVehicle(@RequestBody Vehicle v) {
		return VehService.addVehicle(v);
	}
		
	
		
	//http://localhost:8989/vehicle/updateveh/101
//	@PutMapping("/updateveh/{vId}")
//	public boolean updatevehPrice(@PathVariable("vId") int vId, @RequestBody Vehicle v) {
//		return VehService.updatevehPrice(vId,v);
//	}
	
}
		
