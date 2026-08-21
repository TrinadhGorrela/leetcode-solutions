/**
 * 1929. Concatenation of Array
 * Difficulty: Easy | Tags: Array, Simulation
 * https://leetcode.com/problems/concatenation-of-array/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates the result array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[n + i] = nums[i];
        }
        return ans;
    }
}
