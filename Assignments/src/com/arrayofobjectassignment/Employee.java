package com.arrayofobjectassignment;

public class Employee {
	private int empId;
	private String name;
	static float salary;
	static {
		salary = 45000f;
	}

	public Employee() {

	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
