
public class TestC {
	public static void main(String[] args) {
		
		Person.color = "white";
		Person.sleep();
		
		System.out.println("Person color "+Person.color);
		
		System.out.println("=========================================================");
		//Person.age = 20; age is not static so it cannot be accessed using class name
		
		Person p1 = new Person();
		
		p1.age = 20;
		p1.name = "shareef";
		
		System.out.println("Person p1 age is "+p1.age);
		System.out.println("Person p1 name is "+p1.name);
		
		p1.color = "black";//static var accessing using object
		p1.sleep();//same
		
		System.out.println("*********************************************************");
		
		Person p2 = new Person();
		
		p2.age = 25;
		p2.name = "atom";
		
		System.out.println("Person p2 age is "+p2.age);
		System.out.println("person p2 name is "+p2.name);
	}
}
