package com.arraylist;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Pritish");
		list.add("uhwruh");
		list.add("yogesh");
		list.add("12345678");

		System.out.println(list);

		System.out.println(list.size());
		list.clear();
		System.out.println(list);

	}

}
