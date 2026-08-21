/**
 * 867. Transpose Matrix
 * Difficulty: Easy | Tags: Array, Matrix, Simulation
 * https://leetcode.com/problems/transpose-matrix/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(M * N) - Allocates a 2D array for the transposed matrix
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] res = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
