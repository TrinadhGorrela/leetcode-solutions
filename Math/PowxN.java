/**
 * 50. Pow(x, n)
 * Difficulty: Medium | Tags: Math, Recursion
 * https://leetcode.com/problems/powx-n/
 *
 * Pattern: Exponentiation by Squaring (Fast Power)
 * Key insight: Square the base each step and fold it into the result only for set bits of |n|; invert the base for negative exponents and use long for N to handle Integer.MIN_VALUE.
 *
 * Time Complexity: O(log N) - Logarithmic fast exponentiation
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class PowxN {
    public double myPow(double x, int n) {
        double res = 1;
        long N = n;

        if (n < 0) {
            x = 1 / x;
            N = -N;
        }
        while (N > 0) {
            if (N % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            N = N / 2;
        }
        return res;
    }
}
