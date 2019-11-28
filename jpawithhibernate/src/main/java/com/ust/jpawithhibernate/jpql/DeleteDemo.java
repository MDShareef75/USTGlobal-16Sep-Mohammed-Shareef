package com.ust.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {
	public static void main(String[] args) {

		EntityTransaction  entityTransaction = null;
		EntityManager entityManager = null;
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "delete from Product where id=101";
			Query query = entityManager.createQuery(jpql);
			int res = query.executeUpdate();
			System.out.println(res + " row deleted");
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
