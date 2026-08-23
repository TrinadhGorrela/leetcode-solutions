/**
 * 3345. Smallest Divisible Digit Product I
 * Difficulty: Easy | Tags: Math, Enumeration
 * https://leetcode.com/problems/smallest-divisible-digit-product-i/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
