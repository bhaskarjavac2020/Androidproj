package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public User saveOrUpdate(User user) {
		return userRepo.save(user);
	}

	public User getUserById(Integer userId) {
		return userRepo.findById(userId).get();
	}

	public List<User> getUsers() {
		return userRepo.findAll();
	}

}
