package com.revature.daos;

import java.util.List;

import com.revature.models.User;

public interface UserDAOInterface 
{
	public void addUser(User newUser);
	
	public List<User> getAllUsers();
	
	public boolean isPresent(String username);
	
	public User getUserByUsername(String username);
}
