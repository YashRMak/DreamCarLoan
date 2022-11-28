package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.PersonalInformation;

public interface PerDao {
	
	int addPerson(PersonalInformation p);
	
	
	List<PersonalInformation>getAllpers();
	 PersonalInformation findPersbyId(int regId);
}
	
	
