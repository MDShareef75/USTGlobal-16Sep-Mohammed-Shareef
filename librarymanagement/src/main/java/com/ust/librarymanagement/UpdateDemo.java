package com.ust.librarymanagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.librarymanagement.dto.Books;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");

			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Books Books = entityManager.find(Books.class, 101);
			Books.setBname("chemistry");

			System.out.println("Updated Record");

			entityTransaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
