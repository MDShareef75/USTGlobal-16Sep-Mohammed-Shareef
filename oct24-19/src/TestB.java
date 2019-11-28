
public class TestB {

	static int b;
	int a;
	
	
	{
		a = 10;
		b = 20;
		System.out.println("non static block 1");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		TestB b = new TestB();
		TestB b1 = new TestB();
		System.out.println("a value is "+b.a);
		System.out.println("b value is "+b.b);
		
		System.out.println("end");
	}
	
	
	{
		a = 20;
		b = 30;
		System.out.println("non static block 2");
	}
}
