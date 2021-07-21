package com.sfgproject.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

//import com.sfgproject.Dto.UserRegistrationDto;
import com.sfgproject.entities.User;
import com.sfgproject.repositories.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}
	
	public void saveNewUser(User user) {
		
		userRepository.save(user);
	}
}
