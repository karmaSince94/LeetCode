package com.vinay.practice.lc.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		fibRec(num);
		System.out.println(num + " : " + fibRec(num));
	}
	
	public static int fibRec(int num) {
		
		if(num == 0 || num == 1) {
			return num;
		}
		
		return fibRec(num-1) + fibRec(num-2); 
		
	}
	
	public static int fib(int num) {
		if(num <= 1)
			return num;
		
		int i=0;
		int j=1;
		int sum = 0;
		
				
		for (int k=2; i<num; i++) {
			sum = i+j;
			i=j;
			j=sum;
		}
		return sum;
		
	}
}
