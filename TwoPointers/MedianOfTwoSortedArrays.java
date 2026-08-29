/**
 * 4. Median of Two Sorted Arrays
 * Difficulty: Hard | Tags: Array, Binary Search, Divide and Conquer
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * Pattern: Merge (Two Pointers)
 * Key insight: Merge the two sorted arrays into one and pick the middle element(s), handling both odd and even total lengths. (Suboptimal O(m+n); a binary-search O(log(m+n)) partition approach is ideal.)
 *
 * Time Complexity: O(m+n) - Merge-based implementation (Suboptimal approach)
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: empty first / second array, one array fully smaller, equal elements across arrays, odd and even combined lengths
 */
class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            res[k++] = nums1[i++];
        }
        while (j < n2) {
            res[k++] = nums2[j++];
        }
        int t = res.length;
        if (t % 2 != 0) {
            return res[t / 2 ];
        }
        else{
            return (double)(res[t/2-1]+res[t/2])/2;
        }
    }
}
