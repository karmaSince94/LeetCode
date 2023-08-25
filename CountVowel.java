package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/*
 * A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') 
 * and has all five vowels present in it.
 * 
 * Given a string word, return the number of vowel substrings in word.
 * 
 * Input: word = "aeiouu"
 * Output: 2
 */
public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "cuaieuouac";
		StringBuilder sb = null;
		HashSet<String> vowelWords = new HashSet<String>();
		
		for(int i=0; i<word.length(); i++) {
			sb = new StringBuilder();
			for(int j=i; j<word.length(); j++) {
				if(checkVowel(word.charAt(j))) {
					System.out.println(j);
					sb.append(word.charAt(j));
				} else {
					break;
				}
			}
			if(!sb.toString().isEmpty() && checkAllVowel(sb.toString())) {
				vowelWords.add(sb.toString());
				System.out.println(sb.toString());
			}
			
		}
		
	}
	
	public static Boolean checkVowel(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
			return true;
		}
		return false;
	}
	
	public static Boolean checkAllVowel(String str) {
		
		String[] vowel = new String[] {"a", "e", "i", "o", "u"};
		
		if(str.length() >= 5) {
			int counter = 0;
			for(int i=0; i<str.length(); i++) {
				
			}
			
		}else {
			return false;
		}
		
		return false;
	}

}
