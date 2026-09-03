/**
 * 542. 01 Matrix
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Breadth-First Search, Matrix
 * https://leetcode.com/problems/01-matrix/
 *
 * Pattern: Multi-Source Distance Propagation (4-Pass DP)
 * Key insight: Initialize every 1-cell to m*n (an effective infinity) and every 0-cell to 0, then propagate minimum distances in four directional passes: top-left to bottom-right (uses top and left neighbors), then bottom-right to top-left (uses bottom and right neighbors). Because every 0-cell starts at 0, distances ripple outward in exactly the right order without needing a BFS queue.
 *
 * Time Complexity: O(m * n) - Four passes each touching every cell exactly once
 * Space Complexity: O(m * n) - Reuses the dp array (same size as input matrix)
 *
 * * Edge Cases Handled: all-zero matrix (output unchanged); all-one matrix (distances grow outward correctly); single row or single column; 1x1 matrix
 */
class ZeroOneX {
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
