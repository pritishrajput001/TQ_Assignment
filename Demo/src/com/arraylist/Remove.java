package com.arraylist;

import java.util.ArrayList;

public class Remove {

	public static void main(String args[]) {
		ArrayList list1 = new ArrayList();

		list1.add("1899");
		list1.add("Pritish");
		list1.add("7781");
		list1.add("Rajput");

		System.out.println(list1);

		list1.remove(2);
		System.out.println(list1);
	}

}
