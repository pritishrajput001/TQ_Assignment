package com.exceptionassignment;
//WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException
public class MultipleExceptions {
	public static void main(String args[]) {
		int arr[]= { 1,4,8,23,55};
		try {
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=arr[i]/arr[i+1];
				System.out.println(arr[i]);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Check your arrayindex/size");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
