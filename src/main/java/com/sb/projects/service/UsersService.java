package com.sb.projects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.projects.model.Users;
import com.sb.projects.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}
	
	public List<Users> addUser(Users user) {
		usersRepository.save(user);
		return getAllUsers();
	}

}
