package com.ustglobal.arrays;

public class TestB {

	public static void main(String[] args) {
		 int[] num = {10,20,30,50};
//		 System.out.println(num[10]);//arrayIndexOutOfBoundException
		 
		 receive(num);
		 
		 System.out.println("*****************************");
			
		 int[] values = getArray();
		 for(int val : values) {
			 System.out.println(val);
		 }
		 
		 System.out.println("*****************************");
		 
		 String[] value1 = getArray1();
		 for(String val1 : value1) {
			 System.out.println(val1);
		 }
		 
	}
	
	static void receive(int[] num) {
		for(int num1 : num) {
			System.out.println(num1);
		}
	}
	
	static int[] getArray() {
		int[] values = { 10 , 30 , 40 , 50 };
		return values;
	}
	
	static String[] getArray1() {
		String[] values = {"lochan","faizan","shareef","amith"};
		return values;
	}
}
