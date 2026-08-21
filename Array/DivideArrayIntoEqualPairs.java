/**
 * 2206. Divide Array Into Equal Pairs
 * Difficulty: Easy | Tags: Array, Hash Table, Bit Manipulation, Counting
 * https://leetcode.com/problems/divide-array-into-equal-pairs/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        if (nums.length % 2 != 0) {
            return false;
        }
        for (int i : nums) {
            res.put(i, res.getOrDefault(i, 0) + 1);
        }
        for (int count : res.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
