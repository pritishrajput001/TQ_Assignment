package com.exceptionassignment;

//WAP where only try and finally is used
public class TryFinally {
	public static void main(String args[]) {
		int myarr[]= {23,45,67,88,99};
		try
		{
			for(int i=0;i<myarr.length;i++) {
				myarr[i]=myarr[i]/myarr[i+2];
				System.out.println(myarr[i]);
			}
		}
		finally
		{
			System.out.println("Close the array");
		}
	}

}
