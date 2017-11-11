package com.commeto;

import javax.ejb.*;
import javax.persistence.*;

import org.eclipse.persistence.exceptions.i18n.QueryExceptionResource;

import exceptions.UsernameAlreadyExistsException;

@Stateless
public class UserEJB  implements UserEJBClient{

	@PersistenceContext(unitName = "useCase1")
	private EntityManager em;

	public User getUser(String userName) {
		
		User entity = null;
		
		try{
			Query query = em.createQuery("SELECT u FROM user u WHERE u.username = ?1");
			query.setParameter(1, userName);
			entity = (User) query.getSingleResult();
		} catch (NoResultException e) {
			/*
			 * if no user found, return null
			 */
		}
		
		return entity;
		
	}
	
	public void createUser(User user){
		
		if(getUser(user.getUsername()) == null){
			System.out.println("EJB maakt nieuwe user aan");
			System.out.println(user.getUsername());
			/*
			 * if no user found, persist user
			 */
			em.persist(user);
		} else{
			System.out.println("User bestaat al");
		}
	}
}
