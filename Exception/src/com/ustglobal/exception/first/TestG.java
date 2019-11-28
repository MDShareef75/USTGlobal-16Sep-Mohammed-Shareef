package com.ustglobal.exception.first;

public class TestG {

	public static void main(String[] args) {
		System.out.println("Main Start");

		PayTM p = new PayTM();
		try {
			p.book();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception caught in Main method");
		}finally {
			System.out.println("Executing finally");
		}
		System.out.println("Main End");
	}
}
