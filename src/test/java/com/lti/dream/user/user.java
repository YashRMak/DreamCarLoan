package com.lti.dream.user;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.lti.dream.beans.User;
import com.lti.dream.dao.UserDao;
import com.lti.dream.exception.UserNotFoundException;
import com.lti.dream.service.UserService;

@SpringBootTest
public class user {


	
	@Autowired
	UserService userService;
	UserDao userDao;
	@Test
	@Transactional
	void AddUser1Test() {
	
	User u = new User(123,"John",60000,1234,"Johnn","ghaziabad",1233,12345,111,101,"dsa");
	assertThat(userService.addUser1(u)).isNotNull();
	}
	
	@Test
	public void findUserTest() throws UserNotFoundException {
		boolean actualResult=userDao.findUser(124) != null;
		assertThat(actualResult).isFalse();

		}
	
	@Test
	void getAllUserTest() throws UserNotFoundException{
		User u1= new User(12333,"Johnn",600,59,"Johnn","up",125,124,14,101,"dsa");
		User u2 =new User(1234,"Jon",60,1,"Joh","Mumbai",12,2345,11,01,"sa");
		
		List<User> userList = new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);
	
	     assertThat(userService.getAllUser()).isNotNull();

	}
}