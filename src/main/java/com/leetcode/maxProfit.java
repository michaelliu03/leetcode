package com.leetcode;

public class maxProfit {
    public int maxProfit(int[] prices) {
        // method 2:
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i=0; i< prices.length; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }else if(prices[i] - minprice > maxprofit){
                maxprofit = prices[i] -minprice;
            }
        }
        return maxprofit;
    }
}
