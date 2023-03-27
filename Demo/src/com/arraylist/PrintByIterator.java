package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PrintByIterator {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Pritish");
		list.add("Farishta");
		list.add("786");
		list.add("9156043415");

		System.out.println(list);

		System.out.println("=================Normal for=================");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=================Enhanced for loop===========");

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("================Iterator===============");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("================List Iterator forward============");

		ListIterator<String> listitr = list.listIterator(list.size());
		while (listitr.hasNext()) {
			System.out.println(listitr.next());
		}

		System.out.println("============List Iterator Backward================");
		ListIterator<String> listitr2 = list.listIterator(list.size());
		while (listitr2.hasPrevious()) {
			System.out.println(listitr2.previous());
		}

	}

}
