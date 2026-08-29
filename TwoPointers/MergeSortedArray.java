/**
 * 88. Merge Sorted Array
 * Difficulty: Easy | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * Pattern: Two Pointers (Merge from the End)
 * Key insight: Fill the output from the largest position backward using pointers at the ends of both arrays, so no extra space is needed and no element is overwritten before use.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: m = 0 (only nums2), n = 0 (only nums1), equal elements, all of nums1 smaller / larger than nums2
 */
class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
    }
    while (j >= 0) {
      nums1[k--] = nums2[j--];
    }
  }
}
