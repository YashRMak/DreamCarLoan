package com.lti.dream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.dream.beans.Admin;

import com.lti.dream.service.AdminServiceImpl;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin")
public class AdminController   {

    @Autowired
	AdminServiceImpl adminService;
	
	//http://localhost:8989/admin/addadmin
	@PostMapping("/addadmin")
	public int addAdmin(@RequestBody Admin a) {
		return adminService.addAdmin(a);
	}
    
	//http://localhost:8989/admin/findadmin/{aid}
	@GetMapping("/findadmin/{aid}")
	public Admin findAdmin(@PathVariable("aid") int adminId) {
		return adminService.findAdminById(adminId);
	}
	
    //http://localhost:8989/admin/alladmin
	@GetMapping("/alladmin")
	public List<Admin> allAdmin(){
		return adminService.getAllAdmin();
	}
	
    //http://localhost:8989/admin/updateadmin/{aid}
	@PutMapping("/updateadmin/{aid}")
	public boolean updateAdminPswd(@PathVariable("aid") int aid, @RequestBody Admin a){
		return adminService.updateAdminPswd(aid, a);
	}
	
	//http://localhost:8989/admin/adminlogin/{adminId}
		@GetMapping("/adminlogin/{adminId}")
		public boolean checkAdminLogin(@PathVariable("adminId") int adminId, String adminPswd){
			return adminService.checkAdminLogin(adminId, adminPswd);
		}
	
}

	
