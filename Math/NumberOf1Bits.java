/**
 * 191. Number of 1 Bits
 * Difficulty: Easy | Tags: Divide and Conquer, Bit Manipulation
 * https://leetcode.com/problems/number-of-1-bits/
 *
 * Pattern: Bit Manipulation
 * Key insight: Uses bitwise AND to count set bits iteratively.
 *
 * Time Complexity: O(1) - Loop bounded strictly by 32 bits
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: n = 0 (zero set bits), negative inputs with the sign bit set (unsigned right shift), all 32 bits scanned
 */
class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }
}
