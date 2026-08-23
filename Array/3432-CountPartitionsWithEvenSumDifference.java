/**
 * 3432. Count Partitions with Even Sum Difference
 * Difficulty: Easy | Tags: Array, Math, Prefix Sum
 * https://leetcode.com/problems/count-partitions-with-even-sum-difference/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class CountPartitionsWithEvenSumDifference {
    public int countPartitions(int[] nums) {
        int leftSum = 0, rightSum = 0, even = 0;
        long total = 0;
        for (int i : nums) {
            total = total + i;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum = leftSum + i;
            rightSum = (int) (total - leftSum);
            if ((leftSum - rightSum) % 2 == 0)
                even++;
        }
        return even;
    }
}
