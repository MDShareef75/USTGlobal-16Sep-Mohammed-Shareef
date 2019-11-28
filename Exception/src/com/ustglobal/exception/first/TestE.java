package com.ustglobal.exception.first;

public class TestE {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		String s = "hello";
		int[] a = {20,50,70,40};
		int b = 10;
		
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Number divided by zero");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
}
