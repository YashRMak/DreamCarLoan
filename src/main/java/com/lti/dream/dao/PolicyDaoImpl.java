package com.lti.dream.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Policy;
import com.lti.dream.exception.PolicyNotFoundException;


@Repository
public class PolicyDaoImpl implements PolicyDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addPolicy(Policy e) {
		System.out.println("dao layer");
		double amt=e.getLoanAmount();
		double roi=e.getRateOfInterest();
		int tenure=e.getTenure();
		double mi=(amt*(roi*0.01)*( (Math.pow(1+(roi*0.01),tenure))/ ((Math.pow(1+(roi*0.01),tenure))-1)))/12;	
		double mir=(double) Math.round(mi);
		e.setMonthlyInstallment(mir);
		em.persist(e);
		return e.getPolicyNo();

	}

	@Override
	public Policy findPolicy(int policyNo) throws PolicyNotFoundException {
		Policy e = em.find(Policy.class, policyNo);
		if(e==null) {
			throw new PolicyNotFoundException("Policy Not Found");
		}
		return e;
	}
	
	
	public List<Policy>getAllPolicies() throws PolicyNotFoundException {
		System.out.println("dao layer displays all records");
		Query qry=em.createQuery("select e from Policy e");
		List<Policy> polList=qry.getResultList();
		if(polList.isEmpty()) {
			throw new PolicyNotFoundException("Policy List Not Found");
		}
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
	

