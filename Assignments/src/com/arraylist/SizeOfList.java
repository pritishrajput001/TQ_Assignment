package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SizeOfList {
	public static void main(String[] args) {
		List aList = new ArrayList();
		aList.add("Apple");
		aList.add("Mango");
		aList.add("Guava");
		aList.add("Orange");
		aList.add("Peach");

		System.out.println(aList);
		System.out.println("The size of the ArrayList is: " + aList.size());
	}
}
