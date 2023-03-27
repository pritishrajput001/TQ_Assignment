package com.exceptionassignment;

//WAP to show checked exception and use multiple catch block with universal Exception handler.
public class CheckedExceptions {
	public static void main(String args[]) {
		int ar[]= {77,21};
		try {
			for(int i=0;i<ar.length;i++) {
				ar[i]=ar[i]%ar[i+1];
				System.out.println(ar[i]);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
