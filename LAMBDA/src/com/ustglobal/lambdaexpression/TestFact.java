package com.ustglobal.lambdaexpression;

public class TestFact {

	public static void main(String[] args) {
		Factorial f = (n) -> {
			int fact = 1;
			for(int i = 2 ; i <= n ; i++) {
				fact = fact * i;
			}
			return fact;
		};
		int factT = f.fact(5);
		System.out.println("Factorial is "+factT);
	}
}
