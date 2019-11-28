package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {

	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<Double>();
		
		a1.add(34.5);
		a1.add(53.3);
		a1.add(76.9);
		a1.add(87.2);
		a1.add(34.5);//list allows duplicates
		a1.add(null);
		a1.add(null);//list allows multiple null values
		
		System.out.println(a1);
		
		a1.add(2, 54.6);
		System.out.println("after add in 2nd index "+a1);
		a1.remove(0);
		System.out.println("after removing 0th index element "+a1);
		a1.remove(null);
		System.out.println("after removing null "+a1);
		Double val = a1.get(4);
		System.out.println("Object at 4th index "+val);
		a1.set(2, 77.7);
		System.out.println("after replacing 2nd index "+a1);
		a1.clear();
		System.out.println("after clear merthod "+a1);
		a1.contains(54.9);
		System.out.println(a1);
		
		List<Double> l1 = new ArrayList<Double>();
		l1.add(12.3);
		l1.add(23.4);
		l1.add(56.5);
		
		a1.addAll(l1);
		System.out.println("after add ll "+a1);
		
		boolean contain = a1.containsAll(l1);
		System.out.println("contains all of l1 "+contain);
		
		System.out.println("before removing "+a1);
		boolean res = a1.removeAll(l1);
		System.out.println("after removing all of l1 "+res);
		System.out.println("after removing "+a1);
		
	}
}
