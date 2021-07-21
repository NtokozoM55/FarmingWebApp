package com.sfgproject.entities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "phonenumber")
	private String phonenumber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "enabled")
	private boolean enabled;

	

	
	
	  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	  
	  @JoinTable( name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
	  inverseJoinColumns = @JoinColumn(name = "role_id") ) private Set<Role> roles
	  = new HashSet<>();
	  
	  public boolean hasRole(String rolename) { Iterator<Role> iterator =
	  this.roles.iterator(); while (iterator.hasNext()) { Role role =
	  iterator.next(); if (role.getName().equals(rolename)) { return true; } }
	  
	  return false; }
	 
	  
	  

	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
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
	


	public String getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(String phoneNumber) {
		this.phonenumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", lastname=" + lastname + ", firstname="
				+ firstname + ", phonenumber=" + phonenumber + ", address=" + address + ", password=" + password
				+ ", enabled=" + enabled + ", roles=" + roles + "]";
	}





	
	
	

	


}
