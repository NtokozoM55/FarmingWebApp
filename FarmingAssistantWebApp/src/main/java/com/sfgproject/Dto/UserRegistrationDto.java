package com.sfgproject.Dto;

import java.util.Set;

import com.sfgproject.entities.Role;

public class UserRegistrationDto {
	
	private String username;
	private String lastname;
	private String  firstname;
	private String phonenumber;
	private String address;
	private String password;
	private Set<Role> role;
	
	
	public UserRegistrationDto(){
		
	}

	
	public UserRegistrationDto(String username, String lastname, String firstname, String phonenumber, String address,
			String password, Set<Role> role) {
		super();
		this.username = username;
		this.lastname = lastname;
		this.firstname = firstname;
		this.phonenumber = phonenumber;
		this.address = address;
		this.password = password;
		this.role = role;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	

}
