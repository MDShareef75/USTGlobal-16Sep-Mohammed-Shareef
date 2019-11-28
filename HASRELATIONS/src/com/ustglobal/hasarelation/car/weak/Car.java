package com.ustglobal.hasarelation.car.weak;

public class Car {

	String cname = "Nanorghini";
	
	Music m = new Music();
	
	public void drive() {
		System.out.println("I am driving Nanorghini");
	}
	
	public void listen() {
		System.out.println("Listening to song");
	}
}
