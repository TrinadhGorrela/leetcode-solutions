/**
 * 136. Single Number
 * Difficulty: Easy | Tags: Array, Bit Manipulation
 * https://leetcode.com/problems/single-number/
 *
 * Pattern: Bit Manipulation (XOR)
 * Key insight: XORing every element cancels out pairs (x XOR x = 0), leaving the single number that appears only once.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: single element, negative values, zero, value appearing as the lone element
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
