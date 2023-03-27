package com.containment;

import java.util.Scanner;

public class BookTest {
	static Scanner sc = new Scanner(System.in);

	public static void getBookInfo(Book b) {
		System.out.println("Enter book id");
		b.setBid(sc.nextInt());

		System.out.println("Enter book name");
		b.setBname(sc.next());

		System.out.println("Enter price");
		b.setPrice(sc.nextFloat());
		b.setAuthor(new Author());

		System.out.println("Enter Author name");
		b.getAuthor().setName(sc.next());

		System.out.println("Enter author id");
		b.getAuthor().setAid(sc.nextInt());

	}

	public static void main(String args[]) {
		Book b1[] = new Book[2];
		for (int i = 0; i < 2; i++) {
			b1[i] = new Book();
			getBookInfo(b1[i]);
			System.out.println(b1[i]);
		}

	}

}
