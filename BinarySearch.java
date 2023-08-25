package com.vinay.practice.lc;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 1;
		
		System.out.println("The target number was found at: " + binarySearch(arr, target));
		
		

	}
	
	public static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		
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
