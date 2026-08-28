/**
 * 1464. Maximum Product of Two Elements in an Array
 * Difficulty: Easy | Tags: Array, Sorting, Heap (Priority Queue)
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 *
 * Pattern: Single-Pass (Track Top Two)
 * Key insight: Track the largest and second-largest values in one pass, then return (max-1)*(secondMax-1) for the maximum product.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        int max = 0;
        int smax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i]) {
                smax = max;
                max = nums[i];
            } else if (smax < nums[i] && max != nums[i]) {
                smax = nums[i];
            }
        }
        return (max - 1) * (smax - 1);
    }
}
