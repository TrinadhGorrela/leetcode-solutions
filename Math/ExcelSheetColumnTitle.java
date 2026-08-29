/**
 * 168. Excel Sheet Column Title
 * Difficulty: Easy | Tags: Math, String
 * https://leetcode.com/problems/excel-sheet-column-title/
 *
 * Pattern: Base-26 Encoding (1-indexed Alphabet)
 * Key insight: Repeatedly extract (col-1) % 26 as a letter, using col-1 to handle A=1 treating the columns as a 1-based base-26 system, then reverse the built string.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates memory for string processing
 *
* Edge Cases Handled: col = 1 (single letter A), exact multiples of 26 (the Z boundary), rollover beyond one letter (e.g., 26 -> Z, 27 -> AA)
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
