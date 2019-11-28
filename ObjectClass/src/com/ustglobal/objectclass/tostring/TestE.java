package com.ustglobal.objectclass.tostring;

public class TestE {

	public static void main(String[] args) {
		
		Car c = new Car(1000000, "Audi", "Matte Black");
		int cc = c.hashCode();
		System.out.println("overriden hashCode() "+cc);
		System.out.println("overriden toString() "+c);
		
		Car c1 = new Car(2000000, "Nanorghini", "Matte Red");
		int cc1 = c1.hashCode();
		System.out.println("overriden hashCode() "+cc1);
		System.out.println("overriden toString() "+c1);

		Car c2 = new Car(3000000, "Mercedes", "Matte white");
		int cc2 = c2.hashCode();
		System.out.println("overriden hashCode() "+cc2);
		System.out.println("overriden toString() "+c2);
	}
}
