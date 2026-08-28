/**
 * 40. Combination Sum II
 * Difficulty: Medium | Tags: Array, Backtracking
 * https://leetcode.com/problems/combination-sum-ii/
 *
 * Pattern: Backtracking (Sorted + Skip Duplicates)
 * Key insight: Sort candidates, then at each level skip consecutive duplicates to avoid duplicate combinations, and stop early once the target is exceeded.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(2^N) - Holds all valid combinations
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CombinationSumIi {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, res, new ArrayList<>(), 0, target);
        return res;
    }

    public static void solve(int[] nums, List<List<Integer>> res, List<Integer> temp, int in, int tar) {
        if (tar == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = in; i < nums.length; i++) {
            if (i > in && nums[i] == nums[i - 1]) {
                continue;
            }

            if (tar < nums[i]) {
                break;
            }

            temp.add(nums[i]);
            solve(nums, res, temp, i + 1, tar - nums[i]);
            temp.remove(temp.size() - 1);
        }
    }
}
