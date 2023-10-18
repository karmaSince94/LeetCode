package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-the-duplicate-number/description/

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1,3,4,2};
		//int[] nums = {1,1};
		
		System.out.println("Duplicate number is : " + findMissingNumbers(nums));
	}
	
	public static int findMissingNumbers(int[] nums) {
		
		int i=0;
		List<Integer> missingNumber = new ArrayList<Integer>();
		
		// sort
		while(i < nums.length) {
			// if the number is not at it's correct place, swap
			if(nums[i] != i+1) {
				int correct = nums[i] - 1;
				if(nums[i] != nums[correct]) {
					swap(nums, i, correct);
				} else {
					return nums[i];
				}
			} else {
				i++;
			}
			
		}
		return -1;
		
	}
	
	public static void swap(int[] nums, int i, int correct) {
		int temp = nums[correct];
		nums[correct] = nums[i];
		nums[i] = temp;
	}


	
}
