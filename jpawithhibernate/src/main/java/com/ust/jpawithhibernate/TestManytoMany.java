package com.ust.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernate.manytomany.Course;
import com.ust.jpawithhibernate.manytomany.Student;

public class TestManytoMany {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		Course course = new Course();
		course.setCid(10);
		course.setCname("core java");
		
		Course course1 = new Course();
		course1.setCid(20);
		course1.setCname("sql");
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course);
		courses.add(course1);
		
		Student student = new Student();
		student.setSid(1);
		student.setSname("Lochan");
		student.setCourses(courses);
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			System.out.println("Record Saved");
			
			entityManager.persist(student);
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
