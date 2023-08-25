package com.vinay.practice.lc;

/*
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string
 * 
 * Input: s = "Hello World"
 * Output: 5
 * 
 * 
 */

public class LengthOfLastWord {

	public static void main(String[] args) {

//		String s = "Hello World";
//		String[] strArray = s.split(" ");
//		System.out.println(strArray[strArray.length-1].trim().length());
		
		String s = "sdsds hellow worldd";
		//System.out.println(s.length());
		int last = s.length()-1;
		int count = 0;
		while(last>=0 && s.charAt(last) == ' ') {
			last--;
		}

		while( last>=0 && s.charAt(last) != ' ' ) {
			count++;
			last--;
		}
		System.out.println(count);
		
		
		
	}

}
