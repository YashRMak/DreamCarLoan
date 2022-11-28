package com.lti.dream.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="PERSONALINFORMATION")
public class PersonalInformation {
 @Id
 @Column(name="Reg_id")
 private int regId;
 
 @Column(name="Name")
 private String name;
 
 @Column(name="Address")
 private String address;
 
 @Column(name="Contact_no")
 private String contactNo;

public int getRegId() {
	return regId;
}

public void setRegId(int regId) {
	this.regId = regId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getContactNo() {
	return contactNo;
}

public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}

@Override
public String toString() {
	return "PersonalDetails [regId=" + regId + ", name=" + name + ", address=" + address + ", contactNo=" + contactNo
			+ "]";
}

public PersonalInformation(int regId, String name, String address, String contactNo) {
	super();
	this.regId = regId;
	this.name = name;
	this.address = address;
	this.contactNo = contactNo;
}

public PersonalInformation() {
	super();
}
 
 
}
 