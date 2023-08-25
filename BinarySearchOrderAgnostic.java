package com.vinay.practice.lc;

public class BinarySearchOrderAgnostic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr = {9,8,7,6,5,4,3,2,1};
		int target = 8;
		
		System.out.println("The target number was found at: " + orderAgnosticBS(arr, target));
	}

	// don't know if order is ascending or descending
	public static int orderAgnosticBS(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			// System.out.println("s");
			int mid = start + (end-start) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid-1;
				} else if(target > arr[mid]) {
					start = mid+1;
				}
			} else {
				if(target > arr[mid]) {
					end = mid-1;
				} else if(target < arr[mid]) {
					start = mid+1;
				}
			}
			 
		}
		return -1;
	}
}
