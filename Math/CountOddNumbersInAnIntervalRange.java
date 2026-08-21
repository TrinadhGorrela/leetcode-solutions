/**
 * 1523. Count Odd Numbers in an Interval Range
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        int l = low / 2;
        int h = (high + 1) / 2;

        return h - l;
    }
}
