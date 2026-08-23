/**
 * 1967. Number of Strings That Appear as Substrings in Word
 * Difficulty: Easy | Tags: Array, String
 * https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
