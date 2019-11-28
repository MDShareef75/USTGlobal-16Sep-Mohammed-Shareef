package com.ustglobal.exception.second;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		try(Scanner s = new Scanner(System.in);
				Scanner s2 = new Scanner(System.in)){
			System.out.println("Enter Age");
			int age = s.nextInt();
			
			System.out.println("Age"+age);
			System.out.println(age/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}finally {
			System.out.println("Finally executed");
		}
		
		System.out.println("**************************");
//		try {
//			
//		} this is invalid
		
		
	}
}
