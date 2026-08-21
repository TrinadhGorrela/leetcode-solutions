/**
 * 905. Sort Array By Parity
 * Difficulty: Easy | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/sort-array-by-parity/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time (Suboptimal approach)
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
