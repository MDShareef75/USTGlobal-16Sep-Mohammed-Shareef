
public class Student {
	
	String name;
	int rollno;
	final String cname = "Bank";
	final int cid;
	
	Student() {
		this.cid = 20;
	}
	
	Student(String name , int rollno ,int cid) {
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	
	final void printDetails() {
		System.out.println("HI "+name+" welcome to "+cname);
	}
	
	final void printDatils(String name) {
		System.out.println("HI "+name+" welcome to "+cname);
	}
}
