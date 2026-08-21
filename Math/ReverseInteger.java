/**
 * 7. Reverse Integer
 * Difficulty: Medium | Tags: Math
 * https://leetcode.com/problems/reverse-integer/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ReverseInteger {
    public int reverse(int x) {
        int a = x;
        int b;
        int rev = 0;

        while (x != 0) {
            b = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + b;
            x = x / 10;
        }
        return rev;
    }
}
