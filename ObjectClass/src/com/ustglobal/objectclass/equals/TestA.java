package com.ustglobal.objectclass.equals;

public class TestA {

	public static void main(String[] args) {
		
		Cow c1 = new Cow(100, "gowri", 30000);
		
		Cow c2 = new Cow(200, "Momo", 40000);
		
		Cow c3 = new Cow(300, "yoyo", 50000);
		
		Cow c4 = c3;
		
		boolean isEqual = c1.equals(c2);
		
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
		
		System.out.println(isEqual);
	}
}
