package com.niit.collaborate.service;

import com.niit.collaborate.model.User;

public interface UserService 
{
	boolean registerUser(User user);
	boolean isUsernameValid(String username);
	boolean isEmailValid(String email);
	User login(User user);
	void update(User user);
	User getUserByUsername(String username);
}
