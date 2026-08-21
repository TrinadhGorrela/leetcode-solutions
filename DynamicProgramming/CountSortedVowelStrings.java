/**
 * 1641. Count Sorted Vowel Strings
 * Difficulty: Medium | Tags: Math, Dynamic Programming, Combinatorics
 * https://leetcode.com/problems/count-sorted-vowel-strings/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(N) - Inner loop is bounded by a constant (5 vowels)
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CountSortedVowelStrings {
    public int countVowelStrings(int n) {
        if (n == 1) {
            return 5;
        }

        int[][] dp = new int[n + 1][5];

        for (int i = 0; i < 5; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][4] = 1;
            for (int j = 3; j >= 0; j--) {
                dp[i][j] = dp[i][j + 1] + dp[i - 1][j];
            }
        }

        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += dp[n][i];
        }

        return res;
    }
}
