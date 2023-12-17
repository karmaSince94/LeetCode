package com.vinay.practice.lc.recursion;

// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

public class FirstUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geek for Geeks";
		Character c = findUpper(str, 0);
		System.out.println("Char is : " + c);
	}
	
	public static Character findUpper(String str, int i) {
		if(Character.isUpperCase(str.charAt(i))) {
			return str.charAt(i);
		}
		
		if(i != str.length()) {
			return findUpper(str, i+1);
		}else {
			return 0;
		}
			
		
	}

}
