package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Admin;

public interface AdminService {

	public int addAdmin(Admin a);
	
	public Admin findAdminById(int adminId);

	public List<Admin> getAllAdmin();

	public boolean updateAdminPswd(int adminId, Admin a);

	public boolean checkAdminLogin(int adminId, String adminPswd);

}
