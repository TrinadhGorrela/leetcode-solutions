/**
 * 912. Sort an Array
 * Difficulty: Medium | Tags: Array, Divide and Conquer, Sorting, Heap (Priority Queue), Merge Sort, Bucket Sort, Radix Sort, Counting Sort
 * https://leetcode.com/problems/sort-an-array/
 *
 * Pattern: Merge Sort (Divide & Conquer)
 * Key insight: Recursively split the array in half and merge sorted halves into a temporary array, copying the merged run back in place.
 *
 * Time Complexity: O(N log N) - Merge sort is O(N log N)
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: single element, already sorted, reverse-sorted, all equal (no swaps), negative values
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
