package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Vehicle;
import com.lti.dream.exception.VehicleNotFoundException;

public interface VehService {

	List<Vehicle> getAllveh() throws VehicleNotFoundException;
	
	int addVehicle(Vehicle v);
	
	boolean updatevehPrice( int vId, Vehicle v);
}
