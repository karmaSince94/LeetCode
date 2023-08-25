package com.vinay.practice.lc;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// https://leetcode.com/discuss/interview-experience/1979273/infinite-sorted-array


public class FindInInfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,90,100,130,140,160,170};
		int ele = 10;
		int end = findLimit(arr, ele);
		System.out.println("The element is found at : " + binarySearch(arr, ele, end));
		
	}
	
	public static int findLimit(int arr[], int target) {
		int start = 0;
		int end = 1;
		while(target > arr[end]) {
			end = end * 2;
		}
		return end;
	}

	public static int binarySearch(int[] arr, int target, int limit) {
		
		int start = 0;
		int end = limit;
		
		while(start <= end) {
			System.out.println("s");
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
