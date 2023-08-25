package com.vinay.practice.lc;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
/*
 * 1. use divide rule
 * 2. for each number, use toString and length()
 * 3. if number falls between these ranges (num >=10 && num <=99) || (num >=1000 && num <=9999) || (num >=100000 && num <=999999)
 * 4. Get Math.log10(num)
 */

public class CountEvenDigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,345,2,6,7896};
		System.out.println(countEvenDigNumber(arr));
	}
	
	static int countEvenDigNumber(int[] arr) {
		int count = 0, digCount = 0;
		for (int num : arr) {
			digCount = 0;
			while(num > 0) {
				digCount++;
				num = num / 10;
			}
			
			if(digCount % 2 == 0 && digCount != 0) {
				count += 1;
			}
		}
		
		return count;
	}

}
