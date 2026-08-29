/**
 * 1470. Shuffle the Array
 * Difficulty: Easy | Tags: Array
 * https://leetcode.com/problems/shuffle-the-array/
 *
 * Pattern: Simulation
 * Key insight: Build the result by alternating the first half and second half elements at even and odd positions, respectively.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates the result array
 *
 * Edge Cases Handled: n = 1 (single pair), all equal values, negative values
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
