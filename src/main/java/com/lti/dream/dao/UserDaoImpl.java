package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Claim;
import com.lti.dream.beans.User;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	public EntityManager em;

	@Override
	@Transactional
	public int addUser1(User u) {
		System.out.println("Dao layer");
		em.persist(u);
		
		System.out.println("record added");
		return u.getUserId();

	}

	 @Override
	public User findUser(int userId) {
		User emp_find = em.find(User.class, userId);
		
		return emp_find;
	} 

	@Override
	public List<User> findByuserFirstName1(List<User> findUserByName) {
		TypedQuery<User> qry=em.createQuery("SELECT u FROM User u WHERE e.userFirstName = :userFirstName",User.class);
		qry.setParameter("userFirstName", findByuserFirstName1(null));
		List<User> userList = qry.getResultList();
		
		return userList;
	}
	
	 @Override
	    @Transactional
	    public List<User> getAllUser()  {
	        TypedQuery<User> qry=em.createQuery("SELECT u FROM User u ",User.class);
	        List<User> userList = qry.getResultList();
	        
	        return userList;
	    }

	@Override
	@Transactional
	public boolean updateSal(int userId, User u) {
		
		User tempUser=em.find(User.class, userId);
		tempUser.setUserSal(u.getUserSal());
		em.merge(tempUser);
		return true;
	}
	
	@Override
	@Transactional
	public boolean updateUserPswd(int userId, User u) {
		
		User tempUser=em.find(User.class, userId);
		tempUser.setUserPswd(u.getUserPswd());;
		em.merge(tempUser);
		return true;
	}


	@Override
    @Transactional
    public User deleteUser(int uId) {
        User u = em.find(User.class, uId);
        em.remove(u);
        return u;
    }
	
}