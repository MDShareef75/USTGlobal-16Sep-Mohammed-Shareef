package com.ustglobal.exception.first;

public class PVR {
	void book() {
		System.out.println("Bookingg started");
		
		try {
			System.out.println(10/0);
			System.out.println("Logic for Booking");
			System.out.println("Booking Confirmed");
		}catch(ArithmeticException ae) {
			System.out.println("Booking Failed");
			throw ae;
		}
	}
}
