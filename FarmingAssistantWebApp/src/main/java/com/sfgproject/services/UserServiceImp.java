//package com.sfgproject.services;
//
//import com.sfgproject.Dto.UserRegistrationDto;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.sfgproject.entities.User;
//import com.sfgproject.repositories.UserRepository;
//
//
//@Service
//public class UserServiceImp implements UserService {
//
//	private UserRepository userRepository;
//	
//	
//	
//	public UserServiceImp(UserRepository userRepository) {
//		super();
//		this.userRepository = userRepository;
//	}
//
//
//
//	@Override
//	public User save(UserRegistrationDto registrationDto) {
//		
//		/*
//		 * BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); String
//		 * encodedPassword = passwordEncoder.encode(registrationDto.getPassword());
//		 */
//		
//		User user =  new User(registrationDto.getUsername(), registrationDto.getLastname(), registrationDto.getFirstname(),
//						registrationDto.getPhonenumber(),registrationDto.getAddress() , registrationDto.getPassword(),
//						registrationDto.getRole());
//						
//		return userRepository.save(user);
//
//			
//	}
//
//}
