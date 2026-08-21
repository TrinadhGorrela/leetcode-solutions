/**
 * 462. Minimum Moves to Equal Array Elements II
 * Difficulty: Medium | Tags: Array, Math, Sorting
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MinimumMovesToEqualArrayElementsIi {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            res += Math.abs(nums[i] - mid);
        }

        return res;
    }
}
