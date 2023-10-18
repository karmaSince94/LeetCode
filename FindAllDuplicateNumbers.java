package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findAllDuplicateNumbers(nums).toString());
			
	}
		
	public static List<Integer> findAllDuplicateNumbers(int[] nums) {
		
		int i=0;
		List<Integer> missingNumber = new ArrayList<Integer>();
		
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
			if(nums[i] != (i+1))
				missingNumber.add(nums[i]);
		}
		return missingNumber;
		
	}
		
	public static void swap(int[] nums, int i, int correct) {
		int temp = nums[correct];
		nums[correct] = nums[i];
		nums[i] = temp;
	}

}
