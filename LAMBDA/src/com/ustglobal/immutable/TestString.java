package com.ustglobal.immutable;

public class TestString {

	public static void main(String[] args) {
		
		MyString ms = new MyString(12 , "shareef");
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		
		ms.changeContent(20, "lochan");
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		
	}
}
