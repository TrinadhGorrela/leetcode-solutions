/**
 * 628. Maximum Product of Three Numbers
 * Difficulty: Easy | Tags: Array, Math, Sorting
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 *
 * Pattern: Sorting + Math
 * Key insight: After sorting, the maximum product of three numbers is the larger of the two largest positives times the third largest, or the two smallest (most negative) times the largest positive.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int mul1 = nums[0] * nums[1] * nums[nums.length - 1];
        int mul2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return Math.max(mul1, mul2);
    }
}
