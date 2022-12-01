package com.lti.dream.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dream.beans.Account;
import com.lti.dream.beans.Document;
import com.lti.dream.beans.User;

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
	public boolean updatePAN(int aaNo, Document doc) {
		Document temp=em.find(Document.class, aaNo);
		temp.setPanNo(doc.getPanNo());
		Document d= em.merge(temp);
		if(d!=null) {
			return true;
		}
		else {
		return false;
		}
	}

	@Override
	@Transactional
	public boolean updateVerification(int aaNo, Document doc) {
		Document temp=em.find(Document.class, aaNo);
		temp.setVerified(doc.getVerified());
		Document docx= em.merge(temp);
		if(docx!=null) {
			return true;
		}
		else {
		return false;
		}
	}

	@Override
    @Transactional
    public Document deleteDoc(int aNo) {
        Document d = em.find(Document.class, aNo);
        em.remove(d);
        return d;
    }
	
}
