package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/group-anagrams/description/


public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(strs));

	}
	
	public static List<List<String>> groupAnagrams(String[] strs){
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		for (String word : strs) {
			
			char[] temp = word.toCharArray();
			Arrays.sort(temp);
			String str = new String(temp);
		
			if(!map.containsKey(str)) {
				map.put(str, new ArrayList<String>());
			}
			map.get(str).add(word);
			
		}
		
		return new ArrayList<List<String>>(map.values());
		
	}
 
}
