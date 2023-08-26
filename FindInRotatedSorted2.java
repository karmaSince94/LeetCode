package com.vinay.practice.lc;

public class FindInRotatedSorted2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int nums[] = {2,5,6,0,0,1,2};
		int nums[] = {1,1,3};
		int target = 0;
		int pos = -1;
		
		// find pivot
		// then search in left or right of pivot
		
		int pivot = findPivot(nums);
		
		if (pivot == -1) {
			pos = binarySearch(nums, 0, nums.length-1, target);
		} else if (nums[pivot] == target) {
			System.out.println("The target element was found: " + true);
		} else if (target >= nums[0]) {
			pos = binarySearch(nums, 0, pivot-1, target);
		} else {
			pos = binarySearch(nums, pivot+1, nums.length-1, target);
		}
		if(pos != -1) {
			System.out.println("The target element was found " + true);
		} else {
			System.out.println("The target element was found " + false);
		}
		
	}
	
	
	
	public static int findPivot(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		
		if(arr.length == 1) {
			return -1;
		}
		while(start <= end) {
			
			int mid = start + (end-start)/2;
			
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			
			// skip the duplicates
			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
				if(start < end && arr[start] > arr[start+1]) {
					return start;
				}
				start++;
				
				if(end > start && arr[end] < arr[end-1]) {
					return end-1;
				}
				end--;
			} else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				// left side is sorted so pivot should be in right
				start = mid+1;
			} else {
				end = mid-1;
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
