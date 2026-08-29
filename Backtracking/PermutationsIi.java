/**
 * 47. Permutations II
 * Difficulty: Medium | Tags: Array, Backtracking, Sorting
 * https://leetcode.com/problems/permutations-ii/
 *
 * Pattern: Backtracking (Sorted + Skip Duplicates)
 * Key insight: Sort and use a used[] array; skip an index when it equals the previous value that was not used, preventing duplicate permutations.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(N * N!) - Holds all permutations
 *
 * Edge Cases Handled: single element, all elements identical (one unique permutation), duplicate values (deduped), no duplicates
 */
class PermutationsIi {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        per(new ArrayList<>(), nums, res, used);
        return res;
    }

    public void per(List<Integer> sub, int[] nums, List<List<Integer>> res, boolean[] used) {
        if (sub.size() == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            sub.add(nums[i]);
            per(sub, nums, res, used);
            used[i] = false;
            sub.remove(sub.size() - 1);
        }
    }
}
