/**
 * 75. Sort Colors
 * Difficulty: Medium | Tags: Array, Two Pointers, Sorting, Quicksort, Bubble Sort
 * https://leetcode.com/problems/sort-colors/
 *
 * Pattern: Dutch National Flag (Three-Way Partition)
 * Key insight: Sweep with a mid pointer, swapping 0s to the left boundary and 2s to the right boundary while leaving 1s in the middle, producing a single-pass in-place sort.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Empty array, single element, all elements the same color (0s/1s/2s), already sorted array
 */
class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
}
