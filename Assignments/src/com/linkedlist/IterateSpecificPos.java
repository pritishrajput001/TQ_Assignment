package com.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateSpecificPos {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<String>();

		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("CANADA");
		countries.add("USA");
		countries.add("Brazil");

		ListIterator itr = countries.listIterator(2);

		System.out.println("Countries are:");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
