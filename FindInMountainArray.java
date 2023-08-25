package com.vinay.practice.lc;

// https://leetcode.com/problems/find-in-mountain-array/description/

public class FindInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-gerated method stub
		
		int arr[] = {1,2,3,4,5,3,1};
		//int ele = 3;
		
		//int arr[] = {0,1,2,4,2,1};
		int ele = 3;
		
		int found = -1;
		
		
		int peakIndex = findPeak(arr);
		found = orderAgnosticBS(arr, 0, peakIndex, ele);
		if(found == -1) {
			found = orderAgnosticBS(arr, peakIndex, arr.length-1, ele);
		}
		System.out.println("Found at : " + found);
		

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

	public static int orderAgnosticBS(int[] arr, int start, int end, int target) {
		
		// int start = 0;
		// int end = arr.length-1;
		
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
	
	
	/*
	 
	//  Leetcode solution
	 
	class Solution {
		    public int findInMountainArray(int target, MountainArray mountainArr) {
		        int peakIndex = findPeak(mountainArr);
						int found = -1;
						found = orderAgnosticBS(mountainArr, 0, peakIndex, target);
						if(found == -1) {
						found = orderAgnosticBS(mountainArr, peakIndex, mountainArr.length()-1, target);
					}
					return found;
	    }
	
	    public static int findPeak(MountainArray mountainArr) {
			
			int start = 0;
			int end = mountainArr.length()-1;
			
			while(start < end) {
				int mid = start + (end - start)/2;
				
				if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
					end = mid;
				} else if(mountainArr.get(mid) < mountainArr.get(mid+1)) {
					start = mid+1;
				}
			}
			return start;
			
			
		}
	
		public static int orderAgnosticBS(MountainArray mountainArr, int start, int end, int target) {
			
			// int start = 0;
			// int end = arr.length-1;
			
			boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
			
			while(start <= end) {
				// System.out.println("s");
				int mid = start + (end-start) / 2;
	    
				if(mountainArr.get(mid) == target) {
					return mid;
				}
				
				if(isAsc) {
					if(target < mountainArr.get(mid)) {
						end = mid-1;
					} else if(target > mountainArr.get(mid)) {
						start = mid+1;
					}
				} else {
					if(target > mountainArr.get(mid)) {
						end = mid-1;
					} else if(target < mountainArr.get(mid)) {
						start = mid+1;
					}
				}
				 
			}
			return -1;
		}
	}
	 
	*/

}
