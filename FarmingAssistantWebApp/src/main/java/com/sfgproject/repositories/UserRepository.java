package com.sfgproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sfgproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE CONCAT(u.name, ' ', u.email, ' ', u.address) LIKE %?1%")
	public List<User> search(String keyword);
}
