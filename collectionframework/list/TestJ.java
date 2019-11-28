package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "shareef", 56.54);
		Student s2 = new Student(102, "lochan", 84.45);
		Student s3 = new Student(104, "faizan", 76.54);
		Student s4 = new Student(105, "amith", 86.54);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		}
		
		System.out.println("***using for each***");
		
		for (Student s : al) {
			System.out.println(s);
		}
	}
}
