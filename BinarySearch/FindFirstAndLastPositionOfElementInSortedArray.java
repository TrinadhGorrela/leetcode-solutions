/**
 * 34. Find First and Last Position of Element in Sorted Array
 * Difficulty: Medium | Tags: Array, Binary Search
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * Pattern: Two Binary Searches
 * Key insight: The core trick is to adapt binary search to find the first and last occurrences by continuing the search on one side even after a match is found.
 *
 * Time Complexity: O(log n) - Two binary searches on array of size n.
 * Space Complexity: O(1) - Constant extra space used for variables.
 *
 * Edge Cases Handled: target not found (both indices -1), single element, single occurrence (first == last), target at boundaries
 */
class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { findIndex(nums, target, true), findIndex(nums, target, false) };
    }

    private static int findIndex(int[] nums, int target, boolean isLeft) {
        int left = 0;
        int right = nums.length - 1;
        int in = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                in = mid;
                if (isLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return in;
    }
}
