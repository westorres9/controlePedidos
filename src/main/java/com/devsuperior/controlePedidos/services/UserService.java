package com.devsuperior.controlePedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.controlePedidos.entities.User;
import com.devsuperior.controlePedidos.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
		
	}

}
