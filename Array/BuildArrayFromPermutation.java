/**
 * 1920. Build Array from Permutation
 * Difficulty: Easy | Tags: Array, Simulation
 * https://leetcode.com/problems/build-array-from-permutation/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
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
