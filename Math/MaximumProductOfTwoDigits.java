/**
 * 3536. Maximum Product of Two Digits
 * Difficulty: Easy | Tags: Math, Sorting
 * https://leetcode.com/problems/maximum-product-of-two-digits/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumProductOfTwoDigits {
    public int maxProduct(int n) {
        int max = 0;
        int smax = 0;
        while (n != 0) {
            int rev = n % 10;
            if (max <= rev) {
                smax = max;
                max = rev;
            } else if (smax < rev && max != rev) {
                smax = rev;
            }
            n /= 10;
        }
        return max * smax;
    }
}
