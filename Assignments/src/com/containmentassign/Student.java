package com.containmentassign;

public class Student {
	int id;
	String name;
	Department dept;

	public Student() {

	}

	public Student(int id, String name, Department dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	public void setDepartment(Department dept) {
		this.dept = dept;

	}

	public Department dept() {
		return dept;
	}

	public String toString() {
		return "[Student details are  Id: " + id + "Name: " + name + "Department: " + dept + "]";
	}

}
