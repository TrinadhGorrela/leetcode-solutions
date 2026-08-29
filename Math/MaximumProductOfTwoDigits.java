/**
 * 3536. Maximum Product of Two Digits
 * Difficulty: Easy | Tags: Math, Sorting
 * https://leetcode.com/problems/maximum-product-of-two-digits/
 *
 * Pattern: Top-Two Digit Scan (Runner-up Tracking)
 * Key insight: Extract digits via mod 10 while tracking the two largest; the answer is their product.
 *
 * Time Complexity: O(log n) - Number of digits is proportional to log10(n)
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: single-digit number (second largest stays 0), repeated identical digits (e.g., 999 -> 9*9), digit encountered equal to current max shifts the runner-up
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
