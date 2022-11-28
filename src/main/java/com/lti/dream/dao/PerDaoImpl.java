package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.PersonalInformation;


@Repository
public class PerDaoImpl implements PerDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addPerson(PersonalInformation p) {
		System.out.println(" dao layer");
		em.persist(p);
	    return  p.getRegId();
		
	}

	@Override
	public List<PersonalInformation> getAllpers() {
		System.out.println("dao layer p displays all records");
		Query qry = em.createQuery("Select p from PersonalInformation p");
		List<PersonalInformation> perList=qry.getResultList();
		return perList;
		
		
			
		}



	@Override
	public PersonalInformation findPersbyId(int regId)  {
		// TODO Auto-generated method stub
		PersonalInformation p=em.find(PersonalInformation.class, regId);
		
		return p;
		
	}
		}
	
    


