package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.User;



public interface UserService {

	public int addUser1(User u);
	
	public User findUser(int userId);

	public List<User> findUserByName1(String userFirstName);
	
	public List<User> getAllUser();
	
	public boolean updateSal(int uid,User u);
	
	public User deleteUser(int uId);
}
