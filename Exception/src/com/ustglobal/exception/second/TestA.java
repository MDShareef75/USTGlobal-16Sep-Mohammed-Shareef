package com.ustglobal.exception.second;

public class TestA {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		
		try {
			Thread.sleep(3000);//sleep throws interrupted exception so we have to write this inside try catch
			System.out.println("Inside try");
		}catch(InterruptedException ie) {
			System.out.println("Exception caught");
			ie.printStackTrace();
		}
		
		System.out.println("Main End");
	}
}
