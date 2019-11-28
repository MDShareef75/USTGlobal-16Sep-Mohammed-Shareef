package com.ustglobal.exception.customisedUncheckedException;

public class Validator {

	void verify(int age) {
		if(age < 18) {
			throw new InvalidAgeException("above 18");
		}
	}
}
