/**
 * 77. Combinations
 * Difficulty: Medium | Tags: Backtracking
 * https://leetcode.com/problems/combinations/
 *
 * Pattern: Backtracking (Choose/Skip)
 * Key insight: Recursively build combinations of size k, always choosing elements after the current index to preserve order and avoid duplicates.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(C(n,k) * k) - Holds all combinations
 *
 * Edge Cases Handled: k = 1, k = n (single combination), single element, no combination shorter than k (base case guard)
 */
class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        List<List<Integer>> res = new ArrayList<>();
        combinations(res, new ArrayList<>(), 0, nums, k);
        return res;
    }

    public static void combinations(List<List<Integer>> res, List<Integer> temp, int st, int[] nums,int k) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = st; i < nums.length; i++) {
            temp.add(nums[i]);
            combinations(res, temp, i + 1, nums, k);
            temp.remove(temp.size() - 1);
        }
    }
}
