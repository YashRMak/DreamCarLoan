package com.lti.dream.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.PersonalInformation;
import com.lti.dream.dao.PerDao;

@Service("PerService")
public class  PerServiceImpl implements PerService{

	  @Autowired
	  PerDao dao;
	  
	@Override
	public int addPerson(PersonalInformation p) {
		System.out.println(" service layer");
		int regId=dao.addPerson(p);
		return regId;
	}
	
	@Override
	public List<PersonalInformation> getAllpers() {
		
		System.out.println("service layer");
		List<PersonalInformation>myList= dao.getAllpers();
		return myList;
		
	}

	@Override
	public PersonalInformation findPersbyId(int regId){
	System.out.println("Service Layer");
	return dao.findPersbyId(regId);
		
		
	}
}

