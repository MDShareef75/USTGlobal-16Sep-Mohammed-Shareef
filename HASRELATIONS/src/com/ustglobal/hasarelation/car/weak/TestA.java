package com.ustglobal.hasarelation.car.weak;

public class TestA {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.cname);
		
		c.drive();
		c.listen();
		
		System.out.println("******************");
		
		c.m.song();// has a relationship
	}
}
