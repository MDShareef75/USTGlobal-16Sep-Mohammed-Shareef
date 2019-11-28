package com.ustglobal.objectclass.tostring;

public class Student {

	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
//	public void printDetails() {
//		System.out.println("name :"+ name + " id :"+ id +" percentage :"+percentage);
//	}
	
}
