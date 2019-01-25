package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Student;

public class DeleteRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Student stu=manager.find(Student.class,1);
		manager.remove(stu);
		System.out.println("Deleted");
		manager.close();
		manager.getTransaction().commit();
		factory.close();
		
		
	}

}
