/**
 * 1143. Longest Common Subsequence
 * Difficulty: Medium | Tags: String, Dynamic Programming, Longest Common Subsequence
 * https://leetcode.com/problems/longest-common-subsequence/
 *
 * Pattern: Dynamic Programming (2D LCS Table)
 * Key insight: If characters match extend 1 + the diagonal result; otherwise take the better of the two adjacent subproblems; the bottom-right cell holds the LCS length.
 *
 * Time Complexity: O(m*n) - Dynamic programming over two strings
 * Space Complexity: O(m*n) - Allocates a 2D array for memoization scaling with input sizes
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] memo = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    memo[i][j] = 1 + memo[i - 1][j - 1];
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }
        return memo[text1.length()][text2.length()];
    }
}
