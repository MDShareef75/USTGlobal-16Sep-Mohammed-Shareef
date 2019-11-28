package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ust.jpawithhibernate.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Product productDetail = entityManager.find(Product.class,101);
		System.out.println(productDetail.getPid());
		System.out.println(productDetail.getPname());
		System.out.println(productDetail.getQuantity());
	}
}
