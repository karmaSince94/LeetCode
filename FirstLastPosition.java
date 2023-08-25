package com.vinay.practice.lc;


// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


public class FirstLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,7,7,7,7,7,7,7,8,8,10};
		int target = 7;
		int position[] = searchRange(arr, target);
		System.out.println("The first and last positions are: " + position[0] + ", " + position[1]);
		
	}
	
	public static int[] searchRange(int[] nums, int target) {
		
		/*
		// BruteForce
		int position[] = {-1, -1};
		for (int i=0; i<nums.length; i++) {
			
			if(nums[i] == target) {
				position[0] = i;
				break;
			}
			
		}
		for (int i=nums.length-1; i>=0; i--) {
			if(nums[i] == target) {
				position[1] = i;
				break;
			}
		}
		return position;
		*
		*/
		
		int ansPosition[] = {-1, -1};
		ansPosition[0] = getFirstLastPos(nums, target, true);
		ansPosition[1] = getFirstLastPos(nums, target, false);
		return ansPosition;
		
		
		
	}
	
	static int getFirstLastPos(int nums[], int target, boolean isFirstLoc) {
				//BinarySearch
				
				int ansPos = -1;
				int start = 0;
				int end = nums.length-1;
				
				while(start <= end) {
					System.out.println("s");
					int mid = start + (end - start)/2;
					
					
					if(target < nums[mid])
						end = mid - 1;
					else if(target > nums[mid])
						start = mid + 1;
					else {
		 				ansPos = mid;
						if(isFirstLoc)
							end = mid - 1;
						else
							start = mid + 1;
					}
					
				}
				
				
				return ansPos;
	}

}
