/**
 * 3658. GCD of Odd and Even Sums
 * Difficulty: Easy | Tags: Math, Number Theory
 * https://leetcode.com/problems/gcd-of-odd-and-even-sums/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
