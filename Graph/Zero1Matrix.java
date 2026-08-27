/**
 * 542. 01 Matrix
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Breadth-First Search, Matrix
 * https://leetcode.com/problems/01-matrix/
 *
 * Pattern: Multi-source BFS
 * Key insight: Start BFS from all 0s simultaneously to find shortest path to 1s
 *
 * Time Complexity: O(R * C) - Visit every cell in the matrix
 * Space Complexity: O(R * C) - Queue can contain all cells in worst case
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class Zero1Matrix {
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
