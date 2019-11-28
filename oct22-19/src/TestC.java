
public class TestC {

	TestC(){//constructor
		
		System.out.println("TestC constructor");//executed at the time of object creation
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		TestC t= new TestC();

		System.out.println("main ended");
	}
}
