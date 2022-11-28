package com.lti.dream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.lti.dream.beans.User;
import com.lti.dream.service.UserServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/registration")
public class UserController   {
	
    @Autowired
	UserServiceImpl  userService ;
	
	
	//http://localhost:8686/registration/adduser
	@PostMapping("/adduser")
	public int addUser1(@RequestBody User u) {
		return userService.addUser1(u);
	}
	
	//http://localhost:8686/registration//finduser/{uid}
	@GetMapping("/finduser/{uid}")
    public User findUser(@PathVariable("uid") int userId){
        return userService.findUser(userId);
    }
	
	@GetMapping("/alluser")
    public List<User> allUser(){
        return userService.getAllUser();
    }
	
	//http://localhost:8686/registration/updateuser/{uid}
	@PutMapping("/updateuser/{uid}")
    public boolean updateSal(@PathVariable("uid") int uid, @RequestBody User u)
    {
        return userService.updateSal(uid, u);
    }
	
}

	
