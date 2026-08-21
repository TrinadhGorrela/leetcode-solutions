/**
 * 50. Pow(x, n)
 * Difficulty: Medium | Tags: Math, Recursion
 * https://leetcode.com/problems/powx-n/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
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
