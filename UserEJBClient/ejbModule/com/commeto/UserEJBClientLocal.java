package com.commeto;

import javax.ejb.*;

import exceptions.UsernameAlreadyExistsException;

@Local
public interface UserEJBClientLocal{
	
	public User getUser(String username);
	public User createUser(User user) throws UsernameAlreadyExistsException;
}
