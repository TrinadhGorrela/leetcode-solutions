/**
 * 1470. Shuffle the Array
 * Difficulty: Easy | Tags: Array
 * https://leetcode.com/problems/shuffle-the-array/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
