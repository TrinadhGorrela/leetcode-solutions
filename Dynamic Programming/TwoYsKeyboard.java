/**
 * 650. 2 Keys Keyboard
 * Difficulty: Medium | Tags: Math, Dynamic Programming
 * https://leetcode.com/problems/2-keys-keyboard/
 *
 * Pattern: Prime Factorization
 * Key insight: Every number n can be decomposed into its prime factors. The minimum steps to produce n 'A's is the sum of those prime factors — each prime factor p requires exactly p operations (one copy + (p-1) pastes). For example, 9 = 3*3 needs 3+3 = 6 steps. Trial division from 2 upward finds and sums all prime factors.
 *
 * Time Complexity: O(sqrt(n)) - Trial division only needs to check factors up to sqrt(n)
 * Space Complexity: O(1) - Only scalar variables used; no auxiliary data structures
 *
 * * Edge Cases Handled: n = 1 returns 0 (already have one 'A'); prime numbers (factor sum equals n itself); powers of a single prime; n = 2 returns 2
 */
// class TwoYsKeyboard {
//     public int minSteps(int n) {

//         if (n == 1) {
//             return 0;
//         }

//         if (n == 2 || n == 3) {
//             return n;
//         }

//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, Integer.MAX_VALUE);
//         dp[2] = 2;
//         dp[3] = 3;

//         for (int i = 4; i <= n; i++) {
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     dp[i] = Math.min(dp[i], dp[j] + i / j);
//                 }
//             }
//             if (dp[i] == Integer.MAX_VALUE) {
//                 dp[i] = i;
//             }
//         }

//         return dp[n];
//     }
// }

class Solution {
    public int minSteps(int n) {
        int steps = 0;
        int factors = 2;

        while (n > 1) {
            while (n % factors == 0) {
                steps += factors;
                n /= factors;
            }
            factors++;
        }
        return steps;
    }
}
