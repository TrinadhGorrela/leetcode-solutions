/**
 * 3536. Maximum Product of Two Digits
 * Difficulty: Easy | Tags: Math, Sorting
 * https://leetcode.com/problems/maximum-product-of-two-digits/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
