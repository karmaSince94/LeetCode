package com.vinay.practice.lc.recursion;

// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		printNumber(1, n);
		System.out.println("------");
		printNumber(n);
	}
	
	public static void printNumber(int i, int n) {
		if(i <= n) {
			System.out.println(i);
			printNumber(i+1, n);
		}
		
	}
	
	public static void printNumber(int n) {
		if(n > 1)
			printNumber(n-1);
		System.out.print(n + " ");
		
	}

}
