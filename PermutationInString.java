package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/permutation-in-string/description/


public class PermutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "adc";
		String s2 = "dcda";
		
//		String s1 = "ab";
//		String s2 = "eidboaoo";
		
//		String s1 = "prosperity";
//		String s2 = "properties";
		
		Map<Character, Integer> s1map = new HashMap<>();
		for(int i=0; i<s1.length(); i++) {
			s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0)+1);
		}
		
		for(int i=0; i<=s2.length()-s1.length(); i++) {
			
			Map<Character, Integer> s2map = new HashMap<>();
			
			for(int j=0; j<s1.length(); j++) {
				
				s2map.put(s2.charAt(i+j), s2map.getOrDefault(s2.charAt(i+j), 0)+1);
				
			}
			
			if(matches(s1map, s2map)) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
		
	}
	
	 public static boolean matches(Map<Character, Integer> s1map, Map<Character, Integer> s2map) {
        for (char key : s1map.keySet()) {
            if (s1map.get(key) - s2map.getOrDefault(key, -1) != 0)
                return false;
        }
        return true;
    }
	
	// results in TLE s1 = "prosperity"  s2 = "properties"
	public boolean checkInclusionFail(String s1, String s2) {
        ArrayList<String> s1List = stringPermutationsList("", s1);
		ArrayList<String> s2list = new ArrayList<>();
		for(int i=0; i+s1.length()<=s2.length(); i++) {
			s2list.add(s2.substring(i, i+s1.length()));
			
		}
		for (String string : s1List) {
			if(s2list.contains(string)) {
				return true;
			}
		}
		return false;
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
