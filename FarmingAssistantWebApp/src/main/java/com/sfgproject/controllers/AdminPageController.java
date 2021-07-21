package com.sfgproject.controllers;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/admin") 
public class AdminPageController {
	
	@RequestMapping( value = "/adminhome") 
	 public ModelAndView showHomePage() {
	 
		 ModelAndView model = new ModelAndView(); model.addObject("title","The Admin Home!!");
		 model.addObject("message", "Only Admins can see this :D!");
		 model.setViewName("adminHome"); 
		 
		 return model; 
	 }
	
	 @RequestMapping(value = "/403", method = RequestMethod.GET) public
	 ModelAndView accesssDenied() {
	 
	 ModelAndView model = new ModelAndView();
	 
	 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	 if (!(auth instanceof AnonymousAuthenticationToken)) { UserDetails userDetail
	 = (UserDetails) auth.getPrincipal(); model.addObject("username",
	 userDetail.getUsername()); }
	 
	 model.setViewName("403"); return model;
	 
	 }
	 

}
