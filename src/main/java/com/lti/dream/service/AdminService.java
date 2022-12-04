package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Admin;
import com.lti.dream.exception.AdminNotFoundException;

public interface AdminService {

	public int addAdmin(Admin a);
	
	public Admin findAdminById(int adminId) throws AdminNotFoundException ;

	public List<Admin> getAllAdmin() throws AdminNotFoundException ;

	public boolean updateAdminPswd(int adminId, Admin a);

	public boolean checkAdminLogin(int adminId, String adminPswd);

}
