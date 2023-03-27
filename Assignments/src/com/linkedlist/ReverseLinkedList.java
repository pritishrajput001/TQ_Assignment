package com.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
	public static void reverseList(LinkedList<String> list) {
		ListIterator<String> itrf = list.listIterator();
		ListIterator<String> itrr = list.listIterator(list.size());

		String temp;

		for (int i = 0, j = (list.size() - 1); i < list.size() / 2; i++, j--) {
			temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}

	}

	public static void main(String[] args) {

		LinkedList<String> stud = new LinkedList<>();

		stud.add("Bhushan");
		stud.add("Chinmay");
		stud.add("Shuruti");
		stud.add("Priya");
		stud.add("Vaishnavi");
		stud.add("Priya");// duplicate allowed
		stud.add("Adinath");

		System.out.println(stud);
		// Collections.reverse(stud);

		reverseList(stud);
		System.out.println(stud);

	}

}
