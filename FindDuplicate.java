package com.vinay.practice.lc;

/*
 * Find the Duplicate Number
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 * 
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * 
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 * 
 */

public class FindDuplicate {

	public static void main(String[] args) {
		
		int nums[] = {1,3,4,2,2};
		for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.println(nums[i]);
                }
            }
        }
        return;

	}

}
