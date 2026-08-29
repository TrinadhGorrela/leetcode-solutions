/**
 * 229. Majority Element II
 * Difficulty: Medium | Tags: Array, Hash Table, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
 * https://leetcode.com/problems/majority-element-ii/
 *
 * Pattern: Hash Map (Counting)
 * Key insight: Count frequencies and collect every element whose count is strictly greater than n/3 (there can be at most two such elements).
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: single element, no element exceeds n/3 (empty result), exactly two majority elements, small arrays (n<3)
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
