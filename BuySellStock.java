package com.vinay.practice.lc;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}
	
	public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        /*
        for (int i=0;i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){

                if(j>i && prices[j]-prices[i] > diff){
                    maxProfit = prices[j] - prices[i];
                }

            }
        }
        */

        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }

        }

        return maxProfit;

    }

}
