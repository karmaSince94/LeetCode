package com.vinay.practice.lc;

import java.util.Arrays;
import java.util.Iterator;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		//int element = 2;
		
		System.out.println("Plus one to the array is: "+ Arrays.toString(plusOne(nums)));
	}

	public static int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1 ; i>=0 ; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits; 
            }

            // if any digit contains 9
            digits[i] = 0;

        }

        // if all digits were 9
        int newNum[] = new int[digits.length + 1];
        newNum[0] = 1;
        return newNum;


    }

}
