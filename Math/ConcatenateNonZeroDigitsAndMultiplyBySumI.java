/**
 * 3754. Concatenate Non-Zero Digits and Multiply by Sum I
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/
 *
 * Pattern: Digit Manipulation (Reversal + Sum)
 * Key insight: Reverse the digits to restore their original order and sum them; rebuild a number skipping zero digits, then return the product of that number and the digit sum.
 *
 * Time Complexity: O(log N) - Processes digits of the number
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: digits equal to zero (dropped during reconstruction), numbers ending in zero (reversal produces leading zeros), result kept in long to avoid overflow
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
