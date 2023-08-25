package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 */
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fsdfsd");
		TwoSum obj = new TwoSum();
		
		int arr[] = {3,2,4};
		int indexes[] = {};
		
		indexes = obj.twoSum(arr, 6);
		for (int i : indexes) {
			System.out.print(i);
		}
		
		
	}
	
//	int[] twoSum(int arr[], int target){
//		for (int i=0; i<arr.length ; i++) {
//			for(int j = i+1; j<arr.length; j++) {
//				if (arr[i] + arr[j] == target) {
//					return new int[] {i,j};
//				}
//			}
//		}
//		
//		return null;
//	}
	
	int[] twoSum(int arr[], int target){
		Map<Integer, Integer> indexes = new HashMap<Integer, Integer>();
		
		for (int i=0; i<arr.length ; i++) {
			indexes.put(arr[i], i);
		}
		
		for(int i=0; i<arr.length; i++) {
			int complement = target - arr[i];
			if(indexes.containsKey(complement) && indexes.get(complement) != i) {
				return new int[] {indexes.get(complement), i};
			}
		}
		return null;
	}
	
	

}
