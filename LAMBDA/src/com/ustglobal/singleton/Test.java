package com.ustglobal.singleton;

public class Test {

	public static void main(String[] args) {

		MySingleton m = MySingleton.getDBConnection();
		m.s = "Hello";
		System.out.println("HashCode of m "+m.hashCode());
		
		MySingleton mx = MySingleton.getDBConnection();
		mx.s = "Hi";
		System.out.println("HashCode of mx "+mx.hashCode());
		
		System.out.println(m.s);
		System.out.println(mx.s);
	}		
}
