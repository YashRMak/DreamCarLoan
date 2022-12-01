package com.lti.dream.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.Admin;

import com.lti.dream.dao.AdminDao;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao dao;
		
	@Override
	public int addAdmin(Admin a) {
		int adminId = dao.addAdmin(a);
		return adminId;
	}

	@Override
	public Admin findAdminById(int adminId) {
		Admin a =  dao.findAdminById(adminId);
		return a;
	} 
	
	@Override
	public List<Admin> getAllAdmin() {
		List<Admin> adminList = dao.getAllAdmin();
		return adminList;
	}

	@Override
	public boolean updateAdminPswd(int adminId, Admin a) {
		boolean ans = dao.updateAdminPswd(adminId, a);
		return ans;
	}
	
	@Override
	public boolean checkAdminLogin(int adminId, String adminPswd) {
		
		return dao.checkAdminLogin(adminId, adminPswd);
	}
	
}