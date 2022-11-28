package com.lti.dream.dao;

import java.util.List;

import com.lti.dream.beans.Document;

public interface DocDao {
	public int addDoc(Document doc);

	public Document findDocByNo(int n);
	
	public List<Document> getAllDocs();

	public boolean updatePAN(int aaNo, Document doc);

	public boolean updateVerification(int aaNo, Document doc);

}
