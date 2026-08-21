/**
 * 645. Set Mismatch
 * Difficulty: Easy | Tags: Array, Hash Table, Bit Manipulation, Sorting
 * https://leetcode.com/problems/set-mismatch/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int total=0;
        for (int i : nums) {
            if (set.contains(i))
                res[0] = i;
            set.add(i);
            total=total+i;
        }
        int n = nums.length;
        int act = n * (n + 1) / 2;

        res[1] = act - total + res[0];
        return res;
    }
}
