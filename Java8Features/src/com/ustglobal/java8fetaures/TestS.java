package com.ustglobal.java8fetaures;

import java.util.ArrayList;

public class TestS {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5, "shareef", 67.4));
		al.add(new Student(3, "lochan", 54.6));
		al.add(new Student(4, "vijay", 76.2));
		al.add(new Student(7, "faizan", 23.5));
		al.add(new Student(6, "yash", 78.4));
		
		Helper h = new Helper();
		h.displayAllStudent(al);
		h.displayFailedStudents(al);
		h.displayPassedStudents(al);
		h.topperOfClass(al);
	}
}
