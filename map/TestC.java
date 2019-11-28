package com.ustglobal.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("Bangalore", 560068);
		lhm.put("Hariyana", 134203);
		lhm.put("Patna", 880000);
		
		System.out.println(lhm);
		
		Set<String> s = lhm.keySet();//returns set
		for (String key : s) {
			System.out.println("key :"+key);
		}
		
		System.out.println("***************************");
		
		Collection<Integer> c = lhm.values();
		
		for (Integer value : c) {
			System.out.println("value :"+value);
		}
		
	}
}
