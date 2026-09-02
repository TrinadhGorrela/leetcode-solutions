/**
 * 542. 01 Matrix
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Breadth-First Search, Matrix
 * https://leetcode.com/problems/01-matrix/
 *
 * Pattern: Two-Pass Dynamic Programming on a Grid
 * Key insight: Initialize every '1' cell to a sentinel (m*n, the maximum possible distance) and '0' cells to 0, then
 * sweep top-left to bottom-right and back bottom-right to top-left. Each pass propagates the nearest zero one step
 * further in its direction; two full passes cover all four cardinal directions, guaranteeing the Manhattan distance to
 * the closest zero is found.
 *
 * Time Complexity: O(M*N) - Two full passes over the M x N grid, each O(1) per cell.
 * Space Complexity: O(M*N) - The DP result matrix is the same size as the input.
 *
 * Edge Cases Handled: input containing no zeros (distances fill to m*n sentinel values, per problem guarantee this is
 * fine); input containing no ones (all distances zero); single-cell matrix; single-row or single-column matrix; cells
 * already containing a zero remain at distance 0.
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
