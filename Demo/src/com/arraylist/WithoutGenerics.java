package com.arraylist;

//Q1
import java.util.ArrayList;

public class WithoutGenerics {
	public static void main(String args[]) {
		ArrayList<Integer> arli = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			arli.add(i);

		}
		System.out.println(arli);

		ArrayList<String> arli2 = new ArrayList<>();

		arli2.add("Pritish");
		arli2.add("yOGESH");
		arli2.add("Dhanashri");
		arli2.add("Gaurav");

		System.out.println(arli2);
	}

}
