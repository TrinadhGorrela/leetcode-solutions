/**
 * 3432. Count Partitions with Even Sum Difference
 * Difficulty: Easy | Tags: Array, Math, Prefix Sum
 * https://leetcode.com/problems/count-partitions-with-even-sum-difference/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CountPartitionsWithEvenSumDifference {
    public int countPartitions(int[] nums) {
        int leftSum = 0, rightSum = 0, even = 0;
        long total = 0;
        for (int i : nums) {
            total = total + i;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum = leftSum + nums[i];
            rightSum = (int) (total - leftSum);
            if ((leftSum - rightSum) % 2 == 0)
                even++;
        }
        return even;
    }
}
