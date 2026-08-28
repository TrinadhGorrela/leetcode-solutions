/**
 * 3005. Count Elements With Maximum Frequency
 * Difficulty: Easy | Tags: Array, Hash Table, Counting
 * https://leetcode.com/problems/count-elements-with-maximum-frequency/
 *
 * Pattern: Hash Map (Counting)
 * Key insight: Count frequencies of all elements, track the maximum frequency, then sum the counts of all elements attaining that maximum.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > max)
                max = map.get(i);
        }
        for (int i : nums) {
            if (map.get(i) == max)
                count = count + 1;
        }
        return count;
    }
}
