package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernate.dto.Product;

public class Reattaching {

	public static void main(String[] args) {
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");

			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Product product = entityManager.find(Product.class, 102);
			System.out.println(entityManager.contains(product)); //return true
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));  //returns false when get dettached
			Product product2 = entityManager.merge(product);
			product2.setPname("watch");
			System.out.println("updated Record");
			entityManager.clear();//detach all the object present ins-ode the perisitance object
			entityTransaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
