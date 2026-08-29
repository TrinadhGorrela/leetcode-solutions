/**
 * 26. Remove Duplicates from Sorted Array
 * Difficulty: Easy | Tags: Array, Two Pointers
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Pattern: Two Pointers (In-Place Overwrite)
 * Key insight: Walk with one index while a write pointer places each first-seen value; because the array is sorted, comparing to the previous element detects duplicates.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Single element, all duplicates (result 1), already unique values, consecutive duplicates of any value
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
