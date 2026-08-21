/**
 * 650. 2 Keys Keyboard
 * Difficulty: Medium | Tags: Math, Dynamic Programming
 * https://leetcode.com/problems/2-keys-keyboard/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
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
