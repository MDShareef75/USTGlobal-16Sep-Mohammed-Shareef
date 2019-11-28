package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		Employee s1 = new Employee(29, "stone", 39000.09);
		Employee s2 = new Employee(94, "robert", 65000.09);
		Employee s3 = new Employee(32, "johnny", 67000.66);
		Employee s4 = new Employee(33, "will", 98000.99);
		Employee s5 = new Employee(85, "jaden", 39000.34);
		Employee s6 = new Employee(70, "holland", 43000.06);
		Employee s7 = new Employee(87, "chris", 87000.87);
		Employee s8 = new Employee(96, "giri", 32000.98);
		Employee s9 = new Employee(72, "dinesh", 92000.57);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		
		hm.put("manager1", al);
		hm.put("manager2", al1);
		hm.put("manager3", al2);
		
		ArrayList<Employee> m = hm.get("manager3");
		
		Iterator<Employee> it = m.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("salary is "+s.salary);
			System.out.println("*****************************");
		}
		
	}
}
