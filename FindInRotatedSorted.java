package com.vinay.practice.lc;


// https://leetcode.com/problems/search-in-rotated-sorted-array/


public class FindInRotatedSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int nums[] = {3,5,1};
		int nums[] = {1,1,3};
		int target = 0;
		// int target = 3;
		int pos = -1;
		
		// find pivot
		// then search in left or right of pivot
		
		int pivot = findPivot(nums);
		
		if (pivot == -1) {
			pos = binarySearch(nums, 0, nums.length-1, target);
		} else if (nums[pivot] == target) {
			System.out.println("The target element was found at: " + pivot);
		} else if (target >= nums[0]) {
			pos = binarySearch(nums, 0, pivot-1, target);
		} else {
			pos = binarySearch(nums, pivot+1, nums.length-1, target);
		}
		
		System.out.println("The target element was found at: " + pos);
		
	}
	
	public static int findPivot(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			
			int mid = start + (end-start)/2;
			
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			
			if(arr[start] >= arr[mid]) {
				end = mid - 1;
			} else { // if(arr[start] < arr[mid-1])
				start = mid + 1;
			}
			
		}
		 
		return -1;
	}
	
	public static int binarySearch(int[] arr, int start, int end, int target) {
		
		while(start <= end) {
			//System.out.println("s");
			int mid = start + (end-start) / 2;
			
			if(target < arr[mid]) {
				end = mid-1;
			} else if(target > arr[mid]) {
				start = mid+1;
			} else {
				return mid;
			}
			
		}
		return -1;
	}
	
	

}
