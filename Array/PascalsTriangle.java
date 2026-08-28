/**
 * 118. Pascal's Triangle
 * Difficulty: Easy | Tags: Array, Dynamic Programming
 * https://leetcode.com/problems/pascals-triangle/
 *
 * Pattern: Dynamic Programming (Reuse Previous Row)
 * Key insight: Build each row from the previous one, where every interior value is the sum of the two values directly above it, and edges are 1.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(N^2) - Builds the entire triangle
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0)
            return res;
        List<Integer> Fir = new ArrayList<>();
        Fir.add(1);
        res.add(Fir);
        if (numRows == 1)
            return res;
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = res.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(prev.get(j) + prev.get(j + 1));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}
