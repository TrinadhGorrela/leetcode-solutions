/**
 * 2413. Smallest Even Multiple
 * Difficulty: Easy | Tags: Math, Number Theory
 * https://leetcode.com/problems/smallest-even-multiple/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if (n % 2 != 0) {
            return n*2;
        }
        return n;
    }
}
