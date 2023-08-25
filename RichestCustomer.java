package com.vinay.practice.lc;


// https://leetcode.com/problems/richest-customer-wealth/
/*
 * get sum of each row and compare
 */
public class RichestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] accounts = {{1,2,3},{3,2,1}};
		// int[][] accounts = {{1,5}, {7,3}, {3,5}};
		int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}};
		System.out.println("The customer with the richest wealth is : " + maximumWealth(accounts));
	}
	
	static int maximumWealth(int[][] accounts) {
		int tempWealth = 0, wealth = 0;
		
		for (int row = 0; row < accounts.length; row++) {
			tempWealth = 0;
			for (int col = 0; col < accounts[row].length; col++) {
				tempWealth += accounts[row][col];
			}
			if(tempWealth > wealth)
				wealth = tempWealth;
			
		}
		return wealth;
	}

}
