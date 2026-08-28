/**
 * 62. Unique Paths
 * Difficulty: Medium | Tags: Math, Dynamic Programming, Combinatorics
 * https://leetcode.com/problems/unique-paths/
 *
 * Pattern: Dynamic Programming (Grid Counting)
 * Key insight: dp[i][j] = number of ways to reach cell (i,j), equal to the sum of the ways from the cell above and the cell to the left; edges are seeded to 1.
 *
 * Time Complexity: O(M * N) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(M * N) - Allocates a full 2D DP grid
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
