package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.Admin;

public interface AdminDao {

	public int addAdmin(Admin a);
	
	public Admin findAdminById(int adminId);

	public List<Admin> getAllAdmin();
	
	public boolean updateAdminPswd(int adminId, Admin a);

//	public boolean deleteAdminId(int adminId, Admin a);

	
}