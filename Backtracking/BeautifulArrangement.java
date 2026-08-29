/**
 * 526. Beautiful Arrangement
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask
 * https://leetcode.com/problems/beautiful-arrangement/
 *
 * Pattern: Backtracking
 * Key insight: Build the arrangement position by position, pruning any candidate where the index condition (i % pos == 0 or pos % i == 0) is not satisfied, and count complete arrangements.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: n = 1 (single arrangement), no element satisfies the divisibility condition for a position (pruned)
 */
class BeautifulArrangement {
    public int countArrangement(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        int count = 0;
        List<List<Integer>> res = new ArrayList<>();
        count = solve(nums, new ArrayList<>());

        return count;
    }

    public static int solve(int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            return 1;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
                continue;
            }

            if (nums[i] % (temp.size() + 1) != 0 && (temp.size() + 1) % nums[i] != 0) {
                continue;
            }

            temp.add(nums[i]);
            count += solve(nums, temp);
            temp.remove(temp.size() - 1);
        }
        return count;
    }
}
