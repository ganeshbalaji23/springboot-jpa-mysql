package com.sb.projects.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.projects.model.Users;
import com.sb.projects.service.UsersService;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="/all")
	public List<Users> getAllUsers() {
		return usersService.getAllUsers();
	}
	
	@RequestMapping(value="/new")
	public List<Users> addUser(@RequestBody final Users user) {
		return usersService.addUser(user);
	}

}
