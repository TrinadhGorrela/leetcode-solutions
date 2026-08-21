/**
 * 1470. Shuffle the Array
 * Difficulty: Easy | Tags: Array
 * https://leetcode.com/problems/shuffle-the-array/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates the result array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int j = 1;
        for (int i = 0; i < n; i++) {
            res[i + i] = nums[i];
            res[i + j] = nums[i + n];
            j++;
        }
        return res;
    }
}
