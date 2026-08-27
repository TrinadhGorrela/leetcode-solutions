/**
 * 518. Coin Change II
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Knapsack Problem, Complete Knapsack
 * https://leetcode.com/problems/coin-change-ii/
 *
 * Pattern: 1D DP Knapsack
 * Key insight: Iterate coins and accumulate ways to make each amount
 *
 * Time Complexity: O(C * A) - C coins and A amount
 * Space Complexity: O(A) - 1D DP array of size amount + 1
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class CoinChangeIi {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int amt = coins[i]; amt < dp.length; amt++) {
                int rem = amt - coins[i];
                dp[amt] += dp[rem];
            }
        }

        return dp[amount];
    }
}
