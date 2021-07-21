package com.sfgproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  
	
	@Column(name = "rolename")
    private String rolename;
	
	
	public Role() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return rolename;
	}
	public void setName(String name) {
		this.rolename = name;
	}
	public Role(String rolename) {
		super();
		this.rolename = rolename;
	}
   
	
 
}

