package com.sfgproject.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.sfgproject.entities.*;
import com.sfgproject.repositories.ComplaintRepository;
import com.sfgproject.services.TheUserDetails;
import com.sfgproject.services.UserDetailsServiceImpl;


@Controller
@RequestMapping(value = "/farmer")
public class FarmerPageController {
	
	UserDetailsServiceImpl user_service;
	
	
	TheUserDetails userDetails;
	
	
	@Autowired
	private ComplaintRepository complaintrepository;
	
	
		
	@RequestMapping( value = "/farmerhome") 
	public ModelAndView showHomePage() {
		 
		 ModelAndView model = new ModelAndView(); 
		 model.setViewName("farmerHome"); 
		 
		 return model; 
	}
	@RequestMapping("/findfarmers")
	public String findFarmersPage(Model model, @Param("keyword") String keyword) {
//		List<User> listFarmers = user_service.listAll(keyword);
//		model.addAttribute("listFarmers", listFarmers);
//		model.addAttribute("keyword", keyword);
		
		return "findFarmers";
	}
	
	@RequestMapping("/findsuppliers")
	public String findSuppliersPage(Model model, @Param("keyword") String keyword) {
//		List<User> listUsers = user_service.listAll(keyword);
//		model.addAttribute("listUsers", listUsers);
//		model.addAttribute("keyword", keyword);
		
		return "findSuppliers";
	}

	@RequestMapping(value = "/complaint", method = RequestMethod.GET)
	public String showComplaintForm(Model model){
		
		Complaint complaint = new Complaint();
		model.addAttribute("complaint", complaint);
		return "complaintform";
	}
	
	@RequestMapping(value = "/submitcomplaint", method = RequestMethod.POST)
	public String submitComplaint(@ModelAttribute("complaint") Complaint complaint, Authentication auth){
		
		
		complaint.setFarmerID(userDetails.getUser_id());
		complaintrepository.save(complaint);
		
		return "complaintSent";
	}
	
	
		
}
