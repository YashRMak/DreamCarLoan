package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Vehicle;

@Repository
public class VehDaoImpl implements VehDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Vehicle> getAllveh() {
		System.out.println("dao layer p displays all records");
		Query qry = em.createQuery("Select v from Vehicle v");
		List<Vehicle> vehList=qry.getResultList();
		return vehList;	
	}



	@Override
	@Transactional
	public int addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		System.out.println(" dao layer");
		em.persist(v);
	    return  v.getvId();	
	}

	@Override
	@Transactional
	public boolean updatevehPrice(int vId, Vehicle v) {
		
		Vehicle tempVeh=em.find(Vehicle.class, vId);
		if(tempVeh!=null) {
			tempVeh.setvPrice(v.getvPrice());
		Vehicle ve=em.merge(tempVeh);
				return true;
		}
		else {
			return false;
		}
	}
}







