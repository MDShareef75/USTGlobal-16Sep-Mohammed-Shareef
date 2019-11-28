package com.ustglobal.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("Bangalore ", 560068);
		lhm.put("Hariyana ", 134203);
		lhm.put("Patna ", 880000);
		
		for(Map.Entry<String, Integer> m : lhm.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();	
			System.out.println("Key is "+key+"-----"+"Value is "+value);
			System.out.println("***************************************");
		}
		
		
	}
}
