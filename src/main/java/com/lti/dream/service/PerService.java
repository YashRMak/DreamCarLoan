package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.PersonalInformation;

public interface PerService {
    int addPerson(PersonalInformation p);
    
    List<PersonalInformation> getAllpers() ;
    
    PersonalInformation findPersbyId(int regId);

}
