package com.commeto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	
}
