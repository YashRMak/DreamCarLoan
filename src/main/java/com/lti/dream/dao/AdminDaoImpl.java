package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Account;
import com.lti.dream.beans.Admin;

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
	public Admin findAdminById(int adminId) {
		Admin a = em.find(Admin.class, adminId);
	    return a;
	} 
	 
	@Override
	public List<Admin> getAllAdmin() {
		TypedQuery<Admin> qry=em.createQuery("SELECT a FROM Admin a ",Admin.class);
		List<Admin> adminList = qry.getResultList();
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

//	@Override
//	public boolean deleteAdminId(int adminId, Admin a) {
//		Admin tempAdmin=em.find(Admin.class, adminId);
//		tempAdmin.setAdminId(a.getAdminId());
//		em.remove(tempAdmin);
//		em.merge(tempAdmin);
//		return true;
//	}


	
}