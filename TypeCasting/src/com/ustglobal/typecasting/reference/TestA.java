package com.ustglobal.typecasting.reference;

public class TestA {

	public static void main(String[] args) {
		Pen p = new Marker(); //upcasting
		
		System.out.println(p.cost);
		p.write();
		
		
		//System.out.println(p.size); gives error
		//p.color();      gives error
		
		Marker m = (Marker) p; //Downcasting
		
		System.out.println(m.size);
		m.color();
		m.write();
	}
}
