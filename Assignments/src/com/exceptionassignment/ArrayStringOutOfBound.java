package com.exceptionassignment;

public class ArrayStringOutOfBound {
	String arr[] = { "Dhan", "Man", "nan" };
	{
		try {
			for (int i = 0; i < arr.length; i++) {
				try {
					System.out.println(arr[i].charAt(9));
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
