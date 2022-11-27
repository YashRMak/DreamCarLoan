package com.lti.dream.service;

import java.util.List;

import com.lti.dream.beans.Document;

public interface DocService {
	public int addDoc(Document doc);

	public Document findDocByNo(int n);
	
	public List<Document> getAllDocs();

	public boolean updateDoc(int aaNo, Document doc);
	
	public boolean verification(int aaNo,Document doc);
}
