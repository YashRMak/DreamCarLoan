package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.User;
import com.lti.dream.exception.UserNotFoundException;

public interface UserDao {

	public int addUser1(User u);
	
	public User findUser(int userId) throws UserNotFoundException;
	
	public List<User> findByuserFirstName1(List<User> findUserByName);

	public boolean updateSal(int uid, User u);

	public boolean updateUserPswd(int uid,User u);
	
	public List<User> getAllUser() throws UserNotFoundException;

	public User deleteUser(int userId);

	public boolean checkUserLogin(int userId, String userPswd);
	
	
}
