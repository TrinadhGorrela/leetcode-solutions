/**
 * 520. Detect Capital
 * Difficulty: Easy | Tags: String
 * https://leetcode.com/problems/detect-capital/
 *
 * Pattern: Character Case Counting
 * Key insight: Accepted capitalizations are: all upper, all lower, or only the first letter upper; count uppercase letters and check these conditions.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        if (word.length() == count || count == 0) {
            return true;
        } else if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        } else {
            return false;
        }
    }
}
