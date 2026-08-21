/**
 * 39. Combination Sum
 * Difficulty: Medium | Tags: Array, Backtracking
 * https://leetcode.com/problems/combination-sum/
 *
 * Pattern: Backtracking
 * Key insight: Systematically processes the input relying on backtracking principles.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(2^N) - Holds all valid combinations
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CombinationSum {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();
        get(arr, res, 0, combi, target);
        return res;
    }

    public void get(int[] arr, List<List<Integer>> res, int in, List<Integer> combi, int target) {
        if (in == arr.length || target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(combi));
            return;
        }
        combi.add(arr[in]);
        get(arr, res, in, combi, target - arr[in]);
        combi.remove(combi.size() - 1);
        get(arr, res, in + 1, combi, target);
    }
}
