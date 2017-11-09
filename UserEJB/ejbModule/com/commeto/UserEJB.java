package com.commeto;

import javax.ejb.*;
import javax.persistence.*;

@Stateless
public class UserEJB {

	@PersistenceContext(unitName = "useCase1")
	private EntityManager em;
	
	
}
