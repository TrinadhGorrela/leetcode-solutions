/**
 * 59. Spiral Matrix II
 * Difficulty: Medium | Tags: Array, Matrix, Simulation
 * https://leetcode.com/problems/spiral-matrix-ii/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(N^2) - Allocates the result 2D array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SpiralMatrixIi {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        int t = 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            for (int i = colBegin; i <= colEnd; i++) {
                res[rowBegin][i] = t++;
            }
            rowBegin++;

            for (int j = rowBegin; j <= rowEnd; j++) {
                res[j][colEnd] = t++;
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int k = colEnd; k >= colBegin; k--) {
                    res[rowEnd][k] = t++;
                }
                rowEnd--;
            }

            if (colBegin <= colEnd) {
                for (int s = rowEnd; s >= rowBegin; s--) {
                    res[s][colBegin] = t++;
                }
                colBegin++;
            }
        }
        return res;
    }
}
