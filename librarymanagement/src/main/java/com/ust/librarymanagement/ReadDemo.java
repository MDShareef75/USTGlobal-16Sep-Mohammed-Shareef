package com.ust.librarymanagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ust.librarymanagement.dto.Books;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Books BooksDetail = entityManager.find(Books.class,101);
		System.out.println(BooksDetail.getBid());
		System.out.println(BooksDetail.getBname());
		System.out.println(BooksDetail.getBprice());
	}
}
