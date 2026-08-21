/**
 * 396. Rotate Function
 * Difficulty: Medium | Tags: Array, Math, Dynamic Programming
 * https://leetcode.com/problems/rotate-function/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        long max = 0;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max += nums[i] * i;
            sum += nums[i];
        }

        long prev = max;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            prev = prev + sum - (long) n * nums[n - i];
            max = Math.max(max, prev);

        }
        return (int) max;
    }
}
