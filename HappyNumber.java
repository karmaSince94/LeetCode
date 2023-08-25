package com.vinay.practice.lc;

import java.util.HashSet;

// https://leetcode.com/problems/happy-number/description/


public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is happy : " + 19 + " ? = " + isHappy(19));
	}
	public static boolean isHappy(int n) {
        // int squaredSum = 0;
        HashSet<Integer> sumList = new HashSet<>();

        while(n != 1 && !sumList.contains(n)){
            System.out.println(n);
            sumList.add(n);
            n = getSquaredSum(n);

        }
        if(n == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int getSquaredSum(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans + (rem*rem);
            n = n / 10;
        }
        return ans;
    }

}
