package com.arraylist;

import java.util.ArrayList;

public class FirstPosition {

	public static void main(String args[]) {
		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("White");
		colors.add("Orange");
		colors.add("Black");

		System.out.println(colors);

		colors.add(0, "Purple");

		System.out.println(colors);
	}

}
