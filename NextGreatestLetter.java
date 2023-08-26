package com.vinay.practice.lc;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/


public class NextGreatestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr = {'c', 'f', 'j'};
		char target = 'g';
		
		System.out.println("The smallest letter greater than target: " + nextGreatestLetter(arr, target));
		
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		
		
		// Brute Force
		/*
		for(int i = 0 ; i <= letters.length-1 ; i++) {
			if(letters[i] > target ) {
				return letters[i];
			}
					
		}
		return letters[0];
		*/
		
		// BinarySearch
		
		int start = 0;
		int end = letters.length-1;
		
		while(start <= end) {
			System.out.println("s");
			int mid = start + (end-start) / 2;
			
			if(target < letters[mid]) {
				end = mid-1;
			} else {
				start = mid+1;
			} 
			
		}
		// start would have given us the required char but if in case, the target is not found, then we have to return 1st char.
		// To handle return of 1st char, we use mod by length which will give 0. Hence, arr[0]
		return letters[start % letters.length];

	}
}
