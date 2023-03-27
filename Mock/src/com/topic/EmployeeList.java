package com.topic;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String args[]) {
		ArrayList<Employee> list1 = new ArrayList<>();

		list1.add(new Employee(11, "Pritish", "Sales", 98734));
		list1.add(new Employee(12, "Sagar", "HR", 88734));
		list1.add(new Employee(13, "Adinath", "Business", 78734));
		list1.add(new Employee(14, "Suyog", "Marketing", 68734));

		for (Employee e1 : list1) {
			System.out.println(e1);
		}

		System.out.println("----------------------------------------------");

		Collections.sort(list1, new DepartmentCom());
		Collections.sort(list1, new SalaryCom());

		for (Employee e1 : list1) {
			System.out.println(e1);
		}
	}

}
