package com.ustglobal.beanObject.bean;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Scanner class");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age...");
		int age = s.nextInt();
		
//		System.out.println("Enter name...");
//		String name = s.next();
		
		System.out.println("Enter name1...");
		String name1 = s.nextLine();
		
		//System.out.println("Age is : "+age);
		//System.out.println("Name is : "+name);
		//System.out.println("Name1 is : "+name1);
	}
}
