/**
 * 650. 2 Keys Keyboard
 * Difficulty: Medium | Tags: Math, Dynamic Programming
 * https://leetcode.com/problems/2-keys-keyboard/
 *
 * Pattern: Prime Factorization (Greedy)
 * Key insight: The optimal strategy is to paste a block that has already been copied. The minimum number of steps
 * equals the sum of the prime factors of n—each prime factor p contributes a copy-paste pair with p pastes, building
 * the character count multiplicatively. This is optimal because a composite factorization can be decomposed into primes
 * without increasing the step count.
 *
 * Time Complexity: O(sqrt(N)) - The trial-division loop runs up to sqrt(n), dividing n whenever a factor is found.
 * Space Complexity: O(1) - Only a few integer variables are used.
 *
 * Edge Cases Handled: n == 1 returns 0 steps (no operation needed); prime n returns n (only trivial factorization);
 * all inputs including minimum and maximum valid per problem constraints.
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
