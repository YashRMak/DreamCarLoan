package com.lti.dream.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.dream.beans.Vehicle;


public interface VehDao {

	
	List<Vehicle>getAllveh();
	int addVehicle(Vehicle v);
   boolean updatevehPrice( int vId, Vehicle v);
	
	 
}
