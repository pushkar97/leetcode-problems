package com.github.pushkar97;

/**
 * Problem: <a
 * href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">best-time-to-buy-and-sell-stock</a>
 *
 * @author pushkardesai
 */
public class P121 {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int start = Integer.MAX_VALUE;
    for (int price : prices) {
      start = Math.min(start, price);
      maxProfit = Math.max(price - start, maxProfit);
    }
    return maxProfit;
  }
}
