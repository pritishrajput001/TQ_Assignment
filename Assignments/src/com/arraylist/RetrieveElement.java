package com.arraylist;

import java.util.ArrayList;

public class RetrieveElement {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(20);
		al.add(12);
		al.add(21);
		al.add(11);

		System.out.println(al.get(3));
		System.out.println(al.get(0));
	}

}
