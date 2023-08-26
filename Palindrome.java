package com.vinay.practice.lc;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(int x) {
		int rem, temp = 0;
        int num = x;

        while(x > 0){
            rem = x % 10;
            temp = (temp*10) + rem;
            x = x/10;
        }

        if(num == temp)
            return true;
        else 
            return false;
        			
    }

}
