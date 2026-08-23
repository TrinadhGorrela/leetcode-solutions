/**
 * 1523. Count Odd Numbers in an Interval Range
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        int l = low / 2;
        int h = (high + 1) / 2;

        return h - l;
    }
}
