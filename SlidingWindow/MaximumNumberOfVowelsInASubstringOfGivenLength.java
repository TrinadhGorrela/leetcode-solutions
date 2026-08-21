/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 * Difficulty: Medium | Tags: String, Sliding Window
 * https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 *
 * Pattern: String
 * Key insight: Systematically processes the input relying on string principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            if ("aeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        max = count;

        for (int i = k; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i - k)) != -1) {
                count--;
            }
            if ("aeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
