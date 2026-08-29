/**
 * 1523. Count Odd Numbers in an Interval Range
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 *
 * Pattern: Arithmetic Formula (Count Within Range)
 * Key insight: The count of odd numbers up to x is (x+1)/2; subtracting the count up to low-1 gives the number of odds within [low, high].
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: low == high, even or odd bounds at either end, low or high equal to 0
 */
class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        int l = low / 2;
        int h = (high + 1) / 2;

        return h - l;
    }
}
