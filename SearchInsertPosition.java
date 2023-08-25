package com.vinay.practice.lc;

// https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,3,5,9,14,16,18};
		int target = 19;
		
		System.out.println("The number should be inserted at position: " + searchInsert(arr, target));
		
	}
	
	public static int searchInsert(int[] num, int target) {
		
		int start = 0;
		int end = num.length-1;
		
		
		while(start <= end) {
			System.out.println("s");
			int mid = start + (end-start) / 2;
			
			if(target < num[mid]) {
				end = mid-1;
			} else if(target > num[mid]) {
				start = mid+1;
			} else {
				return mid;
			}
			
		}
		return start;
	}

}
