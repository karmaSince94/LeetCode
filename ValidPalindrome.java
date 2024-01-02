package com.vinay.practice.lc;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 'a';
		System.out.println(a);
		
		String str = "A man, a plan, a canal: Panama";
		String str2 = "race a car";
		// System.out.println(validPalindrome(str));
		// System.out.println(validPalindrome(str2));
		
		
		System.out.println(validPalindromeRecCall(str));
	}
	
	public static boolean validPalindrome(String s) {
		
		if(s.isEmpty())
			return true;
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.toLowerCase();
		
		for(int i=0,j=s.length()-1; i<s.length()/2; i++,j--) {
			
			if(s.charAt(i) == s.charAt(j)) {
				System.out.println("charAt[i] = " + s.charAt(i) + ", charAt[j] = " + s.charAt(j));
				continue;
			} else {
				System.out.println("charAt[i] = " + s.charAt(i) + ", charAt[j] = " + s.charAt(j));
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean validPalindromeRecCall(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.toLowerCase();
		
		if(s.isEmpty())
			return true;
		
		return validPalindromeRec(s,0,s.length()-1);
	}
	
	public static boolean validPalindromeRec(String s, int first, int last) {
		
		if(first == last)
			return true;
		
		if(s.charAt(first) != s.charAt(last))
			return false;
		
		if(first < last)
			return validPalindromeRec(s, ++first, --last);
		
		return true;
		
	}
	
	

}
