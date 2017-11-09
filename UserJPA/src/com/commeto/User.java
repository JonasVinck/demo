package com.commeto;

import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="user")
@SecondaryTable(name = "Person_Group", pkJoinColumns=@PrimaryKeyJoinColumn(name="login", referencedColumnName="login"))
public class User {
	
	/*
	 * Attributes
	 */
	
	@Id
	@Column(name="username", nullable=false, length=16)
	private String username;
	@Column(name="password", nullable=false)
	private String password;
	@Column(name="email", nullable=false)
	private String email;
	@Column(name="fistName", nullable=false)
	private String firstName;
	@Column(name="lastName", nullable=false)
	private String lastName;
	
	/*
	 * Constructors
	 */
	
	
	
	/*
	 * Methods
	 */
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
