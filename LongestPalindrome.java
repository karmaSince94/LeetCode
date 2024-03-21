package com.vinay.practice.lc;

import java.util.HashMap;
import java.util.Map;


public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("avscvfdbbbba")); 

	}
	
	public static String longestPalindrome(String s) {
		
		int start = 0;
		int end = 1;
		int n =s.length();
		int low, high;
		
		for(int i=0; i<n; i++) {
			
			// tackle even palin substring bbaabb  avscvfdbbbba
			low = i-1;
			high = i;
			while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
				
				if(high-low+1 > end) {
					start = low;
					end = high-low+1;
				}
				low--;
				high++;
				
			}
			
			// tackle odd palin string racecar
			low = i-1;
			high = i+1;
			while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
				if(high-low+1 > end) {
					start = low;
					end = high-low+1;
				}
				low--;
				high++;
			}
			
		}
		
		return getSubstring(s, start, start+end-1);
		
	}
	
	public static String getSubstring(String s, int start, int end) {
		
		StringBuilder sb = new StringBuilder();
		while(start <= end) {
			sb.append(s.charAt(start));
			start++;
		}
		return sb.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void longestPalindromeTle(String s) {
        
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer length;
		for(int i=0; i<s.length(); i++) {
			
			for(int j=i+1; j<=s.length(); j++) {
				
				String sub = s.substring(i,j);
				if(isPalindrome(sub)) {
					length = sub.length();
					map.put(sub, length);
				}
			}
			
		}
		
		String keyFinal = null;
		Integer tempVal = Integer.MIN_VALUE;
		System.out.println(map.entrySet().toString());
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			if(tempVal < val) {
				tempVal = val;
				keyFinal = key;
			}
			
			
		}
		
		System.out.println(keyFinal);
		
    }
	
	public static boolean isPalindrome(String s) {
		
		for(int i=0,j=s.length()-1; i<j; i++,j--) {
			if(s.charAt(i) == s.charAt(j)) {
				continue;
			} else {
				return false;
			}
			
		}
		return true;
		
	}

}
