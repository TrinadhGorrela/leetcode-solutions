/**
 * 650. 2 Keys Keyboard
 * Difficulty: Medium | Tags: Math, Dynamic Programming
 * https://leetcode.com/problems/2-keys-keyboard/
 *
 * Pattern: Prime Factorization (Greedy Copy Count)
 * Key insight: The minimal operations equal the sum of the prime factors of n (with multiplicity), because each paste block corresponds to a factor added to the running length.
 *
 * Time Complexity: O(√N) - Trial division prime factorization loop
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */

class TwoKeysKeyboard {
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
