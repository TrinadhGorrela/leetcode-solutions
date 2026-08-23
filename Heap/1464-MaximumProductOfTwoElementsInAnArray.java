/**
 * 1464. Maximum Product of Two Elements in an Array
 * Difficulty: Easy | Tags: Array, Sorting, Heap (Priority Queue)
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
