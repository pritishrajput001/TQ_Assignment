package com.demo;

import java.util.Scanner;

public class Solution {
	public void alternateNumber(){
		Scanner sc = new Scanner(System.in);
		int coin1[]=new int[4];
		int coin2[]= {0,1,0,1};
		int count=0;
		for(int i=0;i<coin1.length;i++) {
			int coin=sc.nextInt();
			coin1[i]=coin;
		}
		for(int i=0;i<coin1.length;i++) {
			if(coin1[i]==coin2[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String args[]) {
		Solution s = new Solution();
		s.alternateNumber();
	}

}
