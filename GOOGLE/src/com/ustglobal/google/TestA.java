package com.ustglobal.google;

public class TestA {

	public static void main(String[] args) {
		
		Browser b = new Browser();
		
		Google g = new Gmail();//upcasting
		b.open(g);

		System.out.println("***************************");
		
		Google g1 = new GoogleDrive();
		b.open(g1);
	}
}
