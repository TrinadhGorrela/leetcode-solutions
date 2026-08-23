/**
 * 2574. Left and Right Sum Differences
 * Difficulty: Easy | Tags: Array, Prefix Sum
 * https://leetcode.com/problems/left-and-right-sum-differences/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int sum1 = 0, sum2 = 0, n = nums.length - 1;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] res = new int[nums.length];
        for (int i = 0; i <= n; i++) {
            leftSum[i] += sum1;
            sum1 += nums[i];
            rightSum[n - i] += sum2;
            sum2 += nums[n - i];
        }
        for (int i = 0; i <= n; i++) {
            if (rightSum[i] - leftSum[i] > 0)
                res[i] = rightSum[i] - leftSum[i];
            else
                res[i] = leftSum[i] - rightSum[i];
        }
        return res;
    }
}
