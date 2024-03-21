package com.vinay.practice.lc;

import java.util.HashMap;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/editorial/

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
		
		System.out.println(lengthOfLongestSubstring2(s));

	}
	
	public static int lengthOfLongestSubstring(String s) {
        int i=0;
        int length = 0;
        int lengthLongest = Integer.MIN_VALUE;
        Set<Character> charSet = new HashSet<Character>();
        
        if(s.length() <= 0) {
        	return lengthLongest;
        }
        while(i < s.length()) {
        	
        	if(charSet.contains(s.charAt(i))) {
        		length = charSet.size();
        		i = Math.abs(charSet.size() - i) + 1;
        		charSet = new HashSet<Character>();
        		
        	} else {
        		charSet.add(s.charAt(i));
        		length = charSet.size();
        		i++;
        	}
        	
        	if(length > lengthLongest ) {
        		lengthLongest = length;
        	}
        	
        	
        }
		
		return lengthLongest;
    }
	
	public static int lengthOfLongestSubstring2(String s) { 
        int left = 0;
        int right = 0;
        int length = 0;
        Map<Character, Integer> charMap = new HashMap<>(); // character and occurrence
        
        if(s.length() <= 0) {
        	return length;
        }
        
        while(right < s.length()) {
        	
        	Character r = s.charAt(right);
        	charMap.put(r, charMap.getOrDefault(r, 0) + 1);
        	
        	while(charMap.get(r) > 1) {
        		char l = s.charAt(left);
        		charMap.put(l, charMap.get(l)-1);
        		left++;
        	}
        	
        	length = Math.max(length, right-left+1);
        	
        	right++;
        	
        }
		
		return length;
    }

}
