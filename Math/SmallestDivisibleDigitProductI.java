/**
 * 3345. Smallest Divisible Digit Product I
 * Difficulty: Easy | Tags: Math, Enumeration
 * https://leetcode.com/problems/smallest-divisible-digit-product-i/
 *
 * Pattern: Iterative Search (Digit Product Test)
 * Key insight: Compute the product of a number's digits and test divisibility by t, incrementing n until a valid candidate is found; the solution space is dense so it terminates quickly.
 *
 * Time Complexity: Small constant in practice - The digit product reaches a multiple of t within a few increments thanks to the dense solution space
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: digit product of 0 (multiples of 10) divisible by any t, single-digit n, candidate found immediately when n already satisfies divisibility
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
