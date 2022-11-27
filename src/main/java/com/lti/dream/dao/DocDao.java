package com.lti.cruddemo.dao;

import java.util.List;

import com.lti.cruddemo.beans.Document;

public interface DocDao {
	public int addDoc(Document doc);

	public Document findDocByNo(int n);
	
	public List<Document> getAllDocs();

	public boolean updateDoc(int aaNo, Document doc);

}
