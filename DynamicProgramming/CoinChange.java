/**
 * 322. Coin Change
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Breadth-First Search, Knapsack Problem, Complete Knapsack
 * https://leetcode.com/problems/coin-change/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(amount * coins.length) - DP states and transitions
 * Space Complexity: O(amount) - DP array size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] res = new int[amount + 1];
        res[0] = 0;
        for (int i = 1; i < res.length; i++) {
            res[i] = Integer.MAX_VALUE;
        }

        for (int amt = 1; amt <= amount; amt++) {
            for (int i = 0; i < coins.length; i++) {
                if (coins[i] <= amt) {
                    int rem = amt - coins[i];

                    if (res[rem] != Integer.MAX_VALUE) {
                        res[amt] = Math.min(res[amt], res[rem] + 1);
                    }
                }
            }
        }
        return res[amount] != Integer.MAX_VALUE ? res[amount] : -1;
    }
}
