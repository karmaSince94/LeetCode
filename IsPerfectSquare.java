package com.vinay.practice.lc;

public class IsPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectSquare(808201));

	}
	
	public static boolean isPerfectSquare(int num) {
		
		if(num < 2)
			return true;
		
		long start = 1;
		long end = num / 2;
		
		while(start <= end) {
			long mid = start + (end - start)/2;
			long result = mid*mid;
			
			if(result > num) {
				end = mid-1;
			} else if(result < num) {
				start = mid+1;
			} else {
				return true;
			}
		}
        return false;
    }

}
