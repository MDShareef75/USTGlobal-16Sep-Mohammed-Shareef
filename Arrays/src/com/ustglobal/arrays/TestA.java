package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println(num[i]);  
		}
		
		System.out.println("*************************");
		
		for(int nums : num) {
			System.out.println(nums);
		}
		
		System.out.println("*************************");
		
		char[] ch = {'a','b','c','d'};
		
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("*************************");
		
		for(int c : ch) {
			System.out.println(c);
		}
		
		System.out.println("*************************");
		
		boolean[] b = {true,false,true,false,true,true};
		for(int i = 0 ; i < b.length ; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("*************************");
		
		byte[] c = {1,2,3,4,5};
		for(int i = 0 ; i < c.length ; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("*************************");
		
		double[] d = {1.2,3.4,5.3,6.5};
		for(int i = 0 ; i < d.length ; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("*************************");
		
		String[] names = {"shareef","faizan","lochan","amith"};
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("*************************");
		
		for(String i  : names) {
			System.out.println(i);	
		}
	}
}
