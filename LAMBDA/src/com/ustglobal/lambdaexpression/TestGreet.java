package com.ustglobal.lambdaexpression;

public class TestGreet implements GreetInterface {

	public static void main(String[] args) {
		GreetInterface message = (msg) -> {
			System.out.println("hello");
			System.out.println(msg);
			return msg;
		};
	}

	@Override
	public String greet(String msg) {
		return "hello";
	}
}
