package com.sfgproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complaint {
	private Long complaintId;
	private String category;
	private String complaint_details;
	
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
	
	public String getComplDetails() {
		return complaint_details;
	}
	public void setComplDetails(String complaint_details) {
		this.complaint_details = complaint_details;
	}
}
