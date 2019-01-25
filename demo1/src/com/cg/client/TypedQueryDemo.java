package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Student;

public class TypedQueryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager sm=factory.createEntityManager();
		sm.getTransaction().begin();
		
		String qry="SELECT student from studentjee where student.studentage>=20 and student.studentage<=30 ";
		TypedQuery<Student> query=sm.createQuery(qry,Student.class);
		List list=query.getResultList();
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		sm.getTransaction().commit();
		sm.close();
		factory.close();

	}

}
