package com.containmentassign;

public class Employee {
	private int id;
	private String name;
	private float salary;
	Department2 deptt;
	MyDate mydate;

	public Employee() {

	}

	public Employee(int id, String name, float salary, Department2 deptt) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptt = deptt;

	}

	public Employee(int id, String name, float salary, Department2 deptt, MyDate mydate) {
		this(id, name, salary, deptt);
		this.mydate = mydate;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void getDepartment(Department2 deptt) {
		this.deptt = deptt;
	}

	public Department2 deptt() {
		return deptt;

	}

	public String toString() {
		return "[Employee Details are: Id-" + id + " Name-" + name + " Salary-" + salary + " " + deptt + " " + mydate;
	}

}
