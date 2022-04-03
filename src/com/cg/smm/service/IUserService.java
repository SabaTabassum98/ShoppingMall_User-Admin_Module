package com.cg.smm.service;

import com.cg.smm.entities.User;

public class IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
