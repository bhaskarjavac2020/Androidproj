package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserType;
import com.example.repo.UserTypeRepo;

@Service
public class UserTypeService {

	@Autowired
	private UserTypeRepo userTypeRepo;

	public UserType saveUserType(UserType userType) {
		return userTypeRepo.save(userType);
	}
}
