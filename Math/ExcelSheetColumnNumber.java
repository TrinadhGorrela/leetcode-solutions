/**
 * 171. Excel Sheet Column Number
 * Difficulty: Easy | Tags: Math, String
 * https://leetcode.com/problems/excel-sheet-column-number/
 *
 * Pattern: Base-26 Conversion
 * Key insight: Treat the column title as a base-26 number (A=1...Z=26); fold each letter into the running total with sum = sum*26 + digit.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: single-letter column (A = 1), multi-letter titles folded left with base-26 arithmetic, uppercase letters assumed
 */
class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int num = c - 64;
            sum = (sum * 26) + num;
        }
        return sum;
    }
}
