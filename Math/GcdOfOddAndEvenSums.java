/**
 * 3658. GCD of Odd and Even Sums
 * Difficulty: Easy | Tags: Math, Number Theory
 * https://leetcode.com/problems/gcd-of-odd-and-even-sums/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(log N) - Logarithmic Euclidean GCD algorithm
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class GcdOfOddAndEvenSums {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = n * (n + 1);
        int sumOdd = n * n;
        return gcd(sumEven, sumOdd);
    }

    public static int gcd(int s, int t) {
        while (t != 0) {
            int temp = t;
            t = s % t;
            s = temp;
        }
        return s;
    }
}
