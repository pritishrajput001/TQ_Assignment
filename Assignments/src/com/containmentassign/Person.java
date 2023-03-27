package com.containmentassign;

public class Person {
	private String name;
	private String gender;
	private int age;
	Address address;

	public Person() {

	}

	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Person(String name, String gender, int age, Address address) {
		this(name, gender, age);
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address address() {
		return address;
	}

	public String toString() {
		return "[Person details are: " + name + " " + gender + " " + age + " " + address + "]";
	}

}
