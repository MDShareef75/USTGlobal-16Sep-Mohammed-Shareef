package com.ustglobal.exception.first;

public class TestF {
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
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception occured");
		}
		System.out.println("End");
	}
}
