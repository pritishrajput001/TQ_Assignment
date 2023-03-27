package com.containmentAssignments;

public class StudentTest {
	public static void main(String args[]) {
		Department d1 = new Department(15, "Mechanical");
		Department d2 = new Department(55, "Electronics");

		Student s1 = new Student(7, "Pritish", d1);
		Student s2 = new Student(8, "Darshan", d2);

		System.out.println(s1);
		System.out.println(s2);

	}

}
