package com.lti.dream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dream.beans.Document;
import com.lti.dream.dao.DocDao;

@Service("docService")
public class DocServiceImpl implements DocDao{
	@Autowired
	DocDao dao;

	@Override
	public int addDoc(Document doc) {
		System.out.println("service layer");
		int aaNo=dao.addDoc(doc);
		return aaNo;
	}

	@Override
	public Document findDocByNo(int n) {
		Document fd= dao.findDocByNo(n);
		return fd;
	}

	@Override
	public List<Document> getAllDocs() {
		List<Document> docList= dao.getAllDocs(); 
		return docList;
	}

	@Override
	public boolean updateDoc(int aaNo, Document doc) {
		boolean t= dao.updateDoc(aaNo, doc);
		return t;
	}
}
