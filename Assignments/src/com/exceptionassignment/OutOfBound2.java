package com.exceptionassignment;

//WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the
//line number from where the Exception is thrown
public class OutOfBound2 {
	public static void main(String args[]) {
		int array[] = { 2, 5, 10 };

		System.out.println(array[30]);
	}

}
