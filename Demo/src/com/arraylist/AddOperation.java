package com.arraylist;

import java.util.ArrayList;

public class AddOperation {
	public static void main(String args[]) {
		ArrayList list1 = new ArrayList();

		list1.add("1899");
		list1.add("Pritish");
		list1.add("7781");
		list1.add("Rajput");

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}

}
