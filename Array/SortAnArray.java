/**
 * 912. Sort an Array
 * Difficulty: Medium | Tags: Array, Divide and Conquer, Sorting, Heap (Priority Queue), Merge Sort, Bucket Sort, Radix Sort, Counting Sort
 * https://leetcode.com/problems/sort-an-array/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log N) - Merge sort is O(N log N)
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SortAnArray {
    public int[] sortArray(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    public static int[] divide(int[] nums, int st, int end) {
        if (st >= end) {
            return nums;
        }

        int mid = st + (end - st) / 2;

        divide(nums, st, mid);
        divide(nums, mid + 1, end);
        return merge(nums, st, mid, end);
    }

    public static int[] merge(int[] nums, int st, int mid, int end) {
        int[] tri = new int[end - st + 1];
        int i = st;
        int j = mid + 1;
        int in = 0;

        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                tri[in] = nums[i];
                in++;
                i++;
            } else {
                tri[in] = nums[j];
                in++;
                j++;
            }
        }

        while (i <= mid) {
            tri[in] = nums[i];
            in++;
            i++;
        }

        while (j <= end) {
            tri[in] = nums[j];
            in++;
            j++;
        }

        for (int s = 0; s < tri.length; s++) {
            nums[st] = tri[s];
            st++;
        }

        return nums;
    }
}
