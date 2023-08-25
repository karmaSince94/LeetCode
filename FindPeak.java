package com.vinay.practice.lc;


// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/


public class FindPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {0,1,4,10,11,5,2};
		//int ele = 10;
		//int end = findLimit(arr, ele);
		System.out.println("The peak element found is : " + arr[findPeak(arr)]);
		
	}
	
	public static int findPeak(int arr[]) {
		
		int start = 0;
		int end = arr.length -1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] > arr[mid+1]) {
				end = mid;
			} else if(arr[mid] < arr[mid+1]) {
				start = mid+1;
			}
		}
		return start;
		
		
	}

}
