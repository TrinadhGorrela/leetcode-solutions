/**
 * 26. Remove Duplicates from Sorted Array
 * Difficulty: Easy | Tags: Array, Two Pointers
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
       int k=1;
       for(int i=1;i<nums.length;i++)
       {       
            if(nums[i]!=nums[i-1])
            {
                nums[k]=nums[i];
                k++;
            }
       }
       return k;
    }
}
