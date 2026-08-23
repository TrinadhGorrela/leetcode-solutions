/**
 * 3754. Concatenate Non-Zero Digits and Multiply by Sum I
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class ConcatenateNonZeroDigitsAndMultiplyBySumI {
    public long sumAndMultiply(int n) {
        int sum = 0;
        long num = n;
        long d = 0;
        while (num != 0) {
            long l = num % 10;
            d = d * 10 + l;
            sum += l;
            num /= 10;
        }
        num = 0;
        while (d != 0) {
            long l = d % 10;
            if (l != 0) {
                num = num * 10 + l;
            }
            d /= 10;
        }
        return num * sum;
    }
}
