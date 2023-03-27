package com.polymorphism;

public class Teenager extends Kid {

	public void readBook() {
		System.out.println("Im empty");
	}

	public void readBook(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Kid id is " + id + " and name is " + name);

	}

}
