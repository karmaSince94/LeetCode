package com.vinay.practice.lc;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(int x) {
        int temp = 0;
        int rem = 0;
        while(x != 0) {
        	rem = x % 10;
        	x = x / 10;
        	temp = (temp*10) + rem; 
        			
        }
        if(temp == x)
        	return true;
        else
        	return false;
        			
    }

}
