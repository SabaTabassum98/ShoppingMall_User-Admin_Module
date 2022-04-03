package com.cg.smm.service;

import com.cg.smm.entities.User;
import com.cg.smm.repository.IUserRepository;
import com.cg.smm.repository.IUserRepositoryImpl;

public class IUserServiceImpl  implements IUserService {
	private IUserRepository repository;
	public IUserServiceImpl()
	{
		repository=new IUserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public User updateUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public User login(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public boolean logOut() {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return false;
	}

}
