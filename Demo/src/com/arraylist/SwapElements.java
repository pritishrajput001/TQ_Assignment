package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
	public static void mai(String args[]) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Black");
		list.add("Orange");
		list.add("Red");
		list.add("White");
		list.add("Purple");

		System.out.println(list);

		for (String a : list) {
			System.out.println(a);
		}

		Collections.swap(list, 0, 2);

		System.out.println("Arraylist after swap...");
		for (String b : list) {
			System.out.println(b);
		}
	}

}
