/**
 * 2574. Left and Right Sum Differences
 * Difficulty: Easy | Tags: Array, Prefix Sum
 * https://leetcode.com/problems/left-and-right-sum-differences/
 *
 * Pattern: Prefix Sum
 * Key insight: Build left and right cumulative sums for every index, then take the absolute difference between them as the result.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses prefix/suffix arrays (can be optimized to O(1) space)
 *
 * Edge Cases Handled: single element (both sums 0), negative values (absolute difference), pivot at edges
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
