/**
 * 53. Maximum Subarray
 * Difficulty: Medium | Tags: Array, Divide and Conquer, Dynamic Programming
 * https://leetcode.com/problems/maximum-subarray/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
