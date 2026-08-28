/**
 * 1051. Height Checker
 * Difficulty: Easy | Tags: Array, Sorting, Counting Sort, Bubble Sort
 * https://leetcode.com/problems/height-checker/
 *
 * Pattern: Sorting (Comparison)
 * Key insight: Clone and sort the heights, then count positions where the sorted order differs from the original to get the number of out-of-place students.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(N) - Allocates a cloned array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class HeightChecker {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] arr = heights.clone();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) {
                res++;
            }
        }
        return res;
    }
}
