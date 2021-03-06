package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		li.add(12);
		li.add(35.56);
		li.add("shareef");
		li.add(true);
		li.add(null);
		
		System.out.println("***using for loop***");
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("***using for each***");
		
		for (Object object : li) {
			System.out.println(object);
		}
		
		System.out.println("***using iterator***");
		
		Iterator it = li.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("***using list iterator***");
		
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("***list iterator backward***");
		
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
	
	}
}
