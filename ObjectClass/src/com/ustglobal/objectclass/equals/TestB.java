package com.ustglobal.objectclass.equals;

public class TestB {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "faizan", 30000);
		
		Employee e2 = new Employee(200, "lochan", 40000);
		
		Employee e3 = new Employee(300, "shareef", 50000);
		
		Employee e4 = e3;
		
		boolean isEqual = e1.equals(e2);
		
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		
		System.out.println(isEqual);
	}
}
