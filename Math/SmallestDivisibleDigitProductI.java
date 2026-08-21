/**
 * 3345. Smallest Divisible Digit Product I
 * Difficulty: Easy | Tags: Math, Enumeration
 * https://leetcode.com/problems/smallest-divisible-digit-product-i/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: Unproven (O(1) in practice) - Loop terminates quickly due to dense solution space
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SmallestDivisibleDigitProductI {
    public int smallestNumber(int n, int t) {
        while (true) {
            int temp = multiply(n);
            if (temp % t == 0) {
                return n;
            }
            n++;
        }
    }

    public static int multiply(int n) {
        int res = 1;
        while (n != 0) {
            int last = n % 10;
            res *= last;
            n /= 10;
        }
        return res;
    }
}
