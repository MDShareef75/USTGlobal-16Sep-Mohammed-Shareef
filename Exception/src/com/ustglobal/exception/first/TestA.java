package com.ustglobal.exception.first;

public class TestA {

	public static void main(String[] args) {
	
		System.out.println("Start");
		
		int[] a = {10,20,30};
		
		System.out.println(a[1]);
		
		try {
			System.out.println(a[2]);
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index not present");
		}
	
		System.out.println("End");
	}
}
