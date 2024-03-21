package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/description/


public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] {1,2,3};
		subsetArrayInt(nums);

	}
	
	// loop solution
	public static List<List<Integer>> subsetArrayInt(int[] nums) {
        
		List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());

        for (int j : nums) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> i : arr) {
                List<Integer> subset = new ArrayList<>(i);
                subset.add(j);
                temp.add(subset);
            }
            arr.addAll(temp);
            System.out.println(arr);
        }
        return arr;
		
    }
	
	// Backtracking solution
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll= new ArrayList<>();
        sub(nums,ll,new ArrayList<>(),0);
        return ll;
    }
    public static void sub(int[] nums,List<List<Integer>> ll,List<Integer> result,int idx){
        ll.add(new ArrayList<>(result));
        for(int i=idx;i<nums.length;i++){
            // adding element
            result.add(nums[i]);
            sub(nums,ll,result,i+1);  //i+1 for unique elements 
            // removing element (backtracking)     
            result.remove(result.size()-1);
        }
        
    }
	
}
