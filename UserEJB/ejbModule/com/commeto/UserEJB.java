package com.commeto;

import javax.ejb.*;
import javax.persistence.*;

import org.eclipse.persistence.exceptions.i18n.QueryExceptionResource;

import exceptions.UsernameAlreadyExistsException;

@Stateless
public class UserEJB {

	@PersistenceContext(unitName = "useCase1")
	private EntityManager em;

	public User getUSer(String userName) {
		
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
	
	public User createUser(User user) throws UsernameAlreadyExistsException{
		
		if(getUSer(user.getUsername) == null){
			
			/*
			 * if no user found, persist user
			 */
			em.persist(user);
		} else{
			throw new UsernameAlreadyExistsException("The username is already taken");
		}
		
		return user;
	}
}
