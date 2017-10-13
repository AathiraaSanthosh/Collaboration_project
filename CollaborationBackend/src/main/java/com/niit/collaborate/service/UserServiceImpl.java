package com.niit.collaborate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.UserDAO;
import com.niit.collaborate.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public boolean registerUser(User user) {
		
		return userDAO.registerUser(user);
	}

	public boolean isUsernameValid(String username) {
	
		return userDAO.isUsernameValid(username);
	}

	public boolean isEmailValid(String email) {

		return userDAO.isEmailValid(email);
	}

	public User login(User user) {
		return userDAO.login(user);
	}

	public void update(User user) {
		userDAO.update(user);
		
	}

	public User getUserByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}
	
	
}
