/**
 * 2259. Remove Digit From Number to Maximize Result
 * Difficulty: Easy | Tags: String, Greedy, Enumeration
 * https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
