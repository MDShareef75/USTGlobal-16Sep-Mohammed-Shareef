package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		Student s1 = new Student(2, "stone", 39.09);
		Student s2 = new Student(94, "robert", 65.09);
		Student s3 = new Student(32, "johnny", 67.66);
		Student s4 = new Student(3, "will", 98.99);
		Student s5 = new Student(85, "jaden", 39.34);
		Student s6 = new Student(7, "holland", 43.06);
		Student s7 = new Student(8, "chris", 87.87);
		Student s8 = new Student(9, "giri", 32.98);
		Student s9 = new Student(12, "dinesh", 92.57);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("*****************************");
		}
		
	}
}
