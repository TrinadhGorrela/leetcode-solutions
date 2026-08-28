/**
 * 1920. Build Array from Permutation
 * Difficulty: Easy | Tags: Array, Simulation
 * https://leetcode.com/problems/build-array-from-permutation/
 *
 * Pattern: Simulation
 * Key insight: Build the result by directly mapping each index i to nums[nums[i]], since the permutation guarantees valid indices.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates the result array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class BuildArrayFromPermutation {
  public int[] buildArray(int[] nums) {
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[nums[i]];
    }
    return ans;
  }
}
