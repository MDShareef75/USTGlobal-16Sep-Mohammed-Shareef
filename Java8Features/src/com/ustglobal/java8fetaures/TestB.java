package com.ustglobal.java8fetaures;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Predicate<Student> p = (s) -> {
			if(s.percentage >= 35) {
				return true;
			}else {
				return false;
			}
		};
		
		Student s = new Student(1, "vishal", 98.43);
		boolean res = p.test(s);
		System.out.println("Result "+res);
	}
}
