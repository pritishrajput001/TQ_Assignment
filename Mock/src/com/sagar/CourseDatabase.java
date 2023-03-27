package com.sagar;

import java.util.Scanner;

public class CourseDatabase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CourseDB courseDB = new CourseDB(5);

		while (true) {
			System.out.println("1. Add Course");
			System.out.println("2. Delete Course");
			System.out.println("3. Update Course");
			System.out.println("4. View Course");
			System.out.println("5. Display All Courses");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter Course ID: ");
				int cid = scanner.nextInt();
				System.out.print("Enter Course Name: ");
				String cname = scanner.next();
				System.out.print("Enter Course Fee: ");
				double cfee = scanner.nextDouble();
				courseDB.addCourse(null);
				;
				break;
			case 2:
				System.out.print("Enter Course ID: ");
				cid = scanner.nextInt();
				courseDB.deleteCourse(cid);
				break;
			case 3:
				System.out.print("Enter Course ID: ");
				cid = scanner.nextInt();
				System.out.print("Enter Course Name: ");
				cname = scanner.next();
				System.out.print("Enter Course Fee: ");
				cfee = scanner.nextDouble();
				courseDB.updateCourse(cid, cname, cfee);
				break;
			case 4:
				System.out.print("Enter Course ID: ");
				cid = scanner.nextInt();
				courseDB.viewCourse(cid);
				break;
			case 5:
				courseDB.displayCourses();
				break;
			case 6:
				System.exit(6);
			}
		}
	}
}