/**
 * 1572. Matrix Diagonal Sum
 * Difficulty: Easy | Tags: Array, Matrix
 * https://leetcode.com/problems/matrix-diagonal-sum/
 *
 * Pattern: Matrix Diagonal Summation
 * Key insight: Add cells on either main diagonal (i==j or i+j == n-1); the two diagonals share only the center on odd n, keeping the sum single-counted via the inclusive condition.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
