package com.sprint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.IUserRepository;
import com.sprint.entities.Users;

@Service(value = "IUserService")
public class IUserServiceImpl implements IUserService {
	@Autowired
	IUserRepository repository;

	// ADD NEW USER
	@Override
	public Users addNewUser(Users user) {
		return repository.save(user);
	}

	// USER SIGN IN
	@Override
	public Users signIn(Users user) {
		return null;
	}

	// USER SIGN OUT
	@Override
	public Users signOut(Users user) {
		return null;
	}

}