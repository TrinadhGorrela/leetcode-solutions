/**
 * 209. Minimum Size Subarray Sum
 * Difficulty: Medium | Tags: Array, Binary Search, Sliding Window, Prefix Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 *
 * Pattern: Sliding Window (Variable-Length Sum)
 * Key insight: Extend the right edge growing the sum; once it reaches target, shrink from the left to find the minimal covering window while recording the shortest length found.
 *
 * Time Complexity: O(N) - Sliding window pointers only move forward
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: No subarray reaches target (returns 0), single element reaches target, whole array is the only valid window, target met exactly
 */
class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum = sum - nums[left];
                left++;
            }

        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
