package com.arrayassign;

import java.util.Scanner;

public class MaxMinArray {
	static void checkMax(int ar[]) {
		int max = ar[0];
		for (int x : ar) {
			if (max < x) {
				max = x;
			}
		}
		System.out.println("Maximum number: " + max);
	}

	static void checkMin(int ar[]) {
		int min = ar[0];
		for (int x : ar) {
			if (min > x) {
				min = x;
			}
		}
		System.out.println("Minimum number " + min);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

	}

}