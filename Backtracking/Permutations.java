/**
 * 46. Permutations
 * Difficulty: Medium | Tags: Array, Backtracking
 * https://leetcode.com/problems/permutations/
 *
 * Pattern: Backtracking (Permutation)
 * Key insight: Build permutations by appending any not-yet-used number at each step, using a contains() guard to avoid reusing elements.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(N * N!) - Holds all permutations
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class Permutations {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    per(new ArrayList<>(), nums, res);
    return res;
  }

  public void per(List<Integer> sub, int[] nums, List<List<Integer>> res) {
    if (sub.size() == nums.length) {
      res.add(new ArrayList<>(sub));
      return;
    }
    for (int i : nums) {
      if (sub.contains(i))
        continue;
      sub.add(i);
      per(sub, nums, res);
      sub.remove(sub.size() - 1);
    }
  }
}
