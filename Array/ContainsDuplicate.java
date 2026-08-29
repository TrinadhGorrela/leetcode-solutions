/**
 * 217. Contains Duplicate
 * Difficulty: Easy | Tags: Array, Hash Table, Sorting
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Pattern: Hash Set
 * Key insight: Insert each element into a set; if an element is already present before insertion, a duplicate exists.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: single element, no duplicates, all duplicates, negative values
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
