package com.sfgproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfgproject.entities.Complaint;
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
	 
}
