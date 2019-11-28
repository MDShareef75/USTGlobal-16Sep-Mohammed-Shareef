
public class TestA {

	static int a;
	int b;

	static {
		a = 10;
		//b = 5; it gives error because it is not a static variable
		System.out.println("static block 1");
	}

	TestA() {
		System.out.println("TestA() constructor");
	}

	public static void main(String[] args) {
		TestA t = new TestA();
		TestA t1 = new TestA();
		System.out.println("a value is "+a);
	}

	static {
		a = 20;
		System.out.println("static block 2");
	}

	static {
		a = 40;
		System.out.println("static block 3");
	}
}
