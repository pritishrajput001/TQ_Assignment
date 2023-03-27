package com.arrayofobject;

import java.util.Scanner;

public class EmployeeDateTest1 {

	static Scanner sc = new Scanner(System.in);

	public static void getEmployeeDetails(EmployeeDate e) {
		System.out.println("Enter employee id:");
		e.setId(sc.nextInt());

		System.out.println("Enter employee name:");
		e.setName(sc.next());

		System.out.println("Enter Salary:");
		e.setSalary(sc.nextFloat());

		e.setJoiningDate(new EmployeeDate());
	}

	public static void main(String args[]) {
		EmployeeDate empd[] = new EmployeeDate[3];

		for (int i = 0; i < empd.length; i++) {
			empd[i] = new EmployeeDate();
			System.out.println(empd[i]);
		}
	}
}
