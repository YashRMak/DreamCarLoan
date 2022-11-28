package com.lti.dream.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLES")
public class Vehicle {

	 @Id
	 @Column(name="VehicleId")
	 private int vId;
	
	 @Column(name="Vehicle_Model")
	 private String vModel;
	 
	 @Column(name="Vehicle_Price")
	 private double vPrice;

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvModel() {
		return vModel;
	}

	public void setvModel(String vModel) {
		this.vModel = vModel;
	}

	public double getvPrice() {
		return vPrice;
	}

	public void setvPrice(double vPrice) {
		this.vPrice = vPrice;
	}

	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vModel=" + vModel + ", vPrice=" + vPrice + "]";
	}

	public Vehicle(int vId, String vModel, double vPrice) {
		super();
		this.vId = vId;
		this.vModel = vModel;
		this.vPrice = vPrice;
	}

	public Vehicle() {
		super();
	}
	 
	 
	 
}
