package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Vehicle;

public interface VehService {

	List<Vehicle> getAllveh();
	
	int addVehicle(Vehicle v);
	
	boolean updatevehPrice( int vId, Vehicle v);
}
