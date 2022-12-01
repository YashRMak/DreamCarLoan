package com.lti.dream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.dream.beans.Claim;
import com.lti.dream.beans.User;
import com.lti.dream.service.UserServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("user")
public class UserController   {
	
    @Autowired
	UserServiceImpl  userService ;
	
	
	//http://localhost:8989/user/adduser
	@PostMapping("/adduser")
	public int addUser1(@RequestBody User u) {
		return userService.addUser1(u);
	}
	
	//http://localhost:8989/user/finduser/{uid}
	@GetMapping("/finduser/{uid}")
    public User findUser(@PathVariable("uid") int userId){
        return userService.findUser(userId);
    }
	
	//http://localhost:8989/user/alluser
	@GetMapping("/alluser")
    public List<User> allUser(){
        return userService.getAllUser();
    }
	
	//http://localhost:8989/user/updateusersal/{uId}
	@PutMapping("/updateusersal/{uId}")
    public boolean updateSal(@PathVariable("uId") int uId, @RequestBody User u){
        return userService.updateSal(uId, u);
    }
	
	//http://localhost:8989/user/updateuserpswd/{uId}
	@PutMapping("/updateuserpswd/{uId}")
	public boolean updateUserPswd(@PathVariable("uId") int uId, @RequestBody User u){
	    return userService.updateUserPswd(uId, u);
	}
	
	//http://localhost:8989/user/deleteuser/{uId}
	@DeleteMapping("/deleteuser/{uId}")
	public User deleteUser(@PathVariable("uId") int uId) {
	    return userService.deleteUser(uId);
	}
	
	//http://localhost:8989/user/userlogin/{userId}
	@GetMapping("/userlogin/{userId}")
	public boolean checkUserLogin(@PathVariable("userId") int userId,String userPswd){
		return userService.checkUserLogin(userId, userPswd);
	}
}

	
