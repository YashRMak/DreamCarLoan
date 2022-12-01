package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Policy;


@Repository
public class PolicyDaoImpl implements PolicyDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addPolicy(Policy e) {
		System.out.println("dao layer");

		em.persist(e);
		return e.getPolicyNo();

	}

	@Override
	public Policy findPolicy(int policyNo) {
		Policy e = em.find(Policy.class, policyNo);
		if(e==null) {
			System.out.println("Employee not found");
		}
		return e;
	}
	
	
	public List<Policy>getAllPolicies(){
		System.out.println("dao layer displays all records");
		Query qry=em.createQuery("select e from Policy e");
		List<Policy> polList=qry.getResultList();
		return polList;
	}



	@Override
	@Transactional
	public boolean updatePolicyType(int pNo, Policy p) {
		Policy temp=em.find(Policy.class, pNo);
		temp.setPolicyType(p.getPolicyType());;
		Policy px= em.merge(temp);
		if(px!=null) {
			return true;
		}
		else {
		return false;
		}
	}
}
	

