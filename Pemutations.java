package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/permutations/description/
// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]


public class Pemutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3};
		
		String numbers = Arrays.toString(nums).replaceAll("[^\\d\\s]", "").replace(" ", "");	
		printStringPermutations("", numbers);
		
		System.out.println("List of permutations string : " + stringPermutationsList("", numbers ));
		
		
		List<List<Integer>> list = new ArrayList<>();
		permuteArrayInt(new ArrayList<Integer>() , list, nums);
		System.out.println("List of list of permutations string : ");
		list.forEach(e -> System.out.println(e));

	}
	
	
	public static void permuteArrayInt(List<Integer> curr, List<List<Integer>> list, int[] nums) {
        
		if(curr.size() == nums.length) {
			list.add(new ArrayList<>(curr));
			return;
		}
		
		for (int num : nums) {
			if(!curr.contains(num)) {
				
				curr.add(num);
				permuteArrayInt(curr, list, nums);
				curr.remove(curr.size()-1);
				
			}
		}
		
    }

	
	public static void printStringPermutations(String p, String up) {
        
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		for(int i=0; i<=p.length(); i++) {
			
			String first = p.substring(0,i);
			String second = p.substring(i, p.length());
			printStringPermutations(first + ch + second, up.substring(1));
			
		}
				
    }
	
	
	public static ArrayList<String> stringPermutationsList(String p, String up) {
        
		if (up.isEmpty()) {
			System.out.println(p);
			ArrayList<String> temp = new ArrayList<>();
			temp.add(p);
			return temp;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		char ch = up.charAt(0);
		
		for(int i=0; i<=p.length(); i++) {
			
			String first = p.substring(0,i);
			String second = p.substring(i, p.length());
			list.addAll(stringPermutationsList(first + ch + second, up.substring(1)));
			
		}
		return list;
				
    }
	

}
