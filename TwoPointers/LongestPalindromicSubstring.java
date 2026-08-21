/**
 * 5. Longest Palindromic Substring
 * Difficulty: Medium | Tags: Two Pointers, String, Dynamic Programming, Manacher
 * https://leetcode.com/problems/longest-palindromic-substring/
 *
 * Pattern: Two Pointers
 * Key insight: Systematically processes the input relying on two pointers principles.
 *
 * Time Complexity: O(N^2) - Explores palindromes centered at each index
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LongestPalindromicSubstring {

    public static int helper(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public String longestPalindrome(String s) {
        int st = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = helper(i, i, s);
            int len2 = helper(i, i + 1, s);
            int len = Math.max(len1, len2);
            if (len > end - st) {
                st = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(st, end + 1);
    }
}
