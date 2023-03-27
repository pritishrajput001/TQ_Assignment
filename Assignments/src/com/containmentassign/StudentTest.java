package com.containmentassign;

public class StudentTest {
	public static void main(String args[]) {
		Department d1 = new Department(222, "Mechanical Engineering");
		Department d2 = new Department(440, "Entc");

		Student s1 = new Student(11, "Vikram", d1);
		Student s2 = new Student(21, "Vedha", d2);
		Student s3 = new Student(33, "Rohit Sharma", d1);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
