/**
 * 58. Length of Last Word
 * Difficulty: Easy | Tags: String
 * https://leetcode.com/problems/length-of-last-word/
 *
 * Pattern: String
 * Key insight: Systematically processes the input relying on string principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int a = s.length() - 1;
        
        while (a >= 0 && s.charAt(a) == ' ') {
            a--;
        }
        for (int i = a; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                res++;
            }
            if (s.charAt(i) == ' ') {
                break;
            }
        }
        return res;
    }
}
