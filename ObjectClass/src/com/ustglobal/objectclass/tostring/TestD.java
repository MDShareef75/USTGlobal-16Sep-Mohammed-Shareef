package com.ustglobal.objectclass.tostring;

public class TestD {

	public static void main(String[] args) {
		Student s = new Student(10, "shareef", 75.43);
		int sCode = s.hashCode();
		
		
		System.out.println("Overriden HashCode() :"+sCode);
		System.out.println("Overriden toString() :"+s);
	}
}
