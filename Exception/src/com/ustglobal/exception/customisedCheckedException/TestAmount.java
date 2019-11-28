package com.ustglobal.exception.customisedCheckedException;

public class TestAmount {

	public static void main(String[] args) {
		System.out.println("Main start");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(50000);
			System.out.println("Withdraw your cash");
		} catch (InvalidAmountException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main End");
	}
}
