/**
 * 29. Divide Two Integers
 * Difficulty: Medium | Tags: Math, Bit Manipulation
 * https://leetcode.com/problems/divide-two-integers/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(log N) - Bit-shift approach evaluates 32 bit positions
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Integer overflow, division by negative numbers, zero dividend
 */
class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        int res = 0;
        
        for (int i = 31; i >= 0; i--) {
            if ((absDividend >> i) >= absDivisor) {
                res += (1 << i);
                absDividend -= (absDivisor << i);
            }
        }
        
        return isNegative ? -res : res;
    }
}
