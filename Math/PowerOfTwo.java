/**
 * 231. Power of Two
 * Difficulty: Easy | Tags: Math, Bit Manipulation, Recursion
 * https://leetcode.com/problems/power-of-two/
 *
 * Pattern: Bit Manipulation (n & (n-1))
 * Key insight: A positive power of two has exactly one set bit, so n & (n-1) clears that sole bit and yields 0.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
     return n > 0 && (n & (n - 1)) == 0;
    }
}