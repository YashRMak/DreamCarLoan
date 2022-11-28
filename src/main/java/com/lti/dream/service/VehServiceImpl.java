package com.lti.dream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.Vehicle;
import com.lti.dream.dao.VehDao;
@Service("VehService")

public class VehServiceImpl implements VehService{

	 @Autowired
	  VehDao dao;
	 
	 
	@Override
	public List<Vehicle> getAllveh() {
		// TODO Auto-generated method stub
		System.out.println("service layer");
		List<Vehicle>myList= dao.getAllveh();
		return myList;
		
	}


	@Override
	public int addVehicle(Vehicle v) {
		
		return dao.addVehicle(v);
		
	}


	@Override
	public boolean updatevehPrice(int vId, Vehicle v) {
		// TODO Auto-generated method stub
		return dao.updatevehPrice(vId, v);
		
	}

	
	
}
