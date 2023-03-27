package com.arraylist;

import java.util.ArrayList;

public class CollectionToArray {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Pritish");
		list.add("Rajput");
		list.add("1888");
		list.add("LISUIHAS");

		System.out.println(list);

		String[] str = list.toArray(new String[0]);

		for (int i = 0; i < str.length; i++) {
			String data = str[i];

			System.out.println(data);
		}

	}

}
