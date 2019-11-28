package com.ustglobal.stringclass;

public class TestA {

	public static void main(String[] args) {
		
		String s1 = "aishu";
		String s2 = "deepika";
		
		String s3 = new String("aishu");
		String s4 = new String("aishu");
		String s5 = "aishu";
		
		System.out.println(s1.equals(s2));//compares s1 and s2 contents
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);//lower the case of s1 content
		
		String s7 = s1.toUpperCase();
		System.out.println(s7);//upper the case of s1 content 
		
		char c = s1.charAt(0);//picks the content at index 0
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("AIshu");//ignores the case of content of s1 and compares
		System.out.println(b);
		
		System.out.println("******************************");
		
		StringBuffer sb1 = new StringBuffer("lochan");
		sb1.append("Raj");
		System.out.println(sb1);
	}
}
