/**
 * 1005. Maximize Sum Of Array After K Negations
 * Difficulty: Easy | Tags: Array, Greedy, Sorting
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
