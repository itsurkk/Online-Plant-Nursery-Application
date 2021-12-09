package com.sprint.service;

import com.sprint.entities.Users;

public interface IUserService {
	public abstract Users addNewUser(Users user);

	public abstract Users signIn(Users user);

	public abstract Users signOut(Users user);

}