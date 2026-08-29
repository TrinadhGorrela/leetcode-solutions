/**
 * 119. Pascal's Triangle II
 * Difficulty: Easy | Tags: Array, Dynamic Programming
 * https://leetcode.com/problems/pascals-triangle-ii/
 *
 * Pattern: Dynamic Programming (Reuse Previous Row)
 * Key insight: Build rows iteratively from the previous one; each interior element is the sum of the two above it. The whole triangle is built here for clarity (an O(k) rolling-row version is possible).
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(N^2) - Builds the entire triangle
 *
 * Edge Cases Handled: rowIndex = 0 (single 1), rowIndex = 1, sum values exceeding single digit (no cap)
 */
class PascalsTriangleIi {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> Fir = new ArrayList<>();
        Fir.add(1);
        res.add(Fir);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prev = res.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(prev.get(j) + prev.get(j + 1));
            }

            row.add(1);
            res.add(row);
        }
        return res.get(rowIndex);
    }
}
