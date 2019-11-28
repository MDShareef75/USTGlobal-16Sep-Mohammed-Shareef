package com.ustglobal.beanObject.bean;

public class TestA {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(12);
		s.setName("Doraemon");
		s.setRollNo(123);
		
		Database db = new Database();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(111);
		e.setName("Lochan");
		e.setSalary(2000000000);
		e.setDept(10);
		e.setDesignation("Founder of Google");
		
		Database1 db1 = new Database1();
		db1.receive(e);
		db1.save(e);
		
	}
}
