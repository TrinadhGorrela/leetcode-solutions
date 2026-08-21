/**
 * 31. Next Permutation
 * Difficulty: Medium | Tags: Array, Two Pointers
 * https://leetcode.com/problems/next-permutation/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Two passes over the array to find pivot and reverse elements
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                int max = pivot + 1;
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (nums[pivot] < nums[j]) {
                        max = j;
                        break;
                    }
                }

                int temp1 = nums[pivot];
                nums[pivot] = nums[max];
                nums[max] = temp1;

                int left = pivot + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int temp2 = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp2;
                    left++;
                    right--;
                }
                break;
            }
        }
        if (pivot == -1) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int temp3 = nums[left];
                nums[left] = nums[right];
                nums[right] = temp3;
                left++;
                right--;
            }
        }

    }
}
