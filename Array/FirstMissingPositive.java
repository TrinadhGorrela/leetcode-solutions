/**
 * 41. First Missing Positive
 * Difficulty: Hard | Tags: Array, Hash Table
 * https://leetcode.com/problems/first-missing-positive/
 *
 * Pattern: Hash Set
 * Key insight: Store all elements in a set, then scan upward from 1 to find the first positive integer not present. (Suboptimal O(N) space; an O(1)-space in-place marking solution also exists.)
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly (Optimal time, but suboptimal O(N) space approach)
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int small = 1;

        for (int i : nums) {
            set.add(i);
        }

        while (set.contains(small)) {
            small++;
        }

        return small;
    }
}
