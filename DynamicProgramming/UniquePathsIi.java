/**
 * 63. Unique Paths II
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Matrix
 * https://leetcode.com/problems/unique-paths-ii/
 *
 * Pattern: Dynamic Programming (2D Grid with Obstacles)
 * Key insight: Same grid-counting as Unique Paths, but obstacle cells are forced to 0 ways and the top/left edges stop propagating past a blocked cell.
 *
 * Time Complexity: O(M * N) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(M * N) - Allocates a full 2D DP grid
 *
 * Edge Cases Handled: obstacle at start cell (returns 0), obstacle at end, fully blocked path (returns 0), single row or single column with obstacles
 */
class UniquePathsIi {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
