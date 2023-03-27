package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatchCollection {

	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(15, 22, 27));

		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(22, 17, 39));

		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(15, 22, 27));

		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);

		boolean isEqual = list1.equals(list2);
		boolean isEqual2 = list1.equals(list3);

		System.out.println(isEqual);
		System.out.println(isEqual2);
	}

}
