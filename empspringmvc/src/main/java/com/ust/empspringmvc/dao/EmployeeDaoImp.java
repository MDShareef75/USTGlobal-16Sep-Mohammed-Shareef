package com.ust.empspringmvc.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ust.empspringmvc.dto.EmployeeBean;

//to create bean
@Repository //we can also use @Component
public class EmployeeDaoImp implements EmployeeDao{

	@PersistenceUnit //it works like @autowired
	private EntityManagerFactory factory;

	@Override
	public EmployeeBean login(int id, String password) {

		/*
		 * EntityManager manager = factory.createEntityManager(); EntityTransaction
		 * transaction = manager.getTransaction(); transaction.begin(); try {
		 * EmployeeBean bean = manager.find(EmployeeBean.class, id); if(bean!=null) {
		 * if(bean.getPassword().equals(password)) { return bean; }else { return null; }
		 * } } catch (Exception e) { e.printStackTrace(); return null; } return null;
		 */

		String jpql = "from EmployeeBean where id=:id and password=:password";

		EntityManager manager = factory.createEntityManager();

		TypedQuery<EmployeeBean> query = manager.createQuery(jpql, EmployeeBean.class);

		query.setParameter("id", id);
		query.setParameter("password", password);

		try {

			EmployeeBean bean = query.getSingleResult();
			return bean;

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}

	@Override
	public int register(EmployeeBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		try {

			manager.persist(bean);
			transaction.commit();
			return bean.getId();

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		try {
			EmployeeBean bean = manager.find(EmployeeBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			EmployeeBean bean = manager.find(EmployeeBean.class, id);
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		EmployeeBean employeeBean = manager.find(EmployeeBean.class, bean.getId());

		employeeBean.setName(bean.getName());
		employeeBean.setGender(bean.getGender());
		employeeBean.setPassword(bean.getPassword());
		employeeBean.setDoj(bean.getDoj());
		transaction.commit();
		return true;

	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;

	}
}
