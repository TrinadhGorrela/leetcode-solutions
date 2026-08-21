/**
 * 240. Search a 2D Matrix II
 * Difficulty: Medium | Tags: Array, Binary Search, Divide and Conquer, Matrix
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(M+N) - Staircase search starting from top-right or bottom-left
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SearchA2dMatrixIi {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
