package com.cg.smm.service;

//import com.cg.smms.entities.Shop;
import com.cg.smm.entities.User;

public interface IAdminService {
	//public boolean approveNewShop(Shop shop);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}