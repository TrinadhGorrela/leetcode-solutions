/**
 * 45. Jump Game II
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Greedy
 * https://leetcode.com/problems/jump-game-ii/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class JumpGameIi {
    public int jump(int[] nums) {
        int curr = 0;
        int max = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i >= curr) {
                jumps++;
                curr = max;
            }
        }
        return jumps;
    }
}
