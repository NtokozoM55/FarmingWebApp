package com.sfgproject.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.sfgproject.entities.*;
//import com.sfgproject.services.ComplaintService;
import com.sfgproject.services.UserService;

@Controller
@RequestMapping(value = "/farmer")
public class FarmerPageController {
	@Autowired
	UserService user_service;
	
	@RequestMapping("")
	public String viewDashboardPage(Model model, @Param("keyword") String keyword) {
		List<User> listUsers = user_service.listAll(keyword);
		model.addAttribute("listUsers", listUsers);
		model.addAttribute("keyword", keyword);
		
		return "homepage";
	}
	
	@RequestMapping("/findfarmers")
	public String findFarmersPage(Model model, @Param("keyword") String keyword) {
		List<User> listUsers = user_service.listAll(keyword);
		model.addAttribute("listUsers", listUsers);
		model.addAttribute("keyword", keyword);
		
		return "findFarmers";
	}
	
	@RequestMapping("/findsuppliers")
	public String findSuppliersPage(Model model, @Param("keyword") String keyword) {
		List<User> listUsers = user_service.listAll(keyword);
		model.addAttribute("listUsers", listUsers);
		model.addAttribute("keyword", keyword);
		
		return "findSuppliers";
	}

		

}
