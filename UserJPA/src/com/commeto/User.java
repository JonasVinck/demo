package com.commeto;

import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="user")
@SecondaryTable(name = "user_group", pkJoinColumns=@PrimaryKeyJoinColumn(name="username", referencedColumnName="username"))
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
//	@Column(table="user_group", name="idGroup", nullable=false)
//	private String group;
	
	/*
	 * Constructors
	 */
	public User(String username, String password, String email, String firstName, String lastName){
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User(User user){
		this.username = user.username;
		this.password = user.password;
		this.email = user.email;
		this.firstName = user.firstName;
		this.lastName = user.lastName;
	}
	
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
//	public String getGroup(){
//		return this.group;
//	}
//	public void setGroup(String group){
//		this.group = group;
//	}
}
