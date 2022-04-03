package com.cg.smm.repository;

import com.cg.smm.entities.User;


public class IUserRepository 
{
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(long id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
