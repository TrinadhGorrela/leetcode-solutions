/**
 * 64. Minimum Path Sum
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Matrix
 * https://leetcode.com/problems/minimum-path-sum/
 *
 * Pattern: Dynamic Programming (2D Grid)
 * Key insight: dp[i][j] = minimum sum to reach (i,j); at each cell add its value to the smaller of the sums from the top and left neighbors.
 *
 * Time Complexity: O(M * N) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(M * N) - Allocates a full 2D DP grid
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i][j - 1] + grid[i][j], dp[i - 1][j] + grid[i][j]);
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
