package com.lti.cruddemo.service;

import java.util.List;

import com.lti.cruddemo.beans.Document;

public interface DocService {
	public int addDoc(Document doc);

	public Document findDocByNo(int n);
	
	public List<Document> getAllDocs();

	public boolean updateDoc(int aaNo, Document doc);
}
