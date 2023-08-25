package com.vinay.practice.lc;

public class FloorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,3,5,9,14,16,18};
		int target = 14;
		
		System.out.println("The ceiling of the number is: " + arr[findFloor(arr, target)]);
		
	}
	
	public static int findFloor(int[] arr, int target) {
		
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
		return end;
	}

}
