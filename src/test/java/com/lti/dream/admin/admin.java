package com.lti.dream.admin;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.dream.beans.Admin;
import com.lti.dream.exception.AdminNotFoundException;
import com.lti.dream.service.AdminService;


@SpringBootTest

public class admin {


	
	@Autowired
	AdminService adminService;
	
	@Test
	@Transactional
	void AddAdminTest() {
	
	Admin a = new Admin(125,"gohn","dsd");
	Assertions.assertThat(adminService.addAdmin(a)).isNotNull();
	
	}
	
	
	@Test
	void AllAdminTest() throws AdminNotFoundException{
		Admin a1= new Admin(123,"John","wsd");
		Admin a2 =new Admin(124,"gohb","dsd");
		
		List<Admin> adminList = new ArrayList<Admin>();
		adminList.add(a1);
		adminList.add(a2);
		
		Assertions.assertThat( adminService.getAllAdmin() ).isNotNull();

	}
	

	@Test
	void findAdminByIdTest() throws AdminNotFoundException{
		Admin a1= new Admin(125,"John","dsd");
		Assertions.assertThat(adminService.findAdminById(125)).isNull();
	}

	

}