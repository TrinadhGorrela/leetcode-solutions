/**
 * 73. Set Matrix Zeroes
 * Difficulty: Medium | Tags: Array, Hash Table, Matrix
 * https://leetcode.com/problems/set-matrix-zeroes/
 *
 * Pattern: Flag Arrays (Row / Column Marking)
 * Key insight: First scan records which rows and columns contain a zero in two boolean flags, then zero out entire marked rows and columns in a second pass.
 *
 * Time Complexity: O(M*N) - Visits every matrix element
 * Space Complexity: O(M+N) - Uses arrays to track rows and columns to be zeroed
 *
 * Edge Cases Handled: no zeros (unchanged matrix), already all zeros, single zero, single row / single column, zeros already in flagged cells
 */
class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (row[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (col[j]) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
