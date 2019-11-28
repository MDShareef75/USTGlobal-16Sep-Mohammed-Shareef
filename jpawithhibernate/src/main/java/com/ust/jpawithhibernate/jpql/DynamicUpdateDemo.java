package com.ust.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateDemo {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			
			String jpql = "update Product set pname=:name where id=:id ";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("name", "Book");
			query.setParameter("id", 102);
			int res = query.executeUpdate();
			System.out.println(res+" row updated");
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}
		
	}
}
