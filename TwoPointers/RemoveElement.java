/**
 * 27. Remove Element
 * Difficulty: Easy | Tags: Array, Two Pointers
 * https://leetcode.com/problems/remove-element/
 *
 * Pattern: Two Pointers (In-Place Overwrite)
 * Key insight: Use a write pointer; each element not equal to val is copied to the write position, compressing all other values to the front in place.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
}
