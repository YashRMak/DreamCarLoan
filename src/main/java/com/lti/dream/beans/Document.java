package com.lti.dream.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCUMENTS")
public class Document {
	@Id
	private int aadharNo;
	
	private String panNo;
	private String verified;
	
	public Document() {
		super();
	}
	public Document(int aadharNo, String panNo, String verified) {
		super();
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.verified = verified;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getVerified() {
		return verified;
	}
	public void setVerified(String verified) {
		this.verified = verified;
	}
	@Override
	public String toString() {
		return "Document [aadharNo=" + aadharNo + ", panNo=" + panNo + ", verified=" + verified + "]";
	}
	
}
