/**
 * 867. Transpose Matrix
 * Difficulty: Easy | Tags: Array, Matrix, Simulation
 * https://leetcode.com/problems/transpose-matrix/
 *
 * Pattern: Index Swap (Transposition)
 * Key insight: Exchange roles of rows and columns by writing matrix[i][j] into res[j][i], producing a result of swapped dimensions.
 *
 * Time Complexity: O(M*N) - Visits every matrix element
 * Space Complexity: O(M * N) - Allocates a 2D array for the transposed matrix
 *
 * Edge Cases Handled: single row / single column, non-square matrices (swapped dimensions), 1x1 matrix
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
