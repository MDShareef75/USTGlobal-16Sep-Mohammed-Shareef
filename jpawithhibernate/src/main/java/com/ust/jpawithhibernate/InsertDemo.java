package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernate.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
		
		Product productInfo = new Product();
		productInfo.setPid(101);
		productInfo.setPname("bag");
		productInfo.setQuantity(20);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productInfo);
		System.out.println("Record Saved");
		entityTransaction.commit();//if commit is not used then it will not store the data permanently
		entityManager.close();
	}
}
