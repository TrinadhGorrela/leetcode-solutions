/**
 * 53. Maximum Subarray
 * Difficulty: Medium | Tags: Array, Divide and Conquer, Dynamic Programming
 * https://leetcode.com/problems/maximum-subarray/
 *
 * Pattern: Kadane's Algorithm (DP)
 * Key insight: At each position, extend the best running subarray (or start a new one) and keep the global maximum: current = max(nums[i], current + nums[i]).
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: single element, all negative numbers, all positive numbers, all equal, zero included
 */
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            max = Math.max(curSum, max);
        }
        return max;
    }
}
