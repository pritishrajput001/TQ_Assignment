package com.arraylist;

import java.util.ArrayList;

public class Retain {
	public static void main(String args[]) {

		ArrayList<String> book1 = new ArrayList<>();
		book1.add("Secret");
		book1.add("Red");
		book1.add("Revenge");

		ArrayList<String> book2 = new ArrayList<>();
		book2.add("Secret");
		book2.add("Red");
		book2.add("Revenge");
		book2.add("Shafi");

		System.out.println("Books= " + book1);
		System.out.println("Authors= " + book2);

		book2.retainAll(book1);

		System.out.println("--------------After retaining---------------");

		System.out.println(book1);
		System.out.println(book2);

	}

}
