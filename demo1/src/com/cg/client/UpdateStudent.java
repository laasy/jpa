package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Student;

public class UpdateStudent {
	public static void main(String args[])
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager sm=factory.createEntityManager();
		sm.getTransaction().begin();
		
		Student obj=sm.find(Student.class, 2);
		System.out.println("Original="+obj);
		
		obj.setStudentName(obj.getStudentName()+" hello");
		sm.merge(obj);
		sm.getTransaction().commit();
		sm.close();
		System.out.println("Updated");
		factory.close();
		
		
		
	}
}
