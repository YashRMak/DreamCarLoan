package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.User;

public interface UserDao {

	public int addUser1(User u);
	
	public User findUser(int userId);
	
	public List<User> findByuserFirstName1(List<User> findUserByName);

	public boolean updateSal(int uid, User u);

	public List<User> getAllUser();

	public boolean deleteUserId(int userId, User u);
}
