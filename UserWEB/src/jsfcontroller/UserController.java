package jsfcontroller;


import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.ejb.EJB;

import com.commeto.ejbClient.UserEJBClient;
import com.commeto.jpa.User;

@Named
@ViewScoped
public class UserController {
	
	@EJB
	private UserEJBClient userEJB;
	@EJB
	private User user = new User();
	
	public void createUser(){
		userEJB.createUser(user);
		System.out.println("Backbean roept EJB op");
	}
}
