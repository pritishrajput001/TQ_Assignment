package com.containment;

import java.util.Scanner;

public class UpdateStudent {
	static Scanner sc = new Scanner(System.in);

	public static void enterStudentDetails(Student s) {
		System.out.println("Enter id");
		s.setSid(sc.nextInt());

		System.out.println("Enter student name");
		s.setSname(sc.next());

		System.out.println("Enter student age");
		s.setAge(sc.nextInt());

		s.setCourse(new Course());

		System.out.println("Enter course name");
		s.getCourse().setName(sc.next());

		System.out.println("Enter course fees");
		s.getCourse().setCfees(sc.nextDouble());

	}

}
