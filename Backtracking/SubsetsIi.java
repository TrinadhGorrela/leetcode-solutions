/**
 * 90. Subsets II
 * Difficulty: Medium | Tags: Array, Backtracking, Bit Manipulation
 * https://leetcode.com/problems/subsets-ii/
 *
 * Pattern: Backtracking (Sort + Skip Duplicates)
 * Key insight: Sort first, then skip consecutive duplicate values at the same recursion level so that each distinct subset is generated exactly once.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(N * 2^N) - Holds all subsets
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SubsetsIi {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int st, int[] nums, List<Integer> subset, List<List<Integer>> res) {

        res.add(new ArrayList<>(subset));
        for (int i = st; i < nums.length; i++) {
            if (i > st && nums[i] == nums[i - 1])
                continue;
            subset.add(nums[i]);
            backtrack(i + 1, nums, subset, res);
            subset.remove(subset.size() - 1);
        }
    }
}
