package com.sprint.model;

import java.util.Arrays;

public class SignUp {
	private String userName;
	private String password;
	private String[] roles;
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignUp(String userName, String password, String[] roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "SignUp [userName=" + userName + ", password=" + password + ", roles=" + Arrays.toString(roles) + "]";
	}
	
	
}