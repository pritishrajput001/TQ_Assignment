package com.containmentassign;

public class PeresonTest {
	public static void main(String args[]) {
		Address a1 = new Address("Aurangabad", "Maharashtra", "India");
		Address a2 = new Address("Ahmadnagar", "Maharashtra", "India");

		Person p1 = new Person("Pritish", "Male", 23, a1);
		Person p2 = new Person("Suyog", "Male", 22, a2);

		System.out.println(p1);
		System.out.println(p2);
	}

}
