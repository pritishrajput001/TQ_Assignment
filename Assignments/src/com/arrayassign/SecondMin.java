package com.arrayassign;

//WAP to find 2nd min value in an array 
//[-20, 0, -25, 15, 19, 37, 23]
public class SecondMin {
	public static int getSecondSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];// 2nd element because index starts from 0
	}

	public static void main(String args[]) {
		int a[] = { -20, 0, -25, 15, 19, 37, 23 };

		System.out.println("Second smallest: " + getSecondSmallest(a, 6));

	}
}
