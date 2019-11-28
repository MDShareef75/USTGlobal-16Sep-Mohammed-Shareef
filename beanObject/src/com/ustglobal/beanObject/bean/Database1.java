package com.ustglobal.beanObject.bean;

public class Database1 {

	void receive(Employee e) {
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("dept no is "+e.getDept());
		System.out.println("desigantion is "+e.getDesignation());
		
		System.out.println("************************");
	}
	
	void save(Employee e) {
		System.out.println("--------------This is DATABSE--------------");
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Dept no is "+e.getDept());
		System.out.println("Desigantion is "+e.getDesignation());
	}
}
