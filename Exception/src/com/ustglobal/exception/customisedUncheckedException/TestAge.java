package com.ustglobal.exception.customisedUncheckedException;

public class TestAge {

	public static void main(String[] args) {

		System.out.println("Main Started");

		Validator v = new Validator();
		try{
			v.verify(20);
		}catch(InvalidAgeException a) {
			System.out.println("Exception occured");
		}

		v.verify(12);
		System.out.println("Main Ended");
	}
}
