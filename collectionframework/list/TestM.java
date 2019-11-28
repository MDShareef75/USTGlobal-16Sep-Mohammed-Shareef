package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("shareef");
		al.add("amith");
		al.add("faizan");
		al.add("lochan");
		
		System.out.println("Before sort-----> "+al);
		Collections.sort(al);
		System.out.println("After sort------> "+al);
	}
}
