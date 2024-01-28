package com.vinay.practice.lc;

public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
	
	public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum = 0;
            for(int j=i; j<nums.length; j++){
                sum = sum + nums[j];
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

}
