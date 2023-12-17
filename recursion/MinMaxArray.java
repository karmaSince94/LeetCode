package com.vinay.practice.lc.recursion;

import java.util.Arrays;

// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/


public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 3, -5, -4, 8, 6};
		// int arr[] = {1, 4, 45, 6, 10, -8};
		
		// non rec
		int temp[] = findMinMax(arr);
		System.out.println("Max = " + temp[0] + " , Max = " + temp[1]);
		
		// rec
		int tempRec[] = findMinMaxRec(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println("\nRecursive\nMax = " + temp[0] + " , Max = " + temp[1]);
	}
	
	// non recursive
	public static int[] findMinMax(int arr[]) {
		
		int temp[] = {Integer.MAX_VALUE, Integer.MIN_VALUE};
		
		if(arr.length < 1) {
			temp[0] = arr[0];
			temp[1] = arr[1];
			return temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			temp[0] = Math.min(temp[0], arr[i]);
			temp[1] = Math.max(temp[1], arr[i]);
		}
		
		return temp;
		
	}
	
	// recursive
	public static int[] findMinMaxRec(int a[], int i, int small, int large ) {
		if(i == a.length) {
			return new int[] {small, large};
		}
		
		return findMinMaxRec(a, i+1, Math.min(a[i], small), Math.max(a[i], large));
		
	}


}
