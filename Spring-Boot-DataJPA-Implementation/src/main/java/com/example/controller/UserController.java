package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.entity.UserType;
import com.example.services.UserService;
import com.example.services.UserTypeService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserTypeService userTypeService;

	@GetMapping("/users")
	public List<User> getUsers() {
		return null;

	}

	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable("userId") int userId) {
		User user = userService.getUserById(userId);

		return user;
	}

	@PostMapping("/saveUser")
	public void saveUser(@RequestBody User user) {
		UserType savedUserType = userTypeService.saveUserType(user.getUserType());
		User userSaved = userService.saveOrUpdate(user);
		savedUserType.toString();
		userSaved.toString();
	}

	@PostMapping("/updateUser")
	public void updateUser(@RequestBody User user) {
		User userSaved = userService.saveOrUpdate(user);
		userSaved.toString();
	}
}
