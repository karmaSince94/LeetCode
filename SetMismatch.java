package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,4};
		System.out.println("MIsmatched numbers are " + findErrorNums(nums));

	}
	
	public static int[] findErrorNums(int[] nums) {
		
		int i=0;
		// List<Integer> mismatchedNumber = new ArrayList<Integer>();
		int[] mismatchedNumber = new int[2];
		
		// sort
		while(i < nums.length) {
			int correct = nums[i] - 1;
			if(nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		//find numbers
		for(i=0; i<nums.length; i++) {
			if(nums[i] != (i+1)) {
				mismatchedNumber[0] = (nums[i]);
				mismatchedNumber[1] = (i+1);
				break;
			}
		}
		return mismatchedNumber;
		
	}
	
	public static void swap(int[] nums, int i, int correct) {
		int temp = nums[correct];
		nums[correct] = nums[i];
		nums[i] = temp;
	}

}
