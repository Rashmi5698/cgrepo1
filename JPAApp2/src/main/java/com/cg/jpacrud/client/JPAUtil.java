package com.cg.jpacrud.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	static EntityManagerFactory entityManagerFactory;
	static EntityManager entityManager;
	public static  EntityManager getEntityManager() {
		 entityManagerFactory= Persistence.createEntityManagerFactory("abc");
		 entityManager =entityManagerFactory.createEntityManager();
	     return entityManager;
	}
	

}
