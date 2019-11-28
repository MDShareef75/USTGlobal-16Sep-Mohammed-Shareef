package com.ust.librarymanagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.librarymanagement.dto.Books;

public class InsertDemo {

	public static void main(String[] args) {
		
		Books BooksInfo = new Books();
		BooksInfo.setBid(102);
		BooksInfo.setBname("Physics");
		BooksInfo.setBprice(200);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(BooksInfo);
		System.out.println("Record Saved");
		entityTransaction.commit();//if commit is not used then it will not store the data permanently
		entityManager.close();
	}
}
