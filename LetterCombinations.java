package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

	
	private static String[] keypad = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(letterCombinations("23"));

	}
	
	public static List<String> letterCombinations(String digits) {
		
		
		List<String> combination = new ArrayList<>();
		if(digits.isEmpty()) {
			return combination;
		}
		getCombinations(digits, 0, new StringBuilder(), combination);
		return combination;
        
    }
	
	// backtracking
	public static void getCombinations(String digits, int index, StringBuilder sb, List<String> combination){
		
		if(digits.length() == index) {
			
			combination.add(sb.toString());
			return;
			
		}
		
		int digit = digits.charAt(index) - '0'; // convert '2' to 2
		
		for(int i=0; i<keypad[digit].length(); i++) {
			
			sb.append(keypad[digit].charAt(i));
			getCombinations(digits, index+1, sb, combination);
			sb.deleteCharAt(sb.length()-1);
			
			
		}
		
		
	}

}
