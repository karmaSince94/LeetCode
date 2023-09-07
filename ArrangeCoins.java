package com.vinay.practice.lc;

public class ArrangeCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangeCoins(8));
	}
	
	public static int arrangeCoins(int n) {
		
		/*
		// O(n)
		long temp = 0, i=0;
        while(temp < n){
        	i=i+1;
            temp = temp + i;
        }
        if((temp - n) == 0){
            return (int)i;
        } else{
            return (int)--i;
        }
        */
		
		
		long start = 1;
		long end = n;
		
		while(start <= end) {
		
			long mid = start + (end-start)/2;
			long currSum = mid * (mid + 1) / 2;
			
			if(currSum == n)
				return (int)mid;
			
			if(currSum > n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			
		}
		return (int)end;
		
    }

}
