package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Given a sequence of words written in the alien language, and the order of the alphabet, 
 * return true if and only if the given words are sorted lexicographically in this alien language.
 * 
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 */

public class AlienDict {

	public static void main(String[] args) {
		
		// String[] words = {"hello", "leetcode"};
		//String order = "hlabcdefgijkmnopqrstuvwxyz";
		
		//String[] words = {"word","world","row"};
		//String order = "worldabcefghijkmnpqstuvxyz";
		
		//String[] words = {"apple","app"};
		//String order = "abcdefghijklmnopqrstuvwxyz";
		
		String[] words = {"app", "apple"};
		String order = "abcdefghijklmnopqrstuvwxyz";
		boolean val = isAlienSorted(words, order);
		if(!val)
			System.out.println("It's an alien val - FALSE");
		else
			System.out.println("Not an alien val - TRUE");
		
		
	}
	
	public static boolean isAlienSorted(String[] words, String order) {
        
		HashMap<String, Integer> orderMap = new HashMap<String, Integer>();
		List<String> orderList = Arrays.asList(order.split(""));
		Integer counter = 0;
		boolean flag = true;
		for (String string : orderList) {
			orderMap.put(string, ++counter);
		}
		
		for(int i=0; i<words.length-1; i++) {

			// System.out.println(words[i].charAt(j));
			// Integer length = words[i].length() > words[i+1].length() ? words[i].length() : words[i+1].length();
			
			for(int j=0; j<words[i].length(); j++)	{
				
				if(j >= words[i+1].length())
					return false;
				
				if(orderMap.get(String.valueOf(words[i].charAt(j))) < orderMap.get(String.valueOf(words[i+1].charAt(j)))) {
					flag = true;
					break;
				} else if(orderMap.get(String.valueOf(words[i].charAt(j))) == orderMap.get(String.valueOf(words[i+1].charAt(j)))) {
					continue; 
				} else if(orderMap.get(String.valueOf(words[i].charAt(j))) > orderMap.get(String.valueOf(words[i+1].charAt(j)))) {
					return false;
				}
			}
			
			
		}
		
		return flag;
    }
	

}
