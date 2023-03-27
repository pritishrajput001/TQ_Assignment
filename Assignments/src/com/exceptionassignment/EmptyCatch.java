package com.exceptionassignment;

//WAP to check can we have an empty catch block?
public class EmptyCatch {
	public static void main(String args[]) {
		try {
			int a = 15, b = 0;
			int c = a / b;
		} catch (Exception e) {
			// Empty catch
		}
	}

}
