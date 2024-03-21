package com.vinay.practice.lc;


// https://leetcode.com/problems/contains-duplicate-ii/


import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,2,3,1};
		System.out.println(containsNearbyDuplicate(arr, 3));
		

	}
	
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<nums.length; i++) {
			
			if(map.containsKey(nums[i])) {
				int index = map.get(nums[i]);
				if(Math.abs(index - i) <= k)
					return true;
			}
			map.put(nums[i], i);
		}
		
		return false;
		
    }

}
