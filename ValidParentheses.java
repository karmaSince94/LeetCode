package com.vinay.practice.lc;

import java.util.Stack;

/*
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * An input string is valid if:
 * - Open brackets must be closed by the same type of brackets.
 * - Open brackets must be closed in the correct order.
 * 
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Input: s = "(]"
 * Output: false
 * 
 */

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "[])";
		isValid(str);

	}
	
	 public static void isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] charArr = s.toCharArray();
        char temp = ' ';
        boolean valid = false;
        System.out.println(charArr);
        
//        if(charArr[0] == '}' || charArr[0] == ']' || charArr[0] == ')')
//        	System.out.println(valid);
        
        for (char c : charArr) {
        	
        	if(stack.isEmpty() && (c == '}' || c == ']' || c == ')') ) {
        		valid = false;
        		break;
        	}
        	
        	if(c == '{' || c == '[' || c == '(') {
        		stack.push(c);
        	} else if( !stack.isEmpty() && (c == '}' || c == ')' || c == ']') ) {
        		temp = stack.peek();
        		if(c == '}' && temp+2 == c) {
        			valid = true;
        			stack.pop();
        		} else if(c == ']' && temp+2 == c) {
        			valid = true;
        			stack.pop();
        		} else if(c == ')' && temp+1 == c) {
        			valid = true;
        			stack.pop();
        		} else {
        			valid = false;
        			break;
        		}
        	}
			System.out.println(stack.toString());
		}
        
        System.out.println(valid && stack.isEmpty());
      
    }

}
