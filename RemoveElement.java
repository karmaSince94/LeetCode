package com.vinay.practice.lc;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		int element = 2;
		System.out.println("Number of unique : " + removeElement(nums, element));
	}
	
	public static int removeElement(int[] nums, int val) {
		
		if(nums.length == 0)
            return 0;
		
		int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
