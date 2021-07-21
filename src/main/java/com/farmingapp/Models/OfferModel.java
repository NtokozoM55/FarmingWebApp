package com.farmingapp.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offers")
public class OfferModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="farmerid")
	private int farmerid;
	@Column(name="farmername")
	private String farmername;
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private float price;
	@Column(name="status")
	private String status;
	@Column(name="adid")
	private int adid;
	
	
	
	
	
	public OfferModel(){}
	
	
	public OfferModel(int farmerid, String farmername, int quantity, float price) {
		super();
		this.farmerid = farmerid;
		this.farmername = farmername;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFarmerid() {
		return farmerid;
	}
	public void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}
	public String getFarmername() {
		return farmername;
	}
	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAdid() {
		return adid;
	}
	public void setAdid(int adid) {
		this.adid = adid;
	}
	
	
	
	
	
	
}
