package com.ustglobal.typecasting.primitive;

public class TestA {

	public static void main(String[] args) {
		
		byte a = 10;
		int b = a;  //Implicit Casting
		System.out.println("b is "+b);
		
		int p = 20;
		double q = p;//Implicit Casting
		System.out.println("q is "+q);
		
		System.out.println("========================");
		
		double x = 20.16;
		int y = (int) x;//Explicit Casting
		System.out.println("y is "+y);

		byte z = (byte) x;//Explicit Casting
		System.out.println("z is "+z);
		
		char r = (char) x;//Explicit Casting
		System.out.println("r is "+r);
	}
}
