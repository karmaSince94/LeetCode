package com.vinay.practice.lc;


/*
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 */

public class StrStr {

	public static void main(String[] args) {

		String haystack = "hello";
		String needle = "ll";
        if(haystack.indexOf(needle) >= 0){
            System.out.println(haystack.indexOf(needle));
        } else {
            System.out.println("-1");;
        }
		
		
	}

}
