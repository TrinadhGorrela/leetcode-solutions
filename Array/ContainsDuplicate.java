/**
 * 217. Contains Duplicate
 * Difficulty: Easy | Tags: Array, Hash Table, Sorting
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int num : nums) {
            if (res.contains(num)) {
                return true;
            }
            res.add(num);
        }
        return false;
    }
}
