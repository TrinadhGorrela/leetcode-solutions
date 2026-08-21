/**
 * 229. Majority Element II
 * Difficulty: Medium | Tags: Array, Hash Table, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
 * https://leetcode.com/problems/majority-element-ii/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int n = nums.length;
        for (int i : map.keySet()) {
            if (map.get(i) > n / 3) {
                res.add(i);
            }
        }
        return res;
    }
}
