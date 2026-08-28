/**
 * 746. Min Cost Climbing Stairs
 * Difficulty: Easy | Tags: Array, Dynamic Programming
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 *
 * Pattern: Dynamic Programming (1D Bottom-up)
 * Key insight: dp[i] = minimum cost to reach step i, computed as min(cost[i-1] + dp[i-1], cost[i-2] + dp[i-2]); answer is the cost to pass the last step.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses a DP array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(cost[i - 1] + dp[i - 1], cost[i - 2] + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}
