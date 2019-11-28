
public class SubClass extends SuperClass{

	String s = "sub class variable";
	
	SubClass() {
		
		super();
		System.out.println("sub class constructor");
	}
	
	void getSData() {
		
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		
		super.superClassMethod();
		this.subClassMethod();
	}
	
	void subClassMethod() {
	
		System.out.println("sub class method");
	}
}
