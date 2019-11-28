
public class Employee {

	String name;
	int id;
	
	public Employee(String ename , int eid) {
		name  = ename;
		id = eid;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+id);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Hrithik",143);
		e1.printDetails();
		
		//e1.name = "Hrithik";
		//e1.eid = 143;
		
		Employee e2 = new Employee("Sudeep",423);
		e2.printDetails();
		//e2.name = "Sudeep";
		//e2.eid = 423;
		
		Employee e3 = new Employee("Amith",244);
		e3.printDetails();
		//e3.name = "Amith";
		//e3.eid = 244;
	}
}
