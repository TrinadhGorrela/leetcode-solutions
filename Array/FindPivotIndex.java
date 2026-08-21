/**
 * 724. Find Pivot Index
 * Difficulty: Easy | Tags: Array, Prefix Sum
 * https://leetcode.com/problems/find-pivot-index/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses prefix/suffix arrays (can be optimized to O(1) space)
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length + 1];
        int[] rightSum = new int[nums.length + 1];

        leftSum[0] = 0;
        rightSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum[i + 1] = leftSum[i] + nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            rightSum[nums.length - i] = rightSum[nums.length - i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum[i] == rightSum[nums.length - i - 1]) {
                return i;
            }
        }
        return -1;
    }
}
