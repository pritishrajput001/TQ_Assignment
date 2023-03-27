package com.exceptionassignment;

//WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.
public class OutOfBound {
	public static void main(String args[]) {
		int array[] = { 7, 3, 9 };
		try {
			System.out.println(array[30]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
