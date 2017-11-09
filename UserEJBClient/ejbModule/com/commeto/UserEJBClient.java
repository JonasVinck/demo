package com.commeto;

import javax.ejb.*;

public class UserEJBClient {

	@Local
	public interface UserEJBClientLocal{
		
		public User getUser(String username);
		public User createUser(User user);
	}
}
