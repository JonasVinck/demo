package com.commeto.ejbClient;

import javax.ejb.*;

import com.commeto.jpa.User;
	@Local
	public interface UserEJBClient{
		
		public User getUser(String username);
		public void createUser(User user);
	}