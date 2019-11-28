package com.ustglobal.exception.customisedUncheckedException;

public class InvalidAgeException extends RuntimeException {

	String message = "Invalid age below l8 years not allowed";

	public InvalidAgeException() {

	}

	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}


}
