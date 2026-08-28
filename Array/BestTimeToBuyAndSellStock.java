/**
 * 121. Best Time to Buy and Sell Stock
 * Difficulty: Easy | Tags: Array, Dynamic Programming
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Pattern: One-Pass Min Tracking (Greedy)
 * Key insight: Track the minimum price seen so far and compute the maximum profit by taking each price as the sell price, updating profit = max(profit, price - minPrice) on the fly.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
