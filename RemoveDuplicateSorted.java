package com.vinay.practice.lc;


// https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/

public class RemoveDuplicateSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println("Number of unique : " + removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
	        
        if(nums.length == 0)
            return 0;
        int j=1;
        for(int i=1; i<nums.length; i++){
            
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }

        }

        return j;

    }

}
