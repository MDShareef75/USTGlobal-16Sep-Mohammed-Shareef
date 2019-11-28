package com.ustglobal.exception.first;

public class TestB {

	public static void main(String[] args) {
		System.out.println("start");
		
		int a = 10;
		int b = 0;
		
		try {
			b = 10/2;
			b = 10/0;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Happy");
		}catch(ArithmeticException e) {
			System.out.println("Number is divided by zero");
		}
		
		System.out.println(b);
		
		System.out.println("End");
	}
}
