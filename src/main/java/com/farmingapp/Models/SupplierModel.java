package com.farmingapp.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="suppliers")
public class SupplierModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="lastname")
	private String lastname;
	@Column(name="firstname")
	private String firstname;
	@Column(name="email")
	private String email;
	@Column(name="phonenumber")
	private int phonenumber;
	@Column(name="address")
	private String address;
	
	@OneToMany(targetEntity = AdModel.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "supplierid",referencedColumnName = "id")
	private List<AdModel> admodel;
	
	public SupplierModel() {}
	
	public SupplierModel(String lastname, String firstname, String email, int phonenumber, String address) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
