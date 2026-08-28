/**
 * 216. Combination Sum III
 * Difficulty: Medium | Tags: Array, Backtracking
 * https://leetcode.com/problems/combination-sum-iii/
 *
 * Pattern: Backtracking (Fixed Pool)
 * Key insight: Choose k distinct numbers from 1..9 that sum to n, advancing the start index each step; record only when both the target and size constraints are met.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(C(9,k) * k) - Stores valid combinations from a fixed 1-9 pool
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CombinationSumIii {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = i + 1;
        }
        solve(nums, res, new ArrayList<>(), 0, n, k);
        return res;
    }

    public static void solve(int[] nums, List<List<Integer>> res, List<Integer> temp, int in, int tar, int k) {
        if (tar == 0) {
            if (temp.size() == k) {
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        for (int i = in; i < nums.length; i++) {
            temp.add(nums[i]);
            solve(nums, res, temp, i + 1, tar - nums[i], k);
            temp.remove(temp.size() - 1);
        }
    }
}
