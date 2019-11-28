package com.ust.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jpawithhibernate.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
		//String jpql = "from Product";
		String jpql = "select pname from Product";
		
		Query query = entityManager.createQuery(jpql);
		//List<Product> list = query.getResultList();
		List<String> list = query.getResultList();
		for (String product : list) {
			//System.out.println(product.getPid());
			System.out.println(product);
			//System.out.println(product.getQuantity());
			System.out.println("*********************");
		}
		entityManager.close();
		
	}
}
