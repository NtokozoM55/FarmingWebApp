package com.sfgproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaints")
public class Complaint {
	
	@Id
	private Long complaintId;
	private String category;
	private String details;
	private String status;
	private Long farmerID;
	
	public Complaint() {
		}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getComplaintId()
	{
		return complaintId;
	}
	public void setComplaintId(Long complaintId) {
		this.complaintId = complaintId;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category =  category;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getFarmerID() {
		return farmerID;
	}

	public void setFarmerID(Long farmerID) {
		this.farmerID = farmerID;
	}
}
