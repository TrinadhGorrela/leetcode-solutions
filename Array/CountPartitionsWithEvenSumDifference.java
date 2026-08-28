/**
 * 3432. Count Partitions with Even Sum Difference
 * Difficulty: Easy | Tags: Array, Math, Prefix Sum
 * https://leetcode.com/problems/count-partitions-with-even-sum-difference/
 *
 * Pattern: Prefix Sum + Math
 * Key insight: Compute the total sum once; for each valid split, the right side is total - leftSum, so the difference (leftSum - rightSum) can be checked for evenness in O(1).
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
