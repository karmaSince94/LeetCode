package com.vinay.practice.lc.recursion;

// https://leetcode.com/problems/binary-search/description/

public class BinarySearchRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-1,0,3,5,9,12};
		int element = 2;
		// System.out.println("Number found at : " + binarySearchRec(arr, 0, arr.length-1, element));
		System.out.println("Number found at : " + search(arr, element));

	}
	
	public static int binarySearchRec(int arr[], int start, int end, int ele) {
		
		if(start > end)
			return -1;
		
		int mid = start + (end-start) / 2;
		if(ele == arr[mid]) {
			return mid;
		} else  if(ele > arr[mid] && mid < end) {
			return binarySearchRec(arr, mid+1, end, ele);
		} else if(ele < arr[mid] && mid >= start){
			return binarySearchRec(arr, start, mid-1, ele);
		} else {
			return -1;
		}
		
	}
	
	public static int search(int nums[], int target) {
		return binarySearchRec(nums, 0, nums.length-1, target);
		
	}

}
