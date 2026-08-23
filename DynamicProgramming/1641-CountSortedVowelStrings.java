/**
 * 1641. Count Sorted Vowel Strings
 * Difficulty: Medium | Tags: Math, Dynamic Programming, Combinatorics
 * https://leetcode.com/problems/count-sorted-vowel-strings/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
