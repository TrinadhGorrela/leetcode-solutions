/**
 * 905. Sort Array By Parity
 * Difficulty: Easy | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/sort-array-by-parity/
 *
 * Pattern: In-place Partition (Bubble-Style Shift)
 * Key insight: Slide each even number left to its correct position. A two-pointer single-swap solution is more efficient, but this shifting implementation is also correct.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time (Suboptimal approach)
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: all odd / all even, single element, zeros (even), negative even/odd values
 */
class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int right = i;
                while (right != left) {
                    int temp = nums[right];
                    nums[right] = nums[right - 1];
                    nums[right - 1] = temp;
                    right--;
                }
                left++;
            }
        }
        return nums;
    }
}
