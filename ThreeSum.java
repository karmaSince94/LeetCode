package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/3sum/


public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums).toString());
		
	}
	
	public static List<List<Integer>> threeSum(int nums[]) {
		
		if(nums.length < 3)
			return new ArrayList<List<Integer>>();
		
		Arrays.sort(nums);
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		
		for(int i=0; i<nums.length-2; i++) {
			int first = i+1;
			int last = nums.length-1;
			
			while(first < last) {
				
				int sum = nums[i] + nums[first] + nums[last];
				if(sum == 0) {
					res.add(Arrays.asList(nums[i], nums[first], nums[last]));
					first++;
					last--;
				} else if(sum < 0){
					first = first+1;
				} else {
					last = last-1;
				}
			}
		}
		
		return new ArrayList<List<Integer>>(res);
	}

}
