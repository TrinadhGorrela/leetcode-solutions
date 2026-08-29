/**
 * 1480. Running Sum of 1d Array
 * Difficulty: Easy | Tags: Array, Prefix Sum
 * https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Pattern: Prefix Sum (In-place)
 * Key insight: Accumulate a running total and overwrite each element with the cumulative sum up to that point.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: single element, negative values, zeros
 */
class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
