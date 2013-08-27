/*
 * Best Time to Buy and Sell Stock - Oct 30 '12 - 7527 / 16932
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.
 * 
 */

package BestTimetoBuyandSellStock;

// AC on 1st try
public class Solution {
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) return 0;
		int max = 0, min = prices[0];
		for(int i = 1; i < prices.length; i++) {
			if(prices[i] > min && prices[i] - min > max) max = prices[i] - min;
			else if(prices[i] < min) min = prices[i];
		}
		return max;
	}
}
