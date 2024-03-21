package com.vinay.practice.lc;


// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

public class NumOfSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {2,2,2,2,5,5,5,8};
		System.out.println(numOfSubarrays(arr, 3, 4));

	}
	
	public static int numOfSubarrays(int[] arr, int k, int threshold) {
		
		int i = 0;
		int avg = 0;
		int sum = 0;
		int count = 0;
		
		while(i < k) {
			sum = sum + arr[i];
			i++;
		}
		avg = sum / k;
		
		if(avg >= threshold) {
			count++;
		}
			
		while(i < arr.length) {
			
			sum += arr[i] - arr[i-k];
			avg = sum / k;
			if(avg >= threshold) {
				count++;
			}
			i++;
		}
		
		return count;
        
    }

}
