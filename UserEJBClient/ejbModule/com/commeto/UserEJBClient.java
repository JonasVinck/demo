package com.commeto;

import javax.ejb.*;
	@Local
	public interface UserEJBClient{
		
		public User getUser(String username);
		public void createUser(User user);
	}