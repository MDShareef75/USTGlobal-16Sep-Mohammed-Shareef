package com.ustglobal.map;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(101, "ajay");
		ht.put(502, "vijay");
		ht.put(20, "sonu");
		ht.put(99, "monu");
		ht.put(101, "sriram");//replaces 101
		ht.put(203, "ax");
		//ht.put(null, "john");//null pointer exception
		//ht.put(108, null);//null pointer exception
		
		System.out.println("Data "+ht);
		
	}
}
