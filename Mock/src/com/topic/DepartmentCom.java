package com.topic;

import java.util.Comparator;

public class DepartmentCom implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub

		return o1.getDepartment().compareTo(o2.getDepartment());

	}

}
