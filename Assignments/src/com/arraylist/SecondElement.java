package com.arraylist;

import java.util.ArrayList;

public class SecondElement {

	public static void main(String args[]) {
		ArrayList<String> book = new ArrayList<>();

		book.add("Soulmate");
		book.add("White collar");
		book.add("Fire");
		System.out.println("Original list..." + book);

		String newbook = "Revenge";
		book.set(1, newbook);

		int num = book.size();
		System.out.println("Replace second element with 'Revenge'");
		for (int i = 0; i < num; i++) {
			System.out.print(book.get(i) + " ");
		}

	}

}
