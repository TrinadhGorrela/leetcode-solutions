/**
 * 1967. Number of Strings That Appear as Substrings in Word
 * Difficulty: Easy | Tags: Array, String
 * https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(P * W) - P is number of patterns, W is word length
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                res++;
            }
        }
        return res;
    }
}
