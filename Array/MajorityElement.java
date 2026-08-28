/**
 * 169. Majority Element
 * Difficulty: Easy | Tags: Array, Hash Table, Divide and Conquer, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
 * https://leetcode.com/problems/majority-element/
 *
 * Pattern: Hash Map (Counting)
 * Key insight: Count frequencies of every element and return the one with the highest count (guaranteed to exceed n/2 by the problem definition).
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        int maxE = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxE = entry.getKey();
            }
        }

        return maxE;
    }
}
