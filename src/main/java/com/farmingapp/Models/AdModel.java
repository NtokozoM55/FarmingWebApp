package com.farmingapp.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="advertisments")
public class AdModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="supplierid")
	private int supplierid;
	@Lob
	@Column(name="image",columnDefinition = "BLOB")
	private String image;
	@Column(name="cropname")
	private String cropname;
	@Column(name="postdate")
	private String postdate;
	@Column(name="quantity")
	private String quantity;
	@Column(name="status")
	private String status;
	
	@OneToMany(targetEntity = OfferModel.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "adid",referencedColumnName = "id")
	private List<OfferModel> offers;
	
	
	
	public AdModel() {}
	
	public AdModel(int supplierid, String image, String cropname, String postdate, String quantity, String status) {
		super();
		this.supplierid = supplierid;
		this.image = image;
		this.cropname = cropname;
		this.postdate = postdate;
		this.quantity = quantity;
		this.status = status;
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}