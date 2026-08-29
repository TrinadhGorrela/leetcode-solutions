/**
 * 172. Factorial Trailing Zeroes
 * Difficulty: Medium | Tags: Math
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 *
 * Pattern: Counting Factor Multiples (Legendre's formula)
 * Key insight: Trailing zeros come from factors of 10 = 2*5; since 5 is the scarcer factor, sum floor(n/5) + floor(n/25) + ... by repeatedly dividing n by 5.
 *
 * Time Complexity: O(log5 N) - Logarithmic division by 5
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: n = 0 (loop skipped, zero result), n < 5 (no factor of 5 contributes trailing zeros)
 */
class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            res += n / 5;
            n = n / 5;
        }
        return res;
    }
}
