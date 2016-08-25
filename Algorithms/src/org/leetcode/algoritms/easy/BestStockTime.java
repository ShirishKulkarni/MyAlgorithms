package org.leetcode.algoritms.easy;

import java.util.Arrays;

public class BestStockTime {

	public static void main(String[] args) {
		int[] temp = {5,1,2,3,8};//{ 2, 6, 1, 7, 3, 4, 4, 8 };

		System.out.println(maxProfit(temp));
	}

	public static int maxProfit(int[] prices) {
		int prof = 0;
		int len = prices.length;
		int diff = 0;
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
			diff=Math.max(prices[j]-prices[i],diff);
			//System.out.println(diff);
			}
		}
		return diff;
	}
}
