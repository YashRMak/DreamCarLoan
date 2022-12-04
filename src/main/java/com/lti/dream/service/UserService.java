package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.User;
import com.lti.dream.exception.UserNotFoundException;



public interface UserService {

	public int addUser1(User u);
	
	public User findUser(int userId) throws UserNotFoundException;

	public List<User> findUserByName1(String userFirstName);
	
	public List<User> getAllUser() throws UserNotFoundException;
	
	public boolean updateSal(int uid,User u);
	
	public boolean updateUserPswd(int uid,User u);
	
	public User deleteUser(int uId);

	public boolean checkUserLogin(int userId, String userPswd);
}
