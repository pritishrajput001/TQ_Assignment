package com.polymorphism;

/*WAJP2 create a class Kid with method readBook() and another method
readBook () with 2 parameters. The method readBook here is over-loaded (same
method name but different parameters)*/

public class Kid {
	int id;
	String name;

	public void readBook() {
		System.out.println("Im empty");
	}

	public void readBook(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Kid id is " + id + " and name is " + name);

	}

}
