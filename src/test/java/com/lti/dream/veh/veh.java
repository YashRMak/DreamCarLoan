package com.lti.dream.veh;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.lti.dream.beans.Vehicle;
import com.lti.dream.exception.VehicleNotFoundException;
import com.lti.dream.service.VehService;

@SpringBootTest
public class veh {


	
	@Autowired
	VehService vehService;
	
	@Test
	@Transactional
	void AddVehTest() {
	
	Vehicle v = new Vehicle(123,"Rolce Royce",2);
	Assertions.assertThat(vehService.addVehicle(v)).isNotNull();
	
	}
	
	@Test
	void getAllvehTest() throws VehicleNotFoundException{
		Vehicle v1= new Vehicle(123,"Rolce Royce",2);
		Vehicle v2 =new Vehicle(124,"Honda",3);
		
		List<Vehicle> vehList = new ArrayList<Vehicle>();
		vehList.add(v2);
		vehList.add(v1);
		assertThat( vehService.getAllveh()).isNotNull();
	}
	
	@Test
	void updateVehicleTest() {
		Vehicle v= new Vehicle(123,"Rolce Royce",2);
		assertThat(vehService.updatevehPrice(123, v));
	
	}
}