/**
 * 766. Toeplitz Matrix
 * Difficulty: Easy | Tags: Array, Matrix
 * https://leetcode.com/problems/toeplitz-matrix/
 *
 * Pattern: Diagonal Group Validation (Neighbor Comparison)
 * Key insight: Each cell must equal the cell one row down and one column right for all diagonals to match; comparing each cell against its lower-right neighbor suffices.
 *
 * Time Complexity: O(M*N) - Visits every matrix element
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: single row, single column, 1x1 matrix, all equal values, out-of-bounds avoided by length-1 loop bounds
 */
class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
            }
        }
        return true;
    }
}
