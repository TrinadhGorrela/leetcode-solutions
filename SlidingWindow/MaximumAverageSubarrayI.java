/**
 * 643. Maximum Average Subarray I
 * Difficulty: Easy | Tags: Array, Sliding Window
 * https://leetcode.com/problems/maximum-average-subarray-i/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        max = sum;
        for (int right = k; right < nums.length; right++) {
            sum = sum + nums[right] - nums[right - k];
            max = Math.max(max, sum);
        }
        return max / k;
    }
}
