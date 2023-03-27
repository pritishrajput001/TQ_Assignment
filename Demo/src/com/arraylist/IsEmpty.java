package com.arraylist;

import java.util.ArrayList;

public class IsEmpty {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Car");
		list.add("Pritish");
		list.add("Lamborgini");
		list.add("1899");

		System.out.println("Original list.." + list);
		System.out.println("Is array list empty..?   " + list.isEmpty());

		list.removeAll(list);

		System.out.println("Is array list empty...?  " + list.isEmpty());
	}

}
