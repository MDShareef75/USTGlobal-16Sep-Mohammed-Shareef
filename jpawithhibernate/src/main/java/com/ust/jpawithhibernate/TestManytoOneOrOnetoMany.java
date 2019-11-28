package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernate.onetomanyormanytoone.Pencil;
import com.ust.jpawithhibernate.onetomanyormanytoone.PencilBox;

public class TestManytoOneOrOnetoMany {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		PencilBox pb = new PencilBox();
		pb.setBId(1);
		pb.setBName("Apsara");
		
		Pencil p = new Pencil();
		p.setPid(10);
		p.setColor("black");
		p.setPencilBox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(11);
		p1.setColor("gray");
		p1.setPencilBox(pb);
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(p);
			entityManager.persist(p1);
			System.out.println("Record Saved");
			entityTransaction.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
				
		}
		
		entityManager.close();
	}
}
