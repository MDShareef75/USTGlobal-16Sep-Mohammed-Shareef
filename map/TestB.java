package com.ustglobal.map;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("kuku", 98787987);
		hm.put("raju", 86897887);
		hm.put("arun", 99835747);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 95464357);
		hm1.put("riya", 86456687);
		hm1.put("kruthi", 43534347);
		
		boolean hasKey = hm.containsKey("kuku");
		System.out.println("Has key "+hasKey);
		
		System.out.println("***************************");
		
		boolean hasValue = hm.containsValue("43534347");
		System.out.println("Has value "+hasValue);
		
		hm.putAll(hm1);//to copy one hashmap to another hashmap
		
		System.out.println("After putAll() "+hm);
		
		System.out.println("***************************");
		
		System.out.println(hm.size());//no index for hashmap
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("is Map Empty :"+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
		
		
	}
}
