package com.ustglobal.exception.first;

public class TestD {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		int[] a = {20,50,70,40};
		int b = 10;
		
		try {
			
			System.out.println(a[5]);
			System.out.println(b/2);
		}catch(ArithmeticException e) {
			System.out.println("Number divided by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index not present");
		}
		
		System.out.println("End");
	}
}
