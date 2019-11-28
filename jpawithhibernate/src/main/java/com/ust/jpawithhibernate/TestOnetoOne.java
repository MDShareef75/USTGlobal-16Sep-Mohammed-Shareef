package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernate.onetoone.Person;
import com.ust.jpawithhibernate.onetoone.VoterCard;

public class TestOnetoOne {

	public static void main(String[] args) {
		
		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("Shareef");
		
		Person person = new Person();
		person.setPid(1);
		person.setName("Shareef");
		person.setVoterCard(vc);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			VoterCard  vCard = entityManager.find(VoterCard.class, 10);
			System.out.println(vCard.getPerson().getName());
			//entityManager.persist(person); //for unidirectional
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
