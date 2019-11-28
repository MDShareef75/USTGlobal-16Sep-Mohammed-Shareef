package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		
		//we should pass only generic types for sort
		//we should not pass null types
		System.out.println("before sort "+l);
		Collections.sort(l);//assending order//return type is void
		System.out.println("after sort "+l);
		
		Collections.reverse(l);//descending order//return type is void
		System.out.println("after reverse "+l);
		
		Collections.shuffle(l);//randomly shuffles
		System.out.println("after shuffle "+l);
		
	}
}
