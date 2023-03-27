package com.polymorphism;

public class TestKids {
	public static void main(String args[]) {

		Kid k1 = new Kid();
		k1.readBook();
		k1.readBook(8, "Summer");

		Kid k2 = new Kid();
		k2.readBook();
		k2.readBook(5, "Arohi");

	}

}
