package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateAll {
	public static void main(String args[]) {

		LinkedList<String> vehicle = new LinkedList<>();

		vehicle.add("HondaCity");
		vehicle.add("Creta");
		vehicle.add("Thar");
		vehicle.add("XUV");
		vehicle.add("Rapid");

		System.out.println(vehicle);

		Iterator itr = vehicle.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
