
public class Student {

	String name;
	String usn;
	int marks;
	int age;
	int yop;
	
	public Student(String name,String usn,int marks,int age,int yop) {
		
		this.name = name;
		this.usn = usn;
		this.marks = marks;
		this.age = age;
		this.yop = yop;
	
	}
	
	void displayDetails() {
	
		System.out.println("name:"+name+" usn:"+usn+" marks:"+marks+" age:"+age+" yop:"+yop);
	
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("shareef","4ai15cs060",10,22,2019);
		s1.displayDetails();
		
		Student s2 = new Student("faizan","4ai15ec066",20,21,2019);
		s2.displayDetails();
		
		Student s3 = new Student("lochan","4ai15ec045",30,22,2019);
		s3.displayDetails();
		
		Student s4 = new Student("amith","4ai15cs020",40,21,2019);
		s4.displayDetails();
		
		Student s5 = new Student("amal","4ai15cs095",20,22,2019);
		s5.displayDetails();
		
		Student s6 = new Student("jison","4ai15cs063",60,23,2020);
		s6.displayDetails();
		
		Student s7 = new Student("harsha","4ai15cs040",40,21,2019);
		s7.displayDetails();
		
		Student s8 = new Student("krishna","4ai15cs030",60,22,2019);
		s8.displayDetails();
		
		Student s9 = new Student("rafeeq","4ai16cs415",80,24,2019);
		s9.displayDetails();
		
		Student s10 = new Student("arun","4ai16cs405",50,22,2019);
		s10.displayDetails();
	}
}
	