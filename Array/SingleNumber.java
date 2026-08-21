/**
 * 136. Single Number
 * Difficulty: Easy | Tags: Array, Bit Manipulation
 * https://leetcode.com/problems/single-number/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SingleNumber {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int i=0;i<nums.length;i++)
        {          
           r = r ^ nums[i];
        }
        return r;
    }
}
