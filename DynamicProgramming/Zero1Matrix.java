/**
 * 542. 01 Matrix
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Breadth-First Search, Matrix
 * https://leetcode.com/problems/01-matrix/
 *
 * Pattern: Dynamic Programming (Two-Pass Propagation)
 * Key insight: Initialize 1-cells with a large sentinel, then propagate distances with a forward top-left pass followed by a backward bottom-right pass, taking the minimum at each cell.
 *
 * Time Complexity: O(m*n) - Two-pass dynamic programming (forward and backward pass over the grid)
 * Space Complexity: O(1) - Excluding the output matrix, no extra auxiliary space is used
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class Matrix01 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    dp[i][j] = m * n;
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (dp[i][j] != 0) {
                    if (i > 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                    }

                    if (j > 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                    }
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (dp[i][j] != 0) {
                    if (i < m - 1) {
                        dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
                    }

                    if (j < n - 1) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                    }
                }
            }
        }
        return dp;
    }
}
