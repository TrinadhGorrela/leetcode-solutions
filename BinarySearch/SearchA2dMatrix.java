/**
 * 74. Search a 2D Matrix
 * Difficulty: Medium | Tags: Array, Binary Search, Matrix
 * https://leetcode.com/problems/search-a-2d-matrix/
 *
 * Pattern: Binary Search (Flatten 2D to 1D)
 * Key insight: Map each flat index to a (row, col) pair with division/modulo by the column count, then run a standard binary search over the conceptually flattened sorted matrix.
 *
 * Time Complexity: O(log N) - Search space is halved per iteration in a monotonic sequence
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: target not found (returns false), single row or single column, target at matrix corners
 */
class SearchA2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix[0].length * matrix.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
