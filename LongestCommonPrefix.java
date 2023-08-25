package com.vinay.practice.lc;

/*
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"flower", "flow", "flight", "flodi", "flight2", "flight3"};
		String prefix = strArray[0];
		
		for(int i=1; i<strArray.length; i++) {
			// System.out.println(strArray[i]);
			while(strArray[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty())
					return ;
			}
			
		}
		System.out.println(prefix);
		
		
	}

}
