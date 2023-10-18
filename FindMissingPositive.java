package com.vinay.practice.lc;

import java.util.Arrays;

public class FindMissingPositive {

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		// int arr[] = {3,0,1};
		
		//int arr[] = {7,8,9,11,12};
		int arr[] = {1};
		System.out.println("Missing number is : "+ missingNumber(arr));

	}
	
	public static int missingNumber(int nums[]) {
		int i=0;
		while(i<nums.length) {
			int correctIndex = nums[i] - 1;
			if((nums[i] > 0 && nums[i] <= nums.length) && (nums[i] != nums[correctIndex])){
				swap(nums, i, correctIndex);
			} else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
		for(i=0; i<nums.length; i++) {
			if(nums[i] != (i+1) ) {
				return i+1;
			}
		}
		
		// if all the numbers in the array are available, then the next missing number is n+1
		return nums.length+1;
		
		
	}
	
	public static void swap(int[] arr, int i, int correctIndex) {
		int temp = arr[correctIndex];
		arr[correctIndex] = arr[i];
		arr[i] = temp;
	}

}
