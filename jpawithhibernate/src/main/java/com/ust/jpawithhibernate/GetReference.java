package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernate.dto.Product;

public class GetReference {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		entityManager = entityManagerFactory.createEntityManager();
		//Product product = entityManager.getReference(Product.class, 102);
		Product product = entityManager.find(Product.class, 102);
		System.out.println(product.getClass());
//		System.out.println(product.getPid());
//		System.out.println(product.getPname());
//		System.out.println(product.getQuantity());
		entityManager.close();

	}
}