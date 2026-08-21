/**
 * 168. Excel Sheet Column Title
 * Difficulty: Easy | Tags: Math, String
 * https://leetcode.com/problems/excel-sheet-column-title/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ExcelSheetColumnTitle {
    public String convertToTitle(int col) {
        StringBuilder res = new StringBuilder();

        while (col > 0) {
            int r = (col - 1) % 26;
            res.append((char) (r + 'A'));
            col = (col - 1) / 26;
        }
        return res.reverse().toString();
    }
}
