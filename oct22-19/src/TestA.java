
public class TestA {
	
	public static int add(int a , int b) {
		System.out.println("add(int a , int b) method");
		return a+ b;
	}
	
	public static long add(long a , int b) {
		System.out.println("add(long a , int b) method");
		return a+ b;
	}
	
	public static void add(int a , byte b) {
		System.out.println("add(int a , byte b) method");
	}
	
	public int multiply(int a , int b) {
		System.out.println("multiply(int a ,int b) method");
		return a*b;
	}
	
	public int multiply(byte a , int b) {
		System.out.println("multiply(byte a ,int b) method");
		return a*b;
	}
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)");
		main(10);
		add(10, 20);
		add(11, 12);
		add(94, 4);
		
		TestA t = new TestA();
		
		t.multiply(0, 12);
		t.multiply(10, 40);
		
		
	}
	
	public static void main(int a) {
		System.out.println("main(int a) method");
	}
}
