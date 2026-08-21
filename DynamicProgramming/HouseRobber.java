/**
 * 198. House Robber
 * Difficulty: Medium | Tags: Array, Dynamic Programming
 * https://leetcode.com/problems/house-robber/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses a DP array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int[] res = new int[nums.length];
        res[0] = nums[0];
        res[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            res[i] = Math.max(res[i - 2] + nums[i], res[i - 1]);
        }
        return res[nums.length - 1];
    }
}
