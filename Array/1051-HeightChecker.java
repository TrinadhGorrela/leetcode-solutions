/**
 * 1051. Height Checker
 * Difficulty: Easy | Tags: Array, Sorting, Counting Sort, Bubble Sort
 * https://leetcode.com/problems/height-checker/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
