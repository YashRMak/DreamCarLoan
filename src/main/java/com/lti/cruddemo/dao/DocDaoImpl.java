package com.lti.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.cruddemo.beans.Document;

@Repository
public class DocDaoImpl implements DocDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public int addDoc(Document doc) {
		System.out.println("DAO layer");
		em.persist(doc);
		return doc.getAadharNo();
	}

	@Override
	public Document findDocByNo(int n) {
		System.out.println("DAO layer");
		Document doc= em.find(Document.class, n);
		return doc;
	}

	@Override
	public List<Document> getAllDocs() {
		TypedQuery tqry = em.createQuery("Select d from Document d",Document.class);
        List<Document> docList = tqry.getResultList();
        return docList;
		
	}

	@Override
	@Transactional
	public boolean updateDoc(int aaNo, Document doc) {
		Document temp=em.find(Document.class, aaNo);
		temp.setAadharNo(doc.getAadharNo());
		temp.setPanNo(doc.getPanNo());
		Document d= em.merge(temp);
		if(d!=null) {
			return true;
		}
		else {
		return false;
		}
	}
	
	
}
