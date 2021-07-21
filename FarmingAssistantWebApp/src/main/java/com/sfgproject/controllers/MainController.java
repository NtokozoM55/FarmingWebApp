package com.sfgproject.controllers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sfgproject.entities.Role;
import com.sfgproject.entities.User;
import com.sfgproject.repositories.RoleRepository;
import com.sfgproject.repositories.UserRepository;
import com.sfgproject.services.UserService;

@Controller
public class MainController {
	
	
	@Autowired
	private UserRepository  userRepository;
	
	@Autowired
	private RoleRepository  roleRepository;
	
	
	@GetMapping("")
	public String showWelcomePage() {
		
		return "welcome";
	}
	
	@GetMapping("/farmerregister")
	public String farmerRegForm(Model model){
		
		User user =  new User();
		model.addAttribute("user",user);
		
		return "farmerRegForm";
		
	}
	
	
	@RequestMapping(value = "/farmerregister", method = RequestMethod.POST)
	public String famrerRegister(@ModelAttribute("user") User user) {	
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String encodedPassword = passwordEncoder.encode(user.getPassword());
//		user.setPassword(encodedPassword);
		
		Role role = roleRepository.findById(2);
		Set<Role> roles = new HashSet<>();
		roles.add(role);
		user.setRoles(roles);
		
		user.setEnabled(true);
		userRepository.save(user);
	
	return "successfulReg";

	
	}
	
	@GetMapping("/supplierregister")
	public String supplierRegForm(Model model){
		
		User user =  new User();
		model.addAttribute("user",user);
		
		
		return "supplierRegForm";
		
	}
	
	
	@RequestMapping(value = "/supplierregister", method = RequestMethod.POST)
	public String supplierRegister(@ModelAttribute("user") User user) {	
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String encodedPassword = passwordEncoder.encode(user.getPassword());
//		user.setPassword(encodedPassword);
		
		Role role = roleRepository.findById(3);
		Set<Role> roles = new HashSet<>();
		roles.add(role);
		user.setRoles(roles);
	    
		user.setEnabled(true);
	
		userRepository.save(user);
	
	return "successfulReg";

	
	}
}
