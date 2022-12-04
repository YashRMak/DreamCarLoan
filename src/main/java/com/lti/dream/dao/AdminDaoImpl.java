package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Admin;
import com.lti.dream.exception.AdminNotFoundException;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	public EntityManager em;

	@Override
	@Transactional
	public int addAdmin(Admin a) {
		em.persist(a);	
		System.out.println("Admin record added");
		return a.getAdminId();
	}

	 @Override
	public Admin findAdminById(int adminId) throws AdminNotFoundException {
		Admin a = em.find(Admin.class, adminId);
		if(a!=null) {
			 return a;
		}
		else {
		throw new AdminNotFoundException("Admin Not Found");
		}
	} 
	 
	@Override
	public List<Admin> getAllAdmin() throws AdminNotFoundException{
		TypedQuery<Admin> qry=em.createQuery("SELECT a FROM Admin a ",Admin.class);
		List<Admin> adminList = qry.getResultList();
		if(adminList.isEmpty()) {
			throw new AdminNotFoundException("Admin List Not Found");
		}
		return adminList;
	}

	@Override
	@Transactional
	public boolean updateAdminPswd(int adminId, Admin a) {
		Admin temp=em.find(Admin.class, adminId);
		temp.setAdminPswd(a.getAdminPswd());;
		Admin ax= em.merge(temp);
		if(ax!=null) {
			return true;
		}
		else {
		return false;
		}
	}

	@Override
	public boolean checkAdminLogin(int adminId, String adminPswd) {
		Admin temp1=em.find(Admin.class, adminId);
		if (temp1!=null && temp1.getAdminId()==adminId && temp1.getAdminPswd().equals(adminPswd)){
			return true;
		}
		return false;
	}
}