/**
 * 1863. Sum of All Subset XOR Totals
 * Difficulty: Easy | Tags: Array, Math, Backtracking, Bit Manipulation, Combinatorics, Enumeration
 * https://leetcode.com/problems/sum-of-all-subset-xor-totals/
 *
 * Pattern: Backtracking (Enumerate Subsets)
 * Key insight: Enumerate every subset, compute the XOR of each, and add the totals; the recursion explores the full subset space.
 *
 * Time Complexity: O(N * 2^N) - Enumerates all subsets and XORs each
 * Space Complexity: O(N * 2^N) - Stores every subset in the result list (can be O(N) with a running sum instead)
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SumOfAllSubsetXorTotals {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, res, new ArrayList<>(), 0);
        int ans = 0;

        for (List<Integer> list : res) {
            int sum = 0;
            for (int i : list) {
                sum ^= i;
            }
            ans += sum;
        }
        return ans;
    }

    public static void solve(int[] nums, List<List<Integer>> res, List<Integer> temp, int st) {
        res.add(new ArrayList<>(temp));
        if (st == nums.length) {
            return;
        }

        for (int i = st; i < nums.length; i++) {
            temp.add(nums[i]);
            solve(nums, res, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
