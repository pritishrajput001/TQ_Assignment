package com.containmentAssignments;

public class Student {
	private int id;
	private String name;
	private Department department;

	public Student(int id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
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

	public String toString() {
		return "Student: " + " Id is" + id + "and name is " + name;
	}
}
