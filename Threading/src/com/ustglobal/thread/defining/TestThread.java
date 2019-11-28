package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		MyThread t1 = new MyThread();
		
		t1.start();
		/* t1.run(); it doesnot behave like thread ... it behaves like a normal program
		 * all code will be executed inside main thread only
		 * 
		 * t1.start; it throws IllegalThreadStateException
		 * 
		 * */
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
		
		System.out.println("Main Ended");
	}
}
