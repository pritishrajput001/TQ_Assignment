package com.arraylist;

//WAP to search the specified collection in this collection
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpecifiedCollection {
	public static void main(String args[]) {
		List<Integer> listNumbers = Arrays.asList(31, 87, 22, 45, 12, 98, 3, 6, 7);

		Integer max = Collections.max(listNumbers);

		System.out.println("Maximum number: " + max);
	}

}
