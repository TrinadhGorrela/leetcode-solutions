/**
 * 54. Spiral Matrix
 * Difficulty: Medium | Tags: Array, Matrix, Simulation
 * https://leetcode.com/problems/spiral-matrix/
 *
 * Pattern: Boundary Shrinking (Spiral Simulation)
 * Key insight: Walk four edges of the current bounds (top, right, bottom, left), shrink the bounds inward each lap, guarding the bottom/left passes for single-row or single-column cases.
 *
 * Time Complexity: O(M * N) - Traverses every element in the M x N matrix exactly once
 * Space Complexity: O(M * N) - Stores all matrix elements in the output list
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowbegin = 0;
        int rowend = matrix.length - 1;
        int colbegin = 0;
        int colend = matrix[0].length - 1;

        while (rowbegin <= rowend && colbegin <= colend) {
            for (int i = colbegin; i <= colend; i++) {
                res.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            for (int j = rowbegin; j <= rowend; j++) {
                res.add(matrix[j][colend]);
            }
            colend--;
            if (rowbegin <= rowend) {
                for (int k = colend; k >= colbegin; k--) {
                    res.add(matrix[rowend][k]);
                }
            }
            rowend--;
            if (colbegin <= colend) {
                for (int l = rowend; l >= rowbegin; l--) {
                    res.add(matrix[l][colbegin]);
                }
            }
            colbegin++;
        }
        return res;
    }
}
