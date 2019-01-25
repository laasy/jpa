package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Student;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		Student student = new Student();

		student.setStudentName("Laasya");
		student.setStudentAge(21);
		manager.persist(student);
		
		Student student1 = new Student();

		student1.setStudentName("john");
		student1.setStudentAge(21);
		manager.persist(student1);
		System.out.println("Added");
		manager.getTransaction().commit();

		manager.close();
		
		factory.close();
	}

}
