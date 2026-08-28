/**
 * 300. Longest Increasing Subsequence
 * Difficulty: Medium | Tags: Array, Binary Search, Dynamic Programming, Longest Increasing Subsequence
 * https://leetcode.com/problems/longest-increasing-subsequence/
 *
 * Pattern: Dynamic Programming (Quadratic LIS)
 * Key insight: dp[i] = LIS ending at i; for each i scan all earlier j and set dp[i] = max(dp[i], dp[j]+1) whenever nums[j] < nums[i]. (An O(N log N) patience-sorting variant also exists.)
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(N) - Uses a DP array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > res) {
                res = dp[i];
            }
        }
        return res;
    }
}
