package jsfcontroller;


import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.ejb.EJB;

import com.commeto.User;
import com.commeto.UserEJBClient.*;

@Named
@ViewScoped
public class UserController {
	
	@EJB
	private UserEJBClientLocal userEJB;
	@EJB
	private User user = new User();
	
	public String createUser(){
		user = userEJB.createUser(user);
		return null;
	}
}
