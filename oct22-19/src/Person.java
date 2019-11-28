
public class Person {
	
	String name;
	int age;
	
	Person(String pname , int page) {
		
		name =  pname;
		age  = page;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person("Lochan" , 22);
		//Person p = new Person();//error because user already gave a constructor.. so compiler will not write any constructor
	}
}
