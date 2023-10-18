package com.vinay.practice.lc;


// https://leetcode.com/problems/missing-number/description/

// cyclic sort

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = {3,0,1};
		
		int arr[] = {9,6,4,2,3,5,7,0,1};
		System.out.println("Missing number is : "+ missingNumber(arr));
		
	}
	
	public static int missingNumber(int nums[]) {
		int i=0;
		while(i<nums.length) {
			int correctIndex = nums[i];
			if((nums[i] < nums.length) && (nums[i] != nums[correctIndex])){
				swap(nums, i, correctIndex);
			} else {
				i++;
			}
		}
		
		for(i=0; i<nums.length; i++) {
			if(nums[i] != i ) {
				return i;
			}
		}
		
		return nums.length;
		
		
	}
	
	public static void swap(int[] arr, int i, int correctIndex) {
		int temp = arr[correctIndex];
		arr[correctIndex] = arr[i];
		arr[i] = temp;
	}

}
