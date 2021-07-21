package com.sfgproject.repositories;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfgproject.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	
	 //public Set<Role> findByRolename(String Rolename);
	 public Role findById(Integer Id);

}
