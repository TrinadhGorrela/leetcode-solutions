/**
 * 977. Squares of a Sorted Array
 * Difficulty: Easy | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int a = 0;
        for (int i : nums) {
            res[a] = i * i;
            a++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (res[i] > res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }

        return res;
    }
}
