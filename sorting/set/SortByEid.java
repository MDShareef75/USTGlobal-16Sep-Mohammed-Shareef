package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SortByEid {

	public static void main(String[] args) {
		Comparator<Employee1> comp = (e1,e2) -> {//using lambda expression
			if(e1.id>e2.id) {
				return 1;
			}else if(e1.id<e2.id) {
				return -1;
			}else {
				return 0;
			}
		};
		
		TreeSet<Employee1> ts = new TreeSet<Employee1>(comp);
		
		Employee1 e1 = new Employee1(4, "shareef", 5.6);
		Employee1 e2 = new Employee1(5, "lochan", 5.7);
		Employee1 e3 = new Employee1(6, "faizan", 5.4);
		Employee1 e4 = new Employee1(7, "amith", 5.0);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("****using iterator****");
		Iterator<Employee1> it = ts.iterator();
		while(it.hasNext()) {
			Employee1 e = it.next();
			System.out.println("Name is   "+e.name);
			System.out.println("Id is     "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("**********************");
		}
	}
}
