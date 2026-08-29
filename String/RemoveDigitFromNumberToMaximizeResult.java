/**
 * 2259. Remove Digit From Number to Maximize Result
 * Difficulty: Easy | Tags: String, Greedy, Enumeration
 * https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
 *
 * Pattern: Enumeration (All Removal Positions)
 * Key insight: Try removing the digit at every matching index, building each candidate string and keeping the lexicographically greatest via compareTo.
 *
 * Time Complexity: O(N^2) - Substring operations inside the loop
 * Space Complexity: O(N) - Allocates new strings inside the loop
 *
 * Edge Cases Handled: Digit at start or end, multiple occurrences of the digit, all characters equal to digit, candidates compared lexicographically
 */
class RemoveDigitFromNumberToMaximizeResult {
    public String removeDigit(String number, char digit) {
        String max = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String current = number.substring(0, i) + number.substring(i + 1);
                if (current.compareTo(max) > 0) {
                    max = current;
                }
            }
        }
        return max;
    }
}
