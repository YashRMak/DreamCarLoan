package com.lti.dream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.lti.dream.beans.Claim;
import com.lti.dream.beans.User;

import com.lti.dream.dao.UserDao;
import com.lti.dream.exception.UserNotFoundException;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	
	@Override
	public int addUser1(User u) {
		System.out.println(" Service Layer ");
		int userId = dao.addUser1(u);
		return userId;
	}

	@Override
	public User findUser(@PathVariable("uid") int userId) throws UserNotFoundException{
		User u1=dao.findUser(userId);
		
		return u1;
	}

	@Override
	public List<User> findUserByName1(String userFirstName) {
		List<User> userList2 = (List<User>) dao.findByuserFirstName1(findUserByName1(userFirstName));
		return userList2;
	}

	@Override
	public boolean updateSal(int userId, User u) {
	    boolean ans = dao.updateSal(userId, u);
	    return ans;
	}
	
	@Override
	public boolean updateUserPswd(int userId, User u) {
	    boolean ans = dao.updateSal(userId, u);
	    return ans;
	}

	@Override
	   public List<User> getAllUser() throws UserNotFoundException{
	       List<User> userList = dao.getAllUser();
	       return userList;
	}
	
	@Override
    public User deleteUser(int uId) {
        User u1=dao.deleteUser(uId);
        return u1;
    }
	
	@Override
	public boolean checkUserLogin(int userId, String userPswd) {
		
		return dao.checkUserLogin(userId, userPswd);
	}
	
	
}