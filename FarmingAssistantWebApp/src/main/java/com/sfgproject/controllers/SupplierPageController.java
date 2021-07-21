package com.sfgproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/supplier")
public class SupplierPageController {

	@RequestMapping( value = "/supplierhome") 
	 public ModelAndView showHomePage() {
	 
		 ModelAndView model = new ModelAndView(); 
		 model.setViewName("supplierHome"); 
		 
		 return model; 
	 }
}
