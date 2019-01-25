package com.cg.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Student;

public class DynamicQueryDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		String qry="Select student from Student student where student.studentId=:id";
		TypedQuery<Student> query=manager.createQuery(qry, Student.class);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id to search");
		int sid=scanner.nextInt();
		
		query.setParameter("id",sid);		
		Student stu=query.getSingleResult();
		System.out.println(stu.getStudentName()+" "+stu.getStudentAge()+" ");
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		

	}

}
