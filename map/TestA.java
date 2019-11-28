package com.ustglobal.map;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(" kuku ", 98787987);
		hm.put(" raju ", 86897887);
		hm.put(" arun ", 99835747);
//		hm.put(null, 8765743);
//		hm.put(null, 6443743);
//		
		System.out.println("Data "+hm);
		
//		hm.put(" raju ", 98866796);
//		System.out.println("After same key "+hm);
//		
		hm.put(" varu ", 86897887);
		System.out.println("After same value "+hm);
		
		System.out.println("**********************");
		
		System.out.println("After null "+hm);
		
		System.out.println("**********************");
		
		System.out.println("After adding duplicate null");
		System.out.println(hm);
		
		System.out.println("**********************");
		
		Object phoneno = hm.get("kuku");
		System.out.println("value "+phoneno);
		
		System.out.println("**********************");
		
		Object phoneno1 = hm.get("she");
		System.out.println("value "+phoneno1);
		
		System.out.println("**********************");
		
		Object value = hm.remove("raju");
		System.out.println("value "+value);

		System.out.println("**********************");
		
		System.out.println("After removing "+hm);
	}
}
