/**
 * 39. Combination Sum
 * Difficulty: Medium | Tags: Array, Backtracking
 * https://leetcode.com/problems/combination-sum/
 *
 * Pattern: Backtracking (Unbounded Choice)
 * Key insight: Explore both taking the current element (with unlimited reuse) and skipping it, descending to the target; record combinations that exactly reach zero.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(2^N) - Holds all valid combinations
 *
 * Edge Cases Handled: single element, no valid combination (returns empty), target hit exactly (zero), single element exactly equals target
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
