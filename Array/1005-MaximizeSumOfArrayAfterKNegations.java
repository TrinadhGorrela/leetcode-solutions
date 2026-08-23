/**
 * 1005. Maximize Sum Of Array After K Negations
 * Difficulty: Easy | Tags: Array, Greedy, Sorting
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k != 0) {
                nums[i] *= -1;
                k--;
            }
        }

        k = k % 2;

        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        if (k == 0) {
            return sum;
        }

        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return sum - 2 * min;
    }
}
