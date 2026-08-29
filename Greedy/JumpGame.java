/**
 * 55. Jump Game
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Greedy
 * https://leetcode.com/problems/jump-game/
 *
 * Pattern: Greedy (Reachability via Farthest Reach)
 * Key insight: Track the farthest index reachable so far; if any position is beyond the current reach the array is unwinnable, and reaching or exceeding the last index means success.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: single element (immediately reachable), stuck at a zero (returns false), already at last index, element with jump reaching exactly the end
 */
class JumpGame {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < i)
                return false;
            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1)
                return true;
        }
        return false;
    }
}
