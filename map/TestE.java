package com.ustglobal.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
	
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("Patna ", 880000);
		tm.put("Hariyana ", 134203);
		tm.put("Bangalore ", 560068);
		
		//tm.put(null, 7848347);//nullpointer exception
		
		for (Map.Entry<String, Integer> m : tm.entrySet()) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			
			System.out.println("Key is   :"+key);
			System.out.println("Value is :"+value);
			
			System.out.println("**********************");
		}
	}
}
