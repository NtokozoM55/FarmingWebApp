package com.sfgproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sfgproject.entities.Complaint;
//import com.sfgproject.services.ComplaintService;

@Controller
@RequestMapping(value = "/farmer/complaint")
public class ComplaintController {

	@RequestMapping("")
	public String showComplaintForm(){
			return "complaintpage";
		}
	
}