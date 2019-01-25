package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class NamedQueryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		TypedQuery<Person> query=manager.createNamedQuery("getById", Person.class);
		Person obj=query.getSingleResult();
		System.out.println(obj);
		TypedQuery<Person> query1=manager.createNamedQuery("getAll", Person.class);
	    List<Person> list=query1.getResultList();
	    for (Person person : list) {
			System.out.println(person);
		}
		
	    manager.getTransaction().commit();
	}

}

