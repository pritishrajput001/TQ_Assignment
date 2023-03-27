package com.linkedlist;

import java.util.LinkedList;

public class InsertAtSpecified {

	public static void main(String args[]) {
		LinkedList<String> language = new LinkedList<>();

		language.add("Java");
		language.add("Python");
		language.add("C");
		language.add("Cpp");
		language.add("php");
		language.add("dotnet");
		language.add("Css");

		System.out.println(language);

		System.out.println("Adding bootstrap at cpp");

		language.add(3, "Bootstrap");

		System.out.println(language);

	}

}
